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

import Negocio.Beans.PedidoEntity;
import Negocio.Fachada;

public class TelaPedido extends JFrame implements ActionListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private JTextField caixaObserv = new JTextField(50);
	private JTextField caixaValor = new JTextField(50);
	private JTextField caixaEmailLoja = new JTextField(50);

	JButton botaoConfirma = new JButton("Enviar");

	JButton botaoVoltar = new JButton("Voltar");

	ImageIcon imagem = new ImageIcon(getClass().getResource("Stockers.png"));

	JLabel label = new JLabel(imagem);

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoConfirma) {

			if (caixaObserv.getText().equals("") || caixaValor.getText().equals("")
					|| caixaEmailLoja.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos");
			} else {
				try {
					PedidoEntity pedido = new PedidoEntity();
					pedido.setObservacao(caixaObserv.getText());
					pedido.setValor(Float.parseFloat(caixaValor.getText()));
					pedido.setEmailLoja(caixaEmailLoja.getText());

					Fachada fachada = Fachada.getInstance();
					fachada.cadastrarPedido(pedido);

					JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso");

				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Digite um numero no campo do preco");
				}
			}

		} else if (e.getSource() == botaoVoltar) {
			TelaPesquisarProdutoLoja pesquisar = new TelaPesquisarProdutoLoja(null);
			pesquisar.setResizable(false);
			pesquisar.setLocationRelativeTo(null);
			pesquisar.setVisible(true);
			dispose();

		}

	}

	public TelaPedido() {

		botaoConfirma.addActionListener(this);
		botaoVoltar.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setToolTipText("Espa\u00E7o Adm");

		getContentPane().add(painelPrincipal);

		painelPrincipal.setLayout(null);

		Font grande = new Font("Serif", Font.BOLD, 12);

		JLabel observ = new JLabel("Digite os produtos: ");
		observ.setFont(grande);
		observ.setBounds(new Rectangle(20, 80, 120, 14));

		painelPrincipal.add(observ);

		caixaObserv.setBounds(new Rectangle(120, 80, 330, 14));
		painelPrincipal.add(caixaObserv);

		JLabel valor = new JLabel("Digite o valor total: ");
		valor.setFont(grande);
		valor.setBounds(new Rectangle(20, 100, 120, 14));

		painelPrincipal.add(valor);

		caixaValor.setBounds(new Rectangle(120, 100, 330, 14));
		painelPrincipal.add(caixaValor);

		JLabel email = new JLabel("Digite o email da loja: ");
		email.setFont(grande);
		email.setBounds(new Rectangle(20, 120, 120, 14));
		painelPrincipal.add(email);

		caixaEmailLoja.setBounds(new Rectangle(135, 120, 315, 14));
		painelPrincipal.add(caixaEmailLoja);

		label.setBounds(0, 0, 500, 400);

		botaoConfirma.setBounds(150, 300, 100, 20);
		botaoVoltar.setBounds(250, 300, 80, 20);

		painelPrincipal.add(botaoConfirma);
		painelPrincipal.add(botaoVoltar);
		painelPrincipal.add(label);
	}

	public static void main(String[] args) {
		new TelaPedido();
	}

}
