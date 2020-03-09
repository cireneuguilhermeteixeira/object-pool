
import java.sql.Connection;
import org.hsqldb.jdbcDriver;



public class Main {
    public static void main(String args[]) throws NullPointerException {

        // cria conexão com ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mydb",
                "root", "");

        // Obtem a conexão:
        Connection connection1 = pool.getObject();
        Connection connection2 = pool.getObject();
        Connection connection3 = pool.getObject();

        // libera a conexão:
        pool.releaseObject(connection1);
        pool.releaseObject(connection2);
        pool.releaseObject(connection3);


        Connection connection4 = pool.getObject();
        Connection connection5 = pool.getObject();




        pool.releaseObject(connection4);
        pool.releaseObject(connection5);


    }
}