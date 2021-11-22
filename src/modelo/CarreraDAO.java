package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarreraDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<EntidadCarrera> lista=new ArrayList<EntidadCarrera>();
        String sql="SELECT * FROM uan.carrera";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadCarrera c=new EntidadCarrera();
                c.setIdcarrera(rs.getString(1));
                c.setNombre(rs.getString(2));
                lista.add(c);
            }
        } 
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT INTO uan.carrera (idcarrera,nombre) VALUES (?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            r=ps.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="UPDATE uan.carrera SET idcarrera=?,nombre=? WHERE idcarrera=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            r=ps.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM uan.carrera WHERE idcarrera=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
    }
    
    
}
