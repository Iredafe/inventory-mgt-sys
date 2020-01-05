package stockmgtpackage;

//import statements for relevant classes 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MySqlConnection {

    public static Connection getConnection(){
    Connection con = null;
    String url= "jdbc:mysql://localhost:3306/stockmgt_db?useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username= "root";
    String password = "";
       
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, username, password);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
return con;    
    }
}
