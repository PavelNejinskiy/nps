package MySQLDataBase;

import java.sql.SQLException;


/**
 * Created by pavel on 29/09/2017.
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectToDB db = new ConnectToDB();

        db.connect();

    }
}
