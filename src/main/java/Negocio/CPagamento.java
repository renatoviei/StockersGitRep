package Negocio;

import dados.IPagamentoDAO;
import dados.PagamentoDAO;
import dados.PagamentoEntity;

public class CPagamento implements ICPagamento {
	private static CPagamento instance;
	private IPagamentoDAO ipagamento;
	
	private CPagamento() {
		this.ipagamento = PagamentoDAO.getInstance();
	}
	
	public static synchronized CPagamento getInstance() {
		if (instance == null) {
			instance = new CPagamento();
		}
		return instance;
	}
	
	public void cadastrarPagamento(PagamentoEntity pagamento) {
		ipagamento.cadastrarPagamento(pagamento);
	}
	
	public PagamentoEntity editarPagamento(PagamentoEntity pagamento) {
		return ipagamento.editarPagamento(pagamento);
	}
	
	public PagamentoEntity consultarPagamento(String codigo) {
		return ipagamento.consultarPagamento(codigo);
	}

}
