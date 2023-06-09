package conexxx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class empleadosDAO implements CRUD{
    Connection con ;
    Conexxx cn=new Conexxx();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<empleados> lista =new ArrayList<>();
        String sql="select * from empleados";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                empleados c=new empleados();
                c.setCod_emp(rs.getInt(1));
                c.setNom_emp(rs.getString(2));
                c.setApe_emp(rs.getString(3));
                c.setCargo(rs.getString(4));
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
        String sql="insert into empleados(nom_emp, ape_emp, cargo, email, direccion)values(?,?,?,?,?)"; 
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
        String sql="update empleados set nom_emp=?, ape_emp=?, cargo=?, email=?, direccion=? where cod_emp=?";
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
        String sql="delete from empleados where cod_emp=?";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cod_);
            ps.executeUpdate(); 
        } catch (Exception e) {
            
        }
    }
    
    
}
