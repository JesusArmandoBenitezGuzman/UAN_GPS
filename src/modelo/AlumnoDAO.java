package modelo;

import java.sql.*;
import java.util.*;

public class AlumnoDAO implements CRUD{

    PreparedStatement ps;
    ResultSet rs;
    Conexion cn=new Conexion();
    Connection con;
    
    public EntidadAlumno buscar(String nc){
        EntidadAlumno ea=new EntidadAlumno();
        String sql="SELECT nombre,apellidop,apellidom FROM uan.alumno WHERE nocontrol=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,nc);
            rs=ps.executeQuery();
            while(rs.next()){
                ea.setNombre(rs.getString(1));
                ea.setApellidop(rs.getString(2));
                ea.setApellidom(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
        return ea;
    }
    
    @Override
    public List listar() {
        List<EntidadAlumno> lista=new ArrayList<>();
        String sql="SELECT nocontrol,nombre,apellidop,apellidom,calle,numero,colonia,municipio,estado,cp FROM uan.alumno";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadAlumno ea=new EntidadAlumno();
                ea.setNocontrol(rs.getString(1));
                ea.setNombre(rs.getString(2));
                ea.setApellidop(rs.getString(3));
                ea.setApellidom(rs.getString(4));
                ea.setCalle(rs.getString(5));
                ea.setNumero(rs.getString(6));
                ea.setColonia(rs.getString(7));
                ea.setMunicipio(rs.getString(8));
                ea.setEstado(rs.getString(9));
                ea.setCp(rs.getString(10));
                lista.add(ea);
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
        String sql="INSERT INTO uan.alumno (nocontrol,idcarrera,nombre,apellidop,apellidom,calle,numero,colonia,municipio,estado,cp) values (?,?,?,?,?,?,?,?,?,?,?)";
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
        String sql="UPDATE uan.alumno set nocontrol=?,idcarrera=?,nombre=?,apellidop=?,apellidom=?,calle=?,numero=?,colonia=?,municipio=?,estado=?,cp=? WHERE nocontrol=?";
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
            r=ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.print(e);
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM uan.alumno WHERE nocontrol=?";
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
