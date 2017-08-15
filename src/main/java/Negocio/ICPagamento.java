package Negocio;

import dados.PagamentoEntity;

public interface ICPagamento {
	
	public void cadastrarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity editarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity consultarPagamento(String codigo);

}
