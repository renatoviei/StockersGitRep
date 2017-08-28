package GUISwing;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEspacoLoja extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField caixaPesquisa = new JTextField(50);
	private JCheckBox cachorro, gato;
	JButton botaoPesquisar = new JButton("Pesquisar");
	JButton botaoSair = new JButton("Sair");

	ImageIcon imagem = new ImageIcon(getClass().getResource("cachorro-e-gato-podem-viver-juntos.jpg"));

	JLabel label = new JLabel(imagem);

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoPesquisar && !caixaPesquisa.getText().equals("")) {
			String aux = caixaPesquisa.getText();
			TelaPesquisarListarProduto busca = new TelaPesquisarListarProduto(aux);
			busca.setResizable(false);
			busca.setLocationRelativeTo(null);
			busca.setVisible(true);
			dispose();

		} else if (e.getSource() == botaoSair) {
			TelaMenuInicial menuInicial = new TelaMenuInicial();
			menuInicial.setResizable(false);
			menuInicial.setLocationRelativeTo(null);
			menuInicial.setVisible(true);
			dispose();

		} else
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");

	}

	public TelaEspacoLoja() {

		botaoSair.addActionListener(this);
		botaoPesquisar.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();
		getContentPane().add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.BOLD, 13);

		JLabel busca = new JLabel("Pesquisar: ");
		busca.setFont(grande);
		busca.setBounds(new Rectangle(10, 50, 180, 17));
		painelPrincipal.add(busca);

		caixaPesquisa.setBounds(new Rectangle(70, 50, 150, 17));
		painelPrincipal.add(caixaPesquisa);

		cachorro = new JCheckBox("Cachorro");
		gato = new JCheckBox("Gato");

		cachorro.setBounds(10, 110, 100, 17);
		gato.setBounds(100, 110, 100, 17);

		painelPrincipal.add(cachorro);
		painelPrincipal.add(gato);

		label.setBounds(-0, -20, 500, 400);

		botaoPesquisar.setBounds(10, 80, 100, 17);

		painelPrincipal.add(botaoPesquisar);

		botaoSair.setBounds(200, 275, 100, 20);

		painelPrincipal.add(botaoSair);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaEspacoLoja();
	}

}