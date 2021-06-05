package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveInstantiateCCWithSucess() {
		
		Conta contaCorrente = new ContaCorrente(10, 1, "CC");
		
		assertEquals("CC", contaCorrente.getTipo());
		
	}
	
	@Test
	public void shouldHaveInstantiateCPWithSucess() {
		
		Conta contaPoupanca = new ContaPoupanca(5, 12, "CP");
		
		assertEquals("CP", contaPoupanca.getTipo());
		
	}
	
}
