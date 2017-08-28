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
import Negocio.Fachada;
import Negocio.Beans.LojaEntity;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;

public class TelaListaLojas extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	JButton botaoVolta = new JButton("Voltar");
	JButton botaoRemove = new JButton("Remover");
	ImageIcon imagem = new ImageIcon(
			getClass().getResource("depositphotos_46630039-stock-illustration-animal-seamless-vector-pattern-of.jpg"));

	JLabel label = new JLabel(imagem);
	JList lista;
	DefaultListModel modelo = new DefaultListModel();
	private final JList list = new JList();
	private final JScrollPane scrollPane = new JScrollPane();
	protected DefaultListModel listaModel = new DefaultListModel();
	Fachada fachada = Fachada.getInstance();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoVolta) {

			TelaEspacoAdm espaco = new TelaEspacoAdm();
			espaco.setResizable(false);
			espaco.setLocationRelativeTo(null);
			espaco.setVisible(true);
			dispose();

		} else if (e.getSource().equals(botaoRemove)) {

			if (list.getSelectedValue() != null) {
				fachada.apagarLoja(fachada.consultarLoja(list.getSelectedValue().toString()).getEmail());
			}
		}

	}

	@SuppressWarnings({})
	public TelaListaLojas() {

		botaoVolta.addActionListener(this);
		botaoRemove.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();

		getContentPane().add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.ITALIC, 26);
		

		list.setModel(new AbstractListModel() {

			private static final long serialVersionUID = 1L;

			List<LojaEntity> listaLojas = fachada.listarLoja();

			public int getSize() {
				return listaLojas.size();
			}

			public Object getElementAt(int index) {

				return listaLojas.get(index).getNomeEmpresa();

			}
		});

		list.setBounds(300, 41, 184, 189);
		painelPrincipal.add(list);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setFont(new Font("Tahoma", Font.BOLD, 14));

		painelPrincipal.add(scrollPane);

		JLabel nome = new JLabel("Lojas ");
		nome.setFont(grande);
		nome.setBounds(new Rectangle(10, 10, 250, 17));
		painelPrincipal.add(nome);

		label.setBounds(0, 0, 500, 400);

		botaoRemove.setBounds(150, 320, 100, 20);
		botaoVolta.setBounds(250, 320, 80, 20);

		painelPrincipal.add(botaoRemove);
		painelPrincipal.add(botaoVolta);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaListaLojas();
	}

}
