/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexxx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibrosDAO implements CRUD {
    Connection con ;
    Conexxx cn=new Conexxx();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
   /* public libros listarID(int cod_lib){
        libros l=new libros();
        String sql="select * from libro where cod_lib=?";
        try {
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                l.setCod_lib(rs.getInt(1));
                l.setEdicion(rs.getInt(2));
                l.setFecha_lib(rs.getString(3));
                l.setEditorial(rs.getString(4));
                l.setTitulo(rs.getString(5));
                l.setPrecio(rs.getDouble(6));
                l.setCod_au(rs.getInt(7));
                
        } catch (Exception e){   
        }
        return l;
    }*/
    
    @Override
    public List listar() {
        List<libros> lista =new ArrayList<>();
        String sql="select * from libro";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                libros l=new libros();
                l.setCod_lib(rs.getInt(1));
                l.setEdicion(rs.getInt(2));
                l.setFecha_lib(rs.getString(3));
                l.setEditorial(rs.getString(4));
                l.setTitulo(rs.getString(5));
                l.setPrecio(rs.getDouble(6));
                l.setCod_au(rs.getInt(7));
                lista.add(l);
            }    
        } catch (Exception e){     
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into libro(edicion, fecha_lib, editorial, titulo, precio, cod_au)values(?,?,?,?,?,?)"; 
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
        String sql="update libro set edicion=?, fecha_lib=?, editorial=?, titulo=?, precio=?, cod_au=? where cod_lib=?";
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
        String sql="delete from libro where cod_lib=?";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cod_);
            ps.executeUpdate(); 
        } catch (Exception e) {
            
        }
    }
    
    
}
