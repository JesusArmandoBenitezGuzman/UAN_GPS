package modelo;

import java.sql.*;

public class MaestroDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion con=new Conexion();
    Connection acceso;
    
    public EntidadMaestro ValidarMaestro(String usuario, String contrasena){
        EntidadMaestro em=new EntidadMaestro();
        String sql="SELECT usuario,contrasena FROM uan.maestro WHERE usuario=? AND contrasena=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1,usuario);
            ps.setString(2,contrasena);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setUsuario(rs.getString(1));
                em.setContrasena(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return em;
    }
}
