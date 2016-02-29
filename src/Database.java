import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Database {
    static String driver ="com.mysql.jdbc.Driver";
    static String url ="jdbc:mysql://localhost:3306/test";
    
    public static Connection con() throws Exception { // this method is used to create the connection to the local database!!!
        Class.forName(driver);
        Connection Conection1 = DriverManager.getConnection(url , "root" , "test" );
        return Conection1;
    }
    
    public ResultSet GetInformation ( String sqlcommand ) { //This is the method to take data from the local database
        try {
          Statement State1=Database.con().createStatement();
          ResultSet rset=State1.executeQuery(sqlcommand);
          return rset;
        }
        catch (Exception e){
              String error_message = e.getMessage();
              JOptionPane.showMessageDialog(null, error_message , "Error" , JOptionPane.ERROR_MESSAGE);
              return null;
        }
    }
    
    public void putdata(String sql) throws Exception{ // this method is used to pass all the values from the GUI to the database
      try {
        PreparedStatement pState = Database.con().prepareStatement(sql);
        pState.executeUpdate();
        JOptionPane.showMessageDialog(null,"Database Successfully Altered","Success", JOptionPane.NO_OPTION);
      }
      catch (Exception e) {
          String error_message = e.getMessage();
          JOptionPane.showMessageDialog(null, error_message, "Database error", JOptionPane.ERROR_MESSAGE);
      }
  }
    
}
