package sgpp.dief.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodrigo
 */
public class Conexao {

    private static Connection connection = null;
    
    public static Connection getConexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        String serverName = "localhost";
        String mydatabase = "sgpp";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase; // a JDBC url
        String username = "root";
        String password = "1234";
        try {
            if (connection == null || connection.isClosed())
                connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Conexao.connection;
    }

}
