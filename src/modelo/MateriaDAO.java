package modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class MateriaDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public EntidadMateria ver(String nc){
        EntidadMateria em=new EntidadMateria();
        String sql="select nombre from uan.materia where clave=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,nc);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setNombre(rs.getString(1));
            }
        } 
        catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return em;
    }
    
    @Override
    public List listar() {
        List<EntidadMateria> lista=new ArrayList<EntidadMateria>();
        String sql="SELECT clave,nombre,idmaestro FROM uan.materia";
        
//        SELECT materia.clave,materia.nombre,maestro.nombre FROM uan.materia INNER JOIN uan.maestro ON materia.idmaestro=maestro.idmaestro;
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadMateria c=new EntidadMateria();
                c.setClave(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setIdmaestro(rs.getString(3));
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
        String sql="INSERT INTO uan.materia (clave,nombre,idmaestro) VALUES (?,?,?)";
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
    public int actualizar(Object[] o) {
        int r=0;
        String sql="UPDATE uan.materia SET clave=?,nombre=?,idmaestro=? WHERE clave=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            r=ps.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM uan.materia WHERE clave=?";
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
