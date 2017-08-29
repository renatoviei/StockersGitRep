package GUISwing;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Negocio.Fachada;
import Negocio.Beans.ProdutoEntity;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;

public class TelaListarProdutoLoja extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private JTextField caixaTipo = new JTextField(50);
	private JTextField caixaPreco = new JTextField(50);

	JButton botaoVolta = new JButton("Voltar");

	ImageIcon imagem = new ImageIcon(
			getClass().getResource("depositphotos_46630039-stock-illustration-animal-seamless-vector-pattern-of.jpg"));

	JLabel label = new JLabel(imagem);
	JList lista;
	DefaultListModel modelo = new DefaultListModel();
	private final JList list = new JList();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton btnRemover = new JButton("Remover");
	Fachada fachada = Fachada.getInstance();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoVolta) {

			TelaEspacoLoja espaco = new TelaEspacoLoja();
			espaco.setResizable(false);
			espaco.setLocationRelativeTo(null);
			espaco.setVisible(true);
			dispose();

		} else if (e.getSource().equals(btnRemover)) {

			if (list.getSelectedValue() != null) {
				fachada.apagarProduto(fachada.consultarProduto(list.getSelectedValue().toString()).getCodigo());
			}
		} else if (list.getSelectedValue() != null) {
			caixaTipo.setText(fachada.consultarProduto(list.getSelectedValue().toString()).getTipo());
			caixaTipo.setEditable(false);
			caixaPreco.setText(Float.toString(fachada.consultarProduto(list.getSelectedValue().toString()).getPreco()));
			caixaPreco.setEditable(false);

		}
	}

	@SuppressWarnings({})
	public TelaListarProdutoLoja() {

		botaoVolta.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();

		getContentPane().add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.BOLD, 13);

		list.setModel(new AbstractListModel() {

			private static final long serialVersionUID = 1L;

			List<ProdutoEntity> listaProdutos = fachada.listarProduto();

			public int getSize() {
				return listaProdutos.size();
			}

			public Object getElementAt(int index) {
				return listaProdutos.get(index).getNome();

			}
		});

		btnRemover.setBounds(351, 254, 89, 23);

		painelPrincipal.add(btnRemover);
		list.setBounds(300, 41, 184, 189);
		painelPrincipal.add(list);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setFont(new Font("Tahoma", Font.BOLD, 14));

		painelPrincipal.add(scrollPane);

		JLabel nome = new JLabel("Tipo do produto: ");
		nome.setFont(grande);
		nome.setBounds(new Rectangle(10, 13, 250, 17));
		painelPrincipal.add(nome);

		caixaTipo.setBounds(new Rectangle(10, 33, 250, 17));
		painelPrincipal.add(caixaTipo);
		caixaTipo.setEditable(false);

		caixaPreco.setBounds(new Rectangle(30, 75, 50, 17));
		painelPrincipal.add(caixaPreco);
		caixaPreco.setEditable(false);

		JLabel cifrao = new JLabel("R$");
		cifrao.setFont(grande);
		cifrao.setBounds(new Rectangle(10, 75, 30, 17));
		painelPrincipal.add(cifrao);

		JLabel centavos = new JLabel(",00");
		centavos.setFont(grande);
		centavos.setBounds(new Rectangle(83, 75, 60, 17));
		painelPrincipal.add(centavos);

		botaoVolta.setBounds(250, 320, 80, 20);

		painelPrincipal.add(botaoVolta);

		label.setBounds(0, 0, 500, 400);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaListarProdutoLoja();
	}

}