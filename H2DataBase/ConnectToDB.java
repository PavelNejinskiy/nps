package H2DataBase;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by pavel on 29/09/2017.
 */
public class ConnectToDB {

    String JDBCURL = "jdbc:h2:~/test";
    String DBDriver = "org.h2.Driver";

    String LOGIN = "root";
    String PASSWORD = "root";


    void connect() {
        JdbcDataSource db = new JdbcDataSource();

        db.setURL(JDBCURL);
        db.setUser(LOGIN);
        db.setPassword(PASSWORD);

        try (Connection connection = db.getConnection()) {
            Statement statement = connection.createStatement();


            statement.execute("CREATE TABLE Students(ID INT auto_increment, NAME VARCHAR(255), LastName VARCHAR(255))");
            statement.execute("CREATE TABLE AcademicSubjects(ID INT auto_increment, Subject-Matter INT(255))");


            statement.execute("INSERT INTO Students VALUES (Vasya, Vasechkin)");
            statement.execute("INSERT INTO Students VALUES (Petya, Petrov)");
            statement.execute("INSERT INTO Students VALUES (Ivan, Ivanov)");
            statement.execute("INSERT INTO Students VALUES (Kolya, Kozlov)");
            statement.execute("INSERT INTO Students VALUES (Dima, Dimanoz)");
            statement.execute("INSERT INTO Students VALUES (Stepa, Fimon)");

            statement.execute("INSERT INTO AcademicSubjects VALUES (mathematics, Fimon)");
//mathematics physics, philosophy, programming,

        } catch (Exception e) {e.printStackTrace();
        }
    }

}
