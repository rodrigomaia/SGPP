package dief;

import sgpp.dief.beans.BeanLinhaExcel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class BeanLinhaExcelTest {

    public BeanLinhaExcelTest() {
    }

    BeanLinhaExcel bean = null;

    @Before
    public void setUp() {
        bean = new BeanLinhaExcel("15.106,02", "10.603,16", "1.802,54", "-", "4.502,86");
    }

    @After
    public void tearDown() {
        bean = null;
    }

    @Test
    public void testandoNew() {
        assertNotNull(bean);
    }

    @Test
    public void testValorDouble(){
        assertEquals(15106.02, bean.getVlContabil().doubleValue(),0d);
    }

    @Test
    public void testGets(){
        assertEquals(20000, bean.getVlContabil().doubleValue() + 4893.98, 0d);
        assertEquals(20000, bean.getBCICMS().doubleValue() + 9396.84, 0d);
        assertEquals(20000, bean.getVlICMS().doubleValue() + 18197.46, 0d);
        assertEquals(20000, bean.getIsentas().doubleValue() + 20000, 0d);
        assertEquals(20000, bean.getOutras().doubleValue() + 15497.14, 0d);
    }
}