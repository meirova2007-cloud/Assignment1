import java.sql.Connection;
import java.sql.DriverManager;
public class Db {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/oop",
                    "postgres",
                    "12345"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
