package dados;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_produto")
public class Item_produtoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int idPed;
	//@Id
	private String codProd;
	
	@Column(name="quantidade")
	private int quantidade;

	public int getIdPed() {
		return idPed;
	}

	public void setIdPed(int idPed) {
		this.idPed = idPed;
	}

	public String getCodProd() {
		return codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}
