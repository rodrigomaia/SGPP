package dief;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sgpp.dief.conexao.Conexao;

import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class CalculadoraDiefTest {

    Connection con = null;

    public CalculadoraDiefTest() {
    }

    @Before
    public void setUp() {
        con = Conexao.getConexao();
        try {
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(CalculadoraDiefTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Before
    public void montaArrayEntrada(){

    }

    @After
    public void tearDown() {
        try {

            if (con != null && !con.isClosed()){
                con.rollback();
                con.close();
            }
            con = null;
        } catch (SQLException ex) {
            Logger.getLogger(CalculadoraDiefTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void select1() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from sgpp.grupo");

        assertTrue(rs.next());
    }

}