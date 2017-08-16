package Negocio.Beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loja")
public class LojaEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue     			<- usar se for gerar um id ao criar
	private String email;
	
	@Column(name="nomeResponsavel")
	private String nomeResponsavel;
	@Column(name="telefoneEmpresa")
	private int telefoneEmpresa;
	@Column(name="rua")
	private String rua;
	@Column(name="cidade")
	private String cidade;
	@Column(name="estado")
	private String estado;
	@Column(name="pais")
	private String pais;
	@Column(name="cep")
	private String cep;
	@Column(name="cnpj")
	private String cnpj;
	@Column(name="razaoSocial")
	private String razaoSocial;
	@Column(name="nomeEmpresa")
	private String nomeEmpresa;
	@Column(name="senha")
	private String senha;
	
	
	public String getLojaEmail() {
		return email;
	}
	
	public void setLojaNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setCep(String cep) {
		this.cep=cep;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public void setTelefoneEmpresa(int telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstado() {
		return estado;
	}

	public String getEmail() {
		return email;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public int getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public String getRua() {
		return rua;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

	public String getCep() {
		return cep;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public String getSenha() {
		return senha;
	}
	
	
	
}
