

/**
 * Classe com dados de um endere�o 
 *
 */

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco(String rua, int numero, String bairro, String cidade, String estado, String cep) {
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);

	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "\nRua: " + rua + "\nN�: " + numero + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: "
				+ estado + "\nCep: " + cep;
	}

}
