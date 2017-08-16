package Negocio.Beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column(name="valor")
	private float valor;
	@Column(name="observacao")
	private String observacao;
	@Column(name="emailLoja")
	private String emailLoja;
	@Column(name="codPag")
	private String codPag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getEmailLoja() {
		return emailLoja;
	}
	public void setEmailLoja(String emailLoja) {
		this.emailLoja = emailLoja;
	}
	public String getCodPag() {
		return codPag;
	}
	public void setCodPag(String codPag) {
		this.codPag = codPag;
	}
	
}
