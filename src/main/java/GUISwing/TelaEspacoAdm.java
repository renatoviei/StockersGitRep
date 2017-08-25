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
import javax.swing.JTextField;

import Negocio.Beans.ProdutoEntity;

import Negocio.Fachada;

public class TelaEspacoAdm extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private JTextField caixaNome = new JTextField(50);
	private JTextField caixaPreco = new JTextField(50);
	private JTextField caixaCodigo = new JTextField(50);
	private JTextField caixaCategoria = new JTextField(50);
	private JTextField caixaInformacoes = new JTextField(50);

	JButton botaoConfirma = new JButton("Confirmar");
	JButton botaoListarLojas = new JButton("Lojas");
	JButton botaoSair = new JButton("Sair");

	ImageIcon imagem = new ImageIcon(getClass().getResource("cachorro-e-gato-podem-viver-juntos.jpg"));

	JLabel label = new JLabel(imagem);

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoConfirma) {

			if (caixaNome.getText().equals("") || caixaPreco.getText().equals("") || caixaCodigo.getText().equals("")
					|| caixaCategoria.getText().equals("") || caixaInformacoes.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campops");
			} else {
				try {
					ProdutoEntity produto = new ProdutoEntity();
					produto.setNome(caixaNome.getText());
					produto.setPreco(Integer.parseInt(caixaPreco.getText()));
					produto.setCodigo(caixaCodigo.getText());
					produto.setTipo(caixaCategoria.getText());
					produto.setInformacoes(caixaInformacoes.getText());

					Fachada fachada = Fachada.getInstance();
					fachada.cadastrarProduto(produto);

					JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

					TelaMenuInicial menuInicial = new TelaMenuInicial();
					menuInicial.setResizable(false);
					menuInicial.setLocationRelativeTo(null);
					menuInicial.setVisible(true);
					dispose();
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Digite um numero no campo do preco");
				}
			}

		} else if (e.getSource() == botaoListarLojas) {
			TelaListaLojas lojas = new TelaListaLojas();
			lojas.setResizable(false);
			lojas.setLocationRelativeTo(null);
			lojas.setVisible(true);
			dispose();

		} else {

			TelaLoginAdm telaLoginadm = new TelaLoginAdm();
			telaLoginadm.setResizable(false);
			telaLoginadm.setLocationRelativeTo(null);
			telaLoginadm.setVisible(true);
			dispose();

		}

	}

	public TelaEspacoAdm() {

		botaoConfirma.addActionListener(this);
		botaoSair.addActionListener(this);
		botaoListarLojas.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();

		add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.BOLD, 12);

		JLabel nome = new JLabel("Digite o nome: ");
		nome.setFont(grande);
		nome.setBounds(new Rectangle(20, 80, 120, 14));

		painelPrincipal.add(nome);

		caixaNome.setBounds(new Rectangle(115, 80, 330, 14));
		painelPrincipal.add(caixaNome);

		JLabel preco = new JLabel("Digite o preço: ");
		preco.setFont(grande);
		preco.setBounds(new Rectangle(20, 100, 120, 14));

		painelPrincipal.add(preco);

		caixaPreco.setBounds(new Rectangle(115, 100, 330, 14));
		painelPrincipal.add(caixaPreco);

		JLabel codigo = new JLabel("Digite o codigo: ");
		codigo.setFont(grande);
		codigo.setBounds(new Rectangle(20, 120, 120, 14));
		painelPrincipal.add(codigo);

		caixaCodigo.setBounds(new Rectangle(125, 120, 320, 14));
		painelPrincipal.add(caixaCodigo);

		JLabel tipo = new JLabel("Digite o tipo: ");
		tipo.setFont(grande);
		tipo.setBounds(new Rectangle(20, 140, 120, 14));
		painelPrincipal.add(tipo);

		caixaCategoria.setBounds(new Rectangle(105, 140, 340, 14));
		painelPrincipal.add(caixaCategoria);

		JLabel informacoes = new JLabel("Informacoes: ");
		informacoes.setFont(grande);
		informacoes.setBounds(new Rectangle(20, 160, 120, 14));
		painelPrincipal.add(informacoes);

		caixaInformacoes.setBounds(new Rectangle(100, 160, 343, 15));
		painelPrincipal.add(caixaInformacoes);

		label.setBounds(0, 0, 500, 400);
		botaoListarLojas.setBounds(20, 200, 100, 20);
		botaoConfirma.setBounds(150, 300, 100, 20);
		botaoSair.setBounds(250, 300, 80, 20);

		painelPrincipal.add(botaoListarLojas);
		painelPrincipal.add(botaoConfirma);
		painelPrincipal.add(botaoSair);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaEspacoAdm();
	}

}
