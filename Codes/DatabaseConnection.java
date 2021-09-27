import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseManager {
    
  private static final String URL = "jdbc:sqlite:test.db";
  private Connection connection;

  //Constructor which will stabilish connection with the database
  public DatabaseManager() throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL);
        } catch (Exception e) {
            throw new Exception("It was not possible to connect to the bookshop database", e);
        }
  }

  //Method to return the connection
  public Connection getConnection() {
        return connection;
  }

  public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
