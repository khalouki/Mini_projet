package projet;
import java.sql.*;
public class conn_bd {
      public conn_bd(){}
      Connection con;
      public Connection getcon(){     
          try {
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojet", "root", "");
          } catch (SQLException ex) {
             Erreur ab= new Erreur();
             ab.setVisible(true);
             ab.setLocationRelativeTo(null);
          }
          return con;
   }
      
}

