package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CalificacionDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarNC(String nc) {
        List<EntidadHorario> lista=new ArrayList<EntidadHorario>();
        String sql="SELECT * FROM uan.semestre INNER JOIN uan.materia ON semestre.clave=materia.clave where semestre.nocontrol=?";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        List<EntidadCalificacion> lista=new ArrayList<>();
        String sql="SELECT * FROM uan.calificacion";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadCalificacion ec=new EntidadCalificacion();
                ec.setNocontrol(rs.getString(1));
                ec.setClave(rs.getString(2));
                ec.setCalificacion(rs.getString(3));
                lista.add(ec);
            }
        }
        catch (Exception e) {
            System.out.print("ERROR"+e);
        }
        return lista;
    }
    
}
