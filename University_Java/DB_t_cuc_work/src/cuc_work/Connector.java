package cuc_work;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String CadenaConeccion = "jdbc:mysql://127.0.0.1/t_universidad?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";

    public Connector() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(CadenaConeccion, user, password);
            if (con != null) {System.out.println("¡Conexion exitosa!\n");}
            
        } catch (ClassNotFoundException | SQLException e) {System.out.println("Error al conectar" + e);}
    }

    public Connection getConnection() {
        return con;
    }
    public void disconnect() {
        con = null;
        if (con == null) {System.out.println("\nConexion finalizada.");}
    }

    public void GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
