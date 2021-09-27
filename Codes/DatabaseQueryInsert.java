import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static final String SQL_INSERT = "INSERT INTO book (name, author) VALUES (?,?)";

    private final Connection connection;

    public BookRepository(Connection connection) {
        this.connection = connection;
    }

    public int add(Book b) throws Exception {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, b.getName());
            preparedStatement.setString(2, b.getAuthor());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new Exception("It was not possible to add the book: " + b, exception);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return result;
    }
}
