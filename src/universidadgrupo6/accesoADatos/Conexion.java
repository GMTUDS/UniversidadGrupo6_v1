package universidadgrupo6.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadGrupo6";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if (connection == null){
            try {
                Class.forName("org.mariabd.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB + "useLegacyDatetimecode=false&server imezone=UTC"
                + "user =" + USUARIO + "password=" + PASSWORD);
                JOptionPane.showMessageDialog(null,"Conectado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos"+ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver"+ex.getMessage());
            } 
        }
        return connection;
    }
}