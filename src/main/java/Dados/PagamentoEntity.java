package Dados;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pagamento")
public class PagamentoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	
	@Column(name="status_pag")
	private String status_pag;
	@Column(name="vencimento")
	private Date vencimento;
	@Column(name="valor")
	private float valor;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getStatus_pag() {
		return status_pag;
	}
	public void setStatus_pag(String status_pag) {
		this.status_pag = status_pag;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

}
