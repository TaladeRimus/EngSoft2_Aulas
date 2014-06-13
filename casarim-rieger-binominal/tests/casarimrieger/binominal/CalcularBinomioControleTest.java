package casarimrieger.binominal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularBinomioControleTest {

	@Test
	public void testSeisDois() {
		IBinomioEntidade e = new BinomioEntidadeFake(6, 2, 15);
		
		CalcularBinomioControle c = new CalcularBinomioControle(e);
		
		int actual = c.calcular(6, 2);
		int resposta = 15;
		
		assertEquals(resposta, actual);
	}
	
	@Test
	public void testUmUm() {
		IBinomioEntidade e = new BinomioEntidadeFake(1, 1, 1);
		
		CalcularBinomioControle c = new CalcularBinomioControle(e);
		
		int actual = c.calcular(1, 1);
		int resposta = 1;
		
		assertEquals(resposta, actual);
	}

}
