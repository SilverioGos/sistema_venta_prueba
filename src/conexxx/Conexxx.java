package conexxx;
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

public class Conexxx {
    private final String base= "libreria";
    private final String user= "root";
    private final String password= "";
    private final String url= "jdbc:mysql://localhost:33065/"+base;
    private Connection con=null;
    
    public Connection conexxx;
    public Statement sentencia;
    public ResultSet resultado;
    
    public Connection getConexxx(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);        
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Conexxx.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
              
    }
    
// Codigo para imprimir los datos de una tabla y verificar si esta conectada la base de datos    
    /*public static void main (String[] args){
        Conexxx cn= new Conexxx();
        Statement st;
        ResultSet rs;
        try{
            cn.getConexxx();
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from autor");
            while (rs.next()){
                System.out.println(rs.getString("cod_au")+" "+rs.getString("nom_au")+" "+rs.getString("ape_au"));
            }
            cn.con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion fallida");
        }
    }*/
}
