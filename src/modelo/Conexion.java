package modelo;

import java.sql.*;

public class Conexion {
    Connection con;
    String url="jdbc:postgresql://localhost:5432/universidad_autonoma";
    String user="postgres";
    String pass="admin";
    
    public Connection Conectar() throws ClassNotFoundException{
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } 
        catch (SQLException e) {
            System.out.print("ERROR "+e);
        }
        return con;
    }
    
}
