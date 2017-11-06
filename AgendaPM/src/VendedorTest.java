

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Test;

public class VendedorTest {

	
    Endereco adress = new Endereco("RuaTest", 50, "Savassi", "Belo Horizonte", "Minas Gerais", "35000-000");
    Endereco adress2 = new Endereco("Rua2Test", 100, "Maramelo", "Roma", "Itália", "31610-000");
    Endereco adress3 = new Endereco("Rua3Test", 150, "Centro", "Berlin", "Germany", "30000-000");
    Empresa Bmw = new Empresa("BMW", "0001-4321", adress3);
    Endereco adress4 = new Endereco("Rua4Test", 200, "VendaNova", "Belo Horizonte", "MG", "35847-000");
    Empresa Fiat = new Empresa("Fiat", "0001-1234", adress);
    Vendedor seller3 = new Vendedor("Felipe", LocalDate.now(), adress2, "555555555", Bmw);
    

	@Test
	public void testeVendedor() {
		seller3.getEmpresa();
		System.out.println(seller3.getEmpresa());
		String nome = "BMW";
		assertEquals(nome, seller3.getEmpresa().getNome());
	}

}
