package modelo;

import java.util.*;

public interface CRUD {
    
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(String id);
}
