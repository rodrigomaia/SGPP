package dief;

import dief.BeanLinhaExcelTest;
import dief.CalculadoraDiefTest;
import dief.ConexaoTest;
import dief.ManipulaXlsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author rodrigo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BeanLinhaExcelTest.class, 
                     ConexaoTest.class,
                     CalculadoraDiefTest.class,
                     ManipulaXlsTest.class})
                     
public class MainTestSuite {

}