/**
 * Classe Vendedor - Dados da pessoa que ser� vendedor de uma empresa cadastrada no sistema 
 * e qual a empresa que ela representa. 
 */

import java.time.LocalDate;

public class Vendedor extends Pessoa {
	private Empresa empresa;

	/**
	 * Construtor da classe Vendedor
	 * 
	 * @param nome
	 * @param nascimento
	 * @param endereco
	 * @param cpf
	 * @param empresa
	 */
	public Vendedor(String nome, LocalDate nascimento, Endereco endereco, String cpf, Empresa empresa) {
		super(nome, nascimento, endereco, cpf);
		setEmpresa(empresa);
	}

	/**
	 * Pegar empresa que o vendedor representa
	 * 
	 * @return Empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * Incluir empresa que o vendedor representar�
	 * 
	 * @param empresa
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * Imprimir dados do vendedor
	 */
	@Override
	public String toString() {
		return "Vendedor: " + super.toString() + "\nEmpresa: " + empresa.toString();
	}

}
