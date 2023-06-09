
package conexxx;
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class sqlUsuarios extends Conexxx {
    public boolean registrar(usuarios usr){
        PreparedStatement ps = null;
        Connection con = getConexxx();
        
        String sql="INSERT INTO user (usuario, contra) VALUES (?,?)";       
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getContra());
            ps.execute();
            return true;
        
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
    public boolean login(usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexxx();
        
        String sql="SELECT cod_user, usuario, contra FROM user WHERE usuario = ?";       
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usr.getContra().equals(rs.getString(3))){
                    usr.setCod_user(rs.getInt(1));
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
}
