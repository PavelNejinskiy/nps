package MySQLDataBase;

import java.sql.*;

/**
 * Created by pavel on 29/09/2017.
 */
public class ConnectToDB {

    //String JDBCURL = "jdbc:mysql://195.138.70.170:3306/test";
    String JDBCURL = "jdbc:mysql://localhost/";
    String DBDriver = "com.mysql.jdbc.Driver";
    String LOGIN = "root";
   //   String PASSWORD = "adminiptv2017";
    String PASSWORD = "root";
    Statement stmt = null;
    Connection conn = null;

    void connect() throws SQLException, ClassNotFoundException {

        try {
           Class.forName(DBDriver);
             conn = DriverManager.getConnection(JDBCURL, LOGIN, PASSWORD);

             stmt = conn.createStatement();

            stmt.executeUpdate("CREATE DATABASE if not exists students;");
            stmt.executeUpdate("use students;");
            stmt.execute("create table if not exists students(id int primary key auto_increment, NAME VARCHAR(255), LastName VARCHAR(255))");

            stmt.execute("CREATE TABLE if not exists AcademicSubjects(students_id int, foreign key (students_id) references students (id), " +
                    "mathematics VARCHAR(255), " +
                    "physics VARCHAR(255), " +
                    "philosophy VARCHAR(255), " +
                    "programming VARCHAR(255))");

            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Vasya', 'Vasechkin')");
            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Petya', 'Petrov')");
            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Ivan', 'Ivanov')");
            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Kolya', 'Kozlov')");
            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Dima', 'Dimanoz')");
            stmt.execute("INSERT INTO Students (NAME, LastName) VALUES ('Stepa', 'Fimon')");

            stmt.execute("INSERT INTO AcademicSubjects (Students_id, mathematics, physics, philosophy, programming) VALUES (1,2,5,5,6)");
            stmt.execute("INSERT INTO AcademicSubjects (Students_id, mathematics, physics, philosophy, programming) VALUES (2,2,2,2,5)");
            stmt.execute("INSERT INTO AcademicSubjects (Students_id, mathematics, physics, philosophy, programming) VALUES (3,3,3,3,5)");
            stmt.execute("INSERT INTO AcademicSubjects (Students_id, mathematics, physics, philosophy, programming) VALUES (4,4,4,4,4)");


            ResultSet resultSet = stmt.executeQuery("select * from Students where id in  (select students_id from AcademicSubjects where programming = 5);");
            while (resultSet.next()){
                String name = resultSet.getString("NAME");
                System.out.println(name + " has 5 in programming");
            }

        } catch (Exception e) {e.printStackTrace();
        }finally {
           conn.close();
        }
    }

}
