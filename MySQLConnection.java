package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public Connection myConnection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String dataBaseName = "trial1";
        String userName = "root";
        String password = "telmah1";

        Class.forName("com.mysql.cj.jdbc.Driver");

         myConnection = DriverManager.getConnection("jdbc:mysql://localhost/"+dataBaseName,userName,password);

        return myConnection;
    }
}
