import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author javie
 */
public class Conexion {
    
    
    public static Connection getConnection(){
        Connection a = null;
        try{
            String basedatos = "proyecto";
            String usuario = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/" + basedatos;
            Class.forName("com.mysql.jdbc.Driver");
            a = DriverManager.getConnection(url, usuario, password);
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "Error 2 en la conexion a base de datos"+ex.getMessage(), JOptionPane.ERROR_MESSAGE); 
            a = null; 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Error 3 en la conexion a base de datos"+ex.getMessage(), JOptionPane.ERROR_MESSAGE); 
            a = null; 
        } finally{
            return a;
        }
    }
}
