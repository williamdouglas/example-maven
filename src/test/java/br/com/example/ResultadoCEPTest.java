package br.com.example;

import br.com.example.servicos.ResultadoCEP;
import junit.framework.TestCase;

public class ResultadoCEPTest extends TestCase {
    /**
     * Teste do método obtemUltimoResultado()
     */
    public void testObtemUltimoResultado() {
        String cep = ResultadoCEP.obtemCEP();

        assertNotNull(cep);
        assertTrue(cep.contains("cep"));
    }
}