package dados;

import java.util.List;

public interface IPedidoDAO {
	
	public void cadastrarPedido(PedidoEntity pedido);
	public PedidoEntity editarPedido(PedidoEntity pedido);
	public PedidoEntity consultarPedido(int id);
	public List<PedidoEntity> listarPedido();

}
