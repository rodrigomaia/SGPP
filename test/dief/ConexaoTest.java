package dief;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import sgpp.dief.conexao.Conexao;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class ConexaoTest {

    Connection con = null;

    public ConexaoTest() {
    }

    @Test
    public void pegaConexao() throws SQLException {
        con = Conexao.getConexao();

        assertNotNull(con);
        assertFalse(con.isClosed());
    }

}