import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;


public class ProdutoTest {
    Agenda agenda = new Agenda(2017);
    Produto prod = new Produto("Ferrari", Categoria.Automovel);
    Produto prod2 = new Produto("Ferrari2", Categoria.Automovel);
    Endereco adress = new Endereco("RuaTest", 50, "Savassi", "Belo Horizonte", "Minas Gerais", "35000-000");
    Endereco adress2 = new Endereco("Rua2Test", 100, "Maramelo", "Roma", "Itália", "31610-000");
    Endereco adress3 = new Endereco("Rua3Test", 150, "Centro", "Berlin", "Germany", "30000-000");
    Endereco adress4 = new Endereco("Rua4Test", 200, "VendaNova", "Belo Horizonte", "MG", "35847-000");
    Empresa Fiat = new Empresa("Fiat", "0001-1234", adress);
    Empresa Bmw = new Empresa("BMW", "0001-4321", adress3);
    Vendedor seller = new Vendedor("Luca", LocalDate.now(), adress2, "123456789", Bmw);
    Vendedor seller2 = new Vendedor("Ronan", LocalDate.now(), adress2, "987654321", Bmw);
    Dia day =  new Dia(11, 05);
    Cliente cliente = new Cliente("Prefeitura", "0001-000005", adress4);
    Cliente cliente2 = new Cliente("Congresso", "0001-000678", adress4);
    Atendimento atend = new Atendimento(LocalTime.of(8, 10), LocalDate.of(2017, 11, 11), seller, cliente2, prod2);
    Atendimento atend1 = new Atendimento(LocalTime.of(8, 30), LocalDate.of(2017, 11, 12), seller, cliente, prod);
    Vendedor seller3 = new Vendedor("Felipe", LocalDate.now(), adress2, "555555555", Bmw);

    @Test
    public void testGetValor(){
        double price = prod.getValor();
        assertEquals(price, 2500.00, 0.01);
    }

}