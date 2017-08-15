package dados;

public interface IPagamentoDAO {
	
	public void cadastrarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity editarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity consultarPagamento(String codigo);

}
