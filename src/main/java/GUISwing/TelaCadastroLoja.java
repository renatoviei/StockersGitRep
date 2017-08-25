package GUISwing;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Negocio.Beans.LojaEntity;

import Negocio.Fachada;

public class TelaCadastroLoja extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private JTextField caixaNomeResponsavel = new JTextField(50);
	private JTextField caixaEmail = new JTextField(50);
	private JTextField caixaTelefoneDaEmpresa = new JTextField(50);
	private JTextField caixaRua = new JTextField(50);
	private JTextField caixaCidade = new JTextField(50);
	private JTextField caixaEstado = new JTextField(50);
	private JTextField caixaPais = new JTextField(50);
	private JTextField caixaCep = new JTextField(50);
	private JTextField caixaCnpj = new JTextField(50);
	private JTextField caixaRazao = new JTextField(50);
	private JTextField caixaNomeEmpresa = new JTextField(50);
	private JPasswordField caixaSenha = new JPasswordField(50);

	JButton botaoConfirma = new JButton("Cadastar");
	JButton botaoVolta = new JButton("Voltar");

	 ImageIcon imagem = new ImageIcon(getClass().getResource("cachorro-e-gato-podem-viver-juntos.jpg"));

	 JLabel label = new JLabel(imagem);

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoConfirma) {

			if (caixaNomeResponsavel.getText().equals("") || caixaTelefoneDaEmpresa.getText().equals("")
					|| caixaRua.getText().equals("") || caixaNomeEmpresa.getText().equals("")
					|| caixaSenha.getText().equals("") || caixaCidade.getText().equals("")
					|| caixaEstado.getText().equals("") || caixaPais.getText().equals("")
					|| caixaCep.getText().equals("") || caixaCnpj.getText().equals("")
					|| caixaRazao.getText().equals("") || caixaEmail.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campops");
			} else {
				try {
					LojaEntity loja = new LojaEntity();
					loja.setNomeResponsavel(caixaNomeResponsavel.getText());
					loja.setEmail(caixaEmail.getText());
					loja.setTelefoneEmpresa(Integer.parseInt(caixaTelefoneDaEmpresa.getText()));
					loja.setRua(caixaRua.getText());
					loja.setCidade(caixaCidade.getText());
					loja.setEstado(caixaEstado.getText());
					loja.setPais(caixaPais.getText());
					loja.setCep(caixaCep.getText());
					loja.setCnpj(caixaCnpj.getText());
					loja.setRazaoSocial(caixaRazao.getText());
					loja.setNomeEmpresa(caixaNomeEmpresa.getText());
					loja.setSenha(caixaSenha.getText());
					Fachada fachada = Fachada.getInstance();
					fachada.cadastrarLoja(loja);

					JOptionPane.showMessageDialog(null, "Loja cadastrada com sucesso");

					TelaMenuInicial menuInicial = new TelaMenuInicial();
					menuInicial.setResizable(false);
					menuInicial.setLocationRelativeTo(null);
					menuInicial.setVisible(true);
					dispose();
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Digite um numero no campo do telefone!");
				}
			}

		} else {
			TelaC1 telaC1 = new TelaC1();
			telaC1.setResizable(false);
			telaC1.setLocationRelativeTo(null);
			telaC1.setVisible(true);
			dispose();

		}

	}

	public TelaCadastroLoja() {

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

		Font grande = new Font("Serif", Font.BOLD, 12);

		JLabel nome = new JLabel("Digite seu nome: ");
		nome.setFont(grande);
		nome.setBounds(new Rectangle(20, 20, 120, 14));

		painelPrincipal.add(nome);

		caixaNomeResponsavel.setBounds(new Rectangle(115, 20, 330, 14));
		painelPrincipal.add(caixaNomeResponsavel);

		JLabel email = new JLabel("Digite seu email: ");
		email.setFont(grande);
		email.setBounds(new Rectangle(20, 40, 120, 14));

		painelPrincipal.add(email);

		caixaEmail.setBounds(new Rectangle(115, 40, 330, 14));
		painelPrincipal.add(caixaEmail);

		JLabel telefone = new JLabel("Digite seu telefone: ");
		telefone.setFont(grande);
		telefone.setBounds(new Rectangle(20, 60, 120, 14));
		painelPrincipal.add(telefone);

		caixaTelefoneDaEmpresa.setBounds(new Rectangle(125, 60, 320, 14));
		painelPrincipal.add(caixaTelefoneDaEmpresa);

		JLabel rua = new JLabel("Digite sua rua: ");
		rua.setFont(grande);
		rua.setBounds(new Rectangle(20, 80, 120, 14));
		painelPrincipal.add(rua);

		caixaRua.setBounds(new Rectangle(105, 80, 340, 14));
		painelPrincipal.add(caixaRua);

		JLabel cidade = new JLabel("Digite sua cidade: ");
		cidade.setFont(grande);
		cidade.setBounds(new Rectangle(20, 100, 120, 14));
		painelPrincipal.add(cidade);

		caixaCidade.setBounds(new Rectangle(120, 100, 325, 14));
		painelPrincipal.add(caixaCidade);

		JLabel estado = new JLabel("Digite seu estado: ");
		estado.setFont(grande);
		estado.setBounds(new Rectangle(20, 120, 120, 14));
		painelPrincipal.add(estado);

		caixaEstado.setBounds(new Rectangle(120, 120, 325, 14));
		painelPrincipal.add(caixaEstado);

		JLabel pais = new JLabel("Digite seu pais: ");
		pais.setFont(grande);
		pais.setBounds(new Rectangle(20, 140, 120, 14));
		painelPrincipal.add(pais);

		caixaPais.setBounds(new Rectangle(115, 140, 330, 14));
		painelPrincipal.add(caixaPais);

		JLabel cep = new JLabel("Digite seu cep: ");
		cep.setFont(grande);
		cep.setBounds(new Rectangle(20, 160, 120, 14));
		painelPrincipal.add(cep);

		caixaCep.setBounds(new Rectangle(105, 160, 340, 14));
		painelPrincipal.add(caixaCep);

		JLabel cnpj = new JLabel("Digite seu CNPJ: ");
		cnpj.setFont(grande);
		cnpj.setBounds(new Rectangle(20, 180, 120, 14));
		painelPrincipal.add(cnpj);

		caixaCnpj.setBounds(new Rectangle(115, 180, 330, 14));
		painelPrincipal.add(caixaCnpj);

		JLabel razao = new JLabel("Digite a razao social: ");
		razao.setFont(grande);
		razao.setBounds(new Rectangle(20, 200, 120, 14));
		painelPrincipal.add(razao);

		caixaRazao.setBounds(new Rectangle(135, 200, 310, 14));
		painelPrincipal.add(caixaRazao);

		JLabel nomeEmpresa = new JLabel("Digite o nome da empresa: ");
		nomeEmpresa.setFont(grande);
		nomeEmpresa.setBounds(new Rectangle(20, 220, 155, 14));
		painelPrincipal.add(nomeEmpresa);

		caixaNomeEmpresa.setBounds(new Rectangle(162, 220, 285, 14));
		painelPrincipal.add(caixaNomeEmpresa);

		JLabel senha = new JLabel("Crie sua senha: ");
		senha.setFont(grande);
		senha.setBounds(new Rectangle(20, 240, 120, 14));
		painelPrincipal.add(senha);

		caixaSenha.setBounds(new Rectangle(110, 240, 335, 14));
		painelPrincipal.add(caixaSenha);

		 label.setBounds(0, 0, 500, 400);
		botaoConfirma.setBounds(150, 300, 100, 20);
		botaoVolta.setBounds(250, 300, 80, 20);

		painelPrincipal.add(botaoConfirma);
		painelPrincipal.add(botaoVolta);
		 painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaCadastroLoja();
	}

}
