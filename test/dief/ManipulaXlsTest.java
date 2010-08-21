package dief;

import sgpp.dief.beans.BeanLinhaExcel;
import java.util.HashMap;
import sgpp.dief.manipulaxls.ManipulaXls;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class ManipulaXlsTest {

    ManipulaXls mx = null;
    ManipulaXls mxErrado = null;

    public ManipulaXlsTest() {
    }

    @Before
    public void setUp() throws Exception {
        mx = new ManipulaXls("C:/Users/rodrigo/Desktop/SGPP/Entrada Cliente.xls");
        mxErrado = new ManipulaXls("C:/Users/rodrigo/Desktop/SGPP/Entrada Cliente com Menos Colunas.xls");
    }

    @After
    public void tearDown() {
        mx = null;
    }

    @Test
    public void arquivoComMenosColunas() {
        HashMap<String, BeanLinhaExcel> hash = new HashMap<String, BeanLinhaExcel>();

        Exception exp = null;

        try{
            mxErrado.geraVetor(hash);
        }catch(Exception ex){
            exp = ex;
        }

        assertNotNull(exp);
        assertEquals("Planilha Fora do Formato Esperado.", exp.getMessage());
    }

    @Test
    public void montaHashByExcel() {
        HashMap<String, BeanLinhaExcel> hash = new HashMap<String, BeanLinhaExcel>();
        mx.geraVetor(hash);

        assertEquals(15106.02, hash.get("1102").getVlContabil().doubleValue(), 0d);
        assertEquals(10603.16, hash.get("1102").getBCICMS().doubleValue(), 0d);
        assertEquals(1802.54, hash.get("1102").getVlICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("1102").getIsentas().doubleValue(), 0d);
        assertEquals(4502.86, hash.get("1102").getOutras().doubleValue(), 0d);

        assertEquals(33266.43, hash.get("2101").getVlContabil().doubleValue(), 0d);
        assertEquals(33266.43, hash.get("2101").getBCICMS().doubleValue(), 0d);
        assertEquals(3991.97, hash.get("2101").getVlICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2101").getIsentas().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2101").getOutras().doubleValue(), 0d);

        assertEquals(234115.12, hash.get("2102").getVlContabil().doubleValue(), 0d);
        assertEquals(200148.16, hash.get("2102").getBCICMS().doubleValue(), 0d);
        assertEquals(16112.18, hash.get("2102").getVlICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2102").getIsentas().doubleValue(), 0d);
        assertEquals(33966.96, hash.get("2102").getOutras().doubleValue(), 0d);

        assertEquals(103.90, hash.get("2202").getVlContabil().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2202").getBCICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2202").getVlICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("2202").getIsentas().doubleValue(), 0d);
        assertEquals(103.90, hash.get("2202").getOutras().doubleValue(), 0d);
 
        assertEquals(761.65, hash.get("6202").getVlContabil().doubleValue(), 0d);
        assertEquals(771.65, hash.get("6202").getBCICMS().doubleValue(), 0d);
        assertEquals(92.60, hash.get("6202").getVlICMS().doubleValue(), 0d);
        assertEquals(0.0, hash.get("6202").getIsentas().doubleValue(), 0d);
        assertEquals(0.0, hash.get("6202").getOutras().doubleValue(), 0d);
    }

    @Test
    public void verificaChaves() {
        HashMap<String, BeanLinhaExcel> hash = new HashMap<String, BeanLinhaExcel>();
        mx.geraVetor(hash);

        assertTrue(hash.containsKey("1102"));
        assertTrue(hash.containsKey("2101"));
        assertTrue(hash.containsKey("2102"));
        assertTrue(hash.containsKey("2202"));
        assertTrue(hash.containsKey("2353"));
        assertTrue(hash.containsKey("5101"));
        assertTrue(hash.containsKey("5102"));
        assertTrue(hash.containsKey("5403"));
        assertTrue(hash.containsKey("6101"));
        assertTrue(hash.containsKey("6102"));
        assertTrue(hash.containsKey("6201"));
        assertTrue(hash.containsKey("6202"));

        assertFalse(hash.containsKey("6204"));
        assertFalse(hash.containsKey("0"));
        assertFalse(hash.containsKey(""));
    }

}