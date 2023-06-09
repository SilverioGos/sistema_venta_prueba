package conexxx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class clienteDAO implements CRUD{
    Connection con ;
    Conexxx cn=new Conexxx();
    PreparedStatement ps;
    ResultSet rs;

    public cliente listarID(String nombre){
        cliente c=new cliente();
        String sql="select* from clientes where cod_cliente=?";
        try{
            Conexxx cc = new Conexxx();
            Connection con = cc.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            while (rs.next()){
                c.setCod_cliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setEdad(rs.getInt(4));
                c.setEmail(rs.getString(5));
                c.setDireccion(rs.getString(6));
            }
                    
        } catch (Exception e){
            
        }
        return c;
    }
    
    @Override
    public List listar() {
        List<cliente> lista =new ArrayList<>();
        String sql="select * from clientes";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                cliente c=new cliente();
                c.setCod_cliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setEdad(rs.getInt(4));
                c.setEmail(rs.getString(5));
                c.setDireccion(rs.getString(6));
                lista.add(c);
            }    
        } catch (Exception e){     
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into clientes(nombre, apellido, edad, email, direccion)values(?,?,?,?,?)"; 
        try{
           con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate(); 
        } catch(Exception e){
            
        }
        return r; 
    }  
    
    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update clientes set nombre=?, apellido=?, edad=?, email=?, direccion=? where cod_cliente=?";
        try {
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate(); 
        } catch (Exception e){
            
        }
        return r;
    }

    @Override
    public void eliminar(int cod_) {
        String sql="delete from clientes where cod_cliente=?";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cod_);
            ps.executeUpdate(); 
        } catch (Exception e) {
            
        }
    }
    
}
