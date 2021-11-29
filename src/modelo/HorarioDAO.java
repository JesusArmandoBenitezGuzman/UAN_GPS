package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HorarioDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<EntidadHorario> lista=new ArrayList<EntidadHorario>();
        String sql="SELECT * FROM uan.semestre";        
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadHorario c=new EntidadHorario();
                c.setNocontrol(rs.getString(1));
                c.setSemestre(rs.getString(2));
                c.setClave(rs.getString(3));
                lista.add(c);
            }
        } 
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
        return lista;
    }

    public List verhorario(String nc){
        List<EntidadHorario> lista=new ArrayList<EntidadHorario>();
        String sql="SELECT semestre.clave,materia.nombre FROM uan.semestre INNER JOIN uan.materia ON semestre.clave=materia.clave where semestre.nocontrol=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,nc);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadHorario c=new EntidadHorario();
                c.setClave(rs.getString(1));
                c.setSemestre(rs.getString(2));
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
        String sql="INSERT INTO uan.semestre (nocontrol,semestre,clave) VALUES (?,?,?)";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarM(String nc,String clave) {
        String sql="DELETE FROM uan.semestre WHERE nocontrol=? and clave=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,nc);
            ps.setString(2,clave);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
