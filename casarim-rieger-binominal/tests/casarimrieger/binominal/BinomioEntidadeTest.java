package casarimrieger.binominal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinomioEntidadeTest {

	@Test
	public void test() {
		BinomioEntidadeFake e = new BinomioEntidadeFake();
		
		e.setN(6);
		e.setK(2);
		int actual = e.getCoeficiente();
		int resposta = 15;
		
		assertEquals(resposta, actual);
	}
}
