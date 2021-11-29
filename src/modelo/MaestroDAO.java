package modelo;

import java.sql.*;
import java.util.*;

public class MaestroDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn=new Conexion();
    Connection con;
    
    public EntidadMaestro nombremaestro (String id){
        EntidadMaestro em=new EntidadMaestro();
        String sql="SELECT nombre,apellidop,apellidom FROM uan.maestro WHERE idmaestro=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,id);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setNombre(rs.getString(1));
                em.setApellidop(rs.getString(2));
                em.setApellidom(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return em;
    }
    
    public EntidadMaestro ValidarMaestro(String usuario, String contrasena){
        EntidadMaestro em=new EntidadMaestro();
        String sql="SELECT * FROM uan.maestro WHERE usuario=? AND contrasena=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,usuario);
            ps.setString(2,contrasena);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setIdmaestro(rs.getString(1));
                em.setIdcarrera(rs.getString(2));
                em.setUsuario(rs.getString(3));
                em.setContrasena(rs.getString(4));
                em.setNombre(rs.getString(5));
                em.setApellidop(rs.getString(6));
                em.setApellidom(rs.getString(7));
                em.setCalle(rs.getString(8));
                em.setNumero(rs.getString(9));
                em.setColonia(rs.getString(10));
                em.setMunicipio(rs.getString(11));
                em.setEstado(rs.getString(12));
                em.setCp(rs.getString(13));
            }
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return em;
    }

    @Override
    public List listar() {
        List<EntidadMaestro> lista=new ArrayList<>();
        String sql="SELECT idmaestro,usuario,contrasena,nombre,apellidop,apellidom,calle,numero,colonia,municipio,estado,cp FROM uan.maestro";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadMaestro em=new EntidadMaestro();
                em.setIdmaestro(rs.getString(1));
                em.setUsuario(rs.getString(2));
                em.setContrasena(rs.getString(3));
                em.setNombre(rs.getString(4));
                em.setApellidop(rs.getString(5));
                em.setApellidom(rs.getString(6));
                em.setCalle(rs.getString(7));
                em.setNumero(rs.getString(8));
                em.setColonia(rs.getString(9));
                em.setMunicipio(rs.getString(10));
                em.setEstado(rs.getString(11));
                em.setCp(rs.getString(12));
                lista.add(em);
            }
        }
        catch (Exception e) {
            System.out.print("ERROR"+e);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT INTO uan.maestro (idmaestro,idcarrera,usuario,contrasena,nombre,apellidop,apellidom,calle,numero,colonia,municipio,estado,cp) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            ps.setObject(7,o[6]);
            ps.setObject(8,o[7]);
            ps.setObject(9,o[8]);
            ps.setObject(10,o[9]);
            ps.setObject(11,o[10]);
            ps.setObject(12,o[11]);
            ps.setObject(13,o[12]);
            r=ps.executeUpdate();
        }
        catch (SQLException e) {
            System.out.print("ERROR"+e);
        } 
        catch (Exception ex) {
            System.out.println("ERRORCICIMO "+ex);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="UPDATE uan.maestro set idmaestro=?,idcarrera=?,usuario=?,contrasena=?,nombre=?,apellidop=?,apellidom=?,calle=?,numero=?,colonia=?,municipio=?,estado=?,cp=? WHERE idmaestro=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            ps.setObject(7,o[6]);
            ps.setObject(8,o[7]);
            ps.setObject(9,o[8]);
            ps.setObject(10,o[9]);
            ps.setObject(11,o[10]);
            ps.setObject(12,o[11]);
            ps.setObject(13,o[12]);
            ps.setObject(14,o[13]);
            r=ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.print(e);
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM uan.maestro WHERE idmaestro=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("ERROR "+e);
        }
    }
}
