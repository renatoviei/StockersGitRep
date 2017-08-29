package GUISwing;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Negocio.Beans.AdmEntity;;

public class TelaCadastroAdm extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private JTextField caixaLogin = new JTextField(50);
	private JPasswordField caixaSenha = new JPasswordField(50);

	JButton botaoConfirma = new JButton("Cadastrar");
	JButton botaoVolta = new JButton("Voltar");

	ImageIcon imagem = new ImageIcon(getClass().getResource("cachorro-e-gato-podem-viver-juntos.jpg"));

	JLabel label = new JLabel(imagem);

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoConfirma) {
			if (caixaLogin.getText().equals("") || caixaSenha.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos");
			} else if (caixaLogin.getText().equals("stockers") && caixaSenha.getText().equals("123")) {
				AdmEntity adm = new AdmEntity();
				adm.setLogin(caixaLogin.getText());
				adm.setSenha(caixaSenha.getText());

				JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso");

				TelaMenuInicial menuInicial = new TelaMenuInicial();
				menuInicial.setResizable(false);
				menuInicial.setLocationRelativeTo(null);
				menuInicial.setVisible(true);
				dispose();

			} else
				JOptionPane.showMessageDialog(null, "Administrador invalido");

		} else {
			TelaC1 telaC1 = new TelaC1();
			telaC1.setResizable(false);
			telaC1.setLocationRelativeTo(null);
			telaC1.setVisible(true);
			dispose();

		}

	}

	public TelaCadastroAdm() {

		botaoConfirma.addActionListener(this);
		botaoVolta.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();

		add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.BOLD, 16);

		JLabel login = new JLabel("Crie seu login: ");
		login.setFont(grande);
		login.setBounds(new Rectangle(20, 100, 120, 17));
		painelPrincipal.add(login);

		caixaLogin.setBounds(new Rectangle(150, 100, 120, 17));
		painelPrincipal.add(caixaLogin);

		JLabel senha = new JLabel("Crie sua senha: ");
		senha.setFont(grande);
		senha.setBounds(new Rectangle(20, 150, 120, 17));
		painelPrincipal.add(senha);

		label.setBounds(0, 0, 500, 400);
		caixaSenha.setBounds(new Rectangle(150, 150, 120, 17));
		painelPrincipal.add(caixaSenha);

		botaoConfirma.setBounds(150, 300, 100, 20);
		botaoVolta.setBounds(250, 300, 80, 20);

		painelPrincipal.add(botaoConfirma);
		painelPrincipal.add(botaoVolta);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaCadastroAdm();
	}

}
