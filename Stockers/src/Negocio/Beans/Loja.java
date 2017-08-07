package Negocio.Beans;

public class Loja {

	private String nomeResponsavel;
	private long telefoneEmpresa;
	private String rua;
	private String cidade;
	private String estado;
	private String pais;
	private long cep;
	private long cnpj;
	private String razaoSocial;
	private String email;
	private String nomeEmpresa;
	private String senha;

	public Loja(String nomeResponsavel, long telefoneEmpresa, String rua, String cidade, String estado, String pais,
			long cep, long cnpj, String razaoSocial, String email, String nomeEmpresa, String senha) {
		this.cep = cep;
		this.cidade = cidade;
		this.cnpj = cnpj;
		this.email = email;
		this.estado = estado;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeResponsavel = nomeResponsavel;
		this.pais = pais;
		this.razaoSocial = razaoSocial;
		this.rua = rua;
		this.senha = senha;
		this.telefoneEmpresa = telefoneEmpresa;
	}


	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public long getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(int telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
