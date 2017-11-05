/**
 * Classe com dados em comum de uma pessoa
 */


import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private LocalDate nascimento;
	private Endereco endereco;
	private String cpf;
	
	/**
	 * Construtor da classe Pessoa
	 * @param nome
	 * @param nascimento
	 * @param endereco
	 * @param cpf
	 */
	public Pessoa(String nome, LocalDate nascimento, Endereco endereco, String cpf) {
		setNome(nome);
		setNascimento(nascimento);
		setEndereco(endereco);
		setCpf(cpf);
	}
	/**
	 * Pegar nome da pessoa
	 * @return Nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Enviar nome da pessoa
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Pegar data de nascimento da Pessoa
	 * @return Data de Nascimento
	 */
	public LocalDate getNascimento() {
		return nascimento;
	}
	/**
	 * Enviar data de nascimento da Pessoa
	 * @param nascimento
	 */
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	/**
	 * Pegar Endere�o da Pessoa
	 * @return Endere�o
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * Enviar endere�o da pessoa
	 * @param endereco
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * Pegar cpf da Pessoa
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * Enviar cpf da Pessoa
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * Imprimir dados da pessoa
	 */
	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de nascimento: " + nascimento + "\nEndereco: " + endereco.toString() + "\nCpf: " + cpf;
	}
	
	
	
	
}
