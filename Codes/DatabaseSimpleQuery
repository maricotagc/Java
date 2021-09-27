import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static final String SQL_SELECT_ALL = "SELECT id, name, author FROM book";
    private final Connection connection;

    public BookRepository(Connection connection) {
        this.connection = connection;
    }

    public List<Book> findAll() throws Exception {
        List<Book> books = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Book book1 = new Book();
                book1.setId(rs.getInt("id"));
                book1.setName(rs.getString("name"));
                book1.setAuthor(rs.getString("author"));
                books.add(book1);
            }
        } catch (Exception e) {
            throw new Exception("It was not possible to find books", e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return books;
    }
}
