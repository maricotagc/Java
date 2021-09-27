import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractBaseTest {

    //Method to create table 
    public void createTables(Connection connection) throws SQLException {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String createBookTable = "DROP TABLE IF EXISTS book;" +
                    " CREATE TABLE book " +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " name TEXT NOT NULL, " +
                    " author TEXT NOT NULL)";
            statement.executeUpdate(createBookTable);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            statement.close();
        }
    }
}
