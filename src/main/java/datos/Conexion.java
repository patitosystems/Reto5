package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Claudia_Parra
 */
public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testClaudia?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
    public static Connection getConnection() throws SQLException {        
        Connection conn = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        return conn;
    } 
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stm) throws SQLException {
        stm.close();
    }
    
    public static void close(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}   
