
package conexxx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class autoresDAO implements CRUD{
    Connection con ;
    Conexxx cn=new Conexxx();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<autores> lista =new ArrayList<>();
        String sql="select * from autor";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                autores c=new autores();
                c.setCod_au(rs.getInt(1));
                c.setNom_autor(rs.getString(2));
                c.setApe_autor(rs.getString(3));
                c.setNacionalidad(rs.getString(4));
                lista.add(c);
            }    
        } catch (Exception e){     
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into autor(nom_autor, ape_autor, nacionalidad)values(?,?,?)"; 
        try{
           con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate(); 
        } catch(Exception e){
            
        }
        return r; 
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update autor set nom_autor=?, ape_autor=?, nacionalidad=? where cod_au=?";
        try {
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate(); 
        } catch (Exception e){
            
        }
        return r;
    }

    @Override
    public void eliminar(int cod_) {
        String sql="delete from autor where cod_au=?";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cod_);
            ps.executeUpdate(); 
        } catch (Exception e) {
            
        }
    }
    
    

    
   
}
