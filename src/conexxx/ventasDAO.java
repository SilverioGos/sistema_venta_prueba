/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexxx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ventasDAO {
    Connection con ;
    Conexxx cn=new Conexxx();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    public String IdVentas(){
        String idv="";
        String sql="select max(IdVentas) from ventas";
        try {
            Conexxx cc = new Conexxx();
            Connection con = cc.getConexxx();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                idv=rs.getString(1);
            }    
        } catch (Exception e) {              
        }
        return idv;    
    }
    public int GuardarVentas(ventas v){
        ventas ventas=new ventas();
        String sql="insert into ventas(cod_cliente,cod_emp,NumeroVentas,FechaVentas,Monto,Estado) values(?,?,?,?,?,?)";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getCod_clientes());
            ps.setInt(2, v.getCod_emp());
            ps.setString(3, v.getNumeroVentas());
            ps.setString(4, v.getFechaVentas());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            r=ps.executeUpdate();
        } catch (Exception e){    
        }
        return r;
        
    }
    
    public int GuardarDetalleVentas(DetallesVenta dv){
        String sql="insert into detalle_ventas(IdVentas, Cantidad, PrecioVenta,cod_lib)";
        try{
            con=cn.getConexxx();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getCantidad());
            ps.setDouble(3, dv.getPreVenta());
            ps.setInt(4, dv.getIdLibros());
            r=ps.executeUpdate();
        } catch (Exception e){    
        }
        return r;
        }
    
    
}