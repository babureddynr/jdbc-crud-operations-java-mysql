package jdbccrud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcsop {
    public static void main(String[] args) throws SQLException {
        Connection c = null;
        CallableStatement stmt = null;

        // Establishing the connection
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        
        // Creating the database
        stmt = c.prepareCall("CREATE DATABASE IF NOT EXISTS crud");
        boolean dbCreated = stmt.execute();
        System.out.println("Database created: " + dbCreated);

        // Selecting the database
        c.setCatalog("crud");

        // Creating the table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS BABUJDBC (" +
                                "id INT PRIMARY KEY," +
                                "name VARCHAR(50) NOT NULL," +
                                "salary DOUBLE NOT NULL," +
                                "phno BIGINT UNIQUE)";
        stmt = c.prepareCall(createTableSQL);
        boolean tableCreated = stmt.execute();
        System.out.println("Table created: " + tableCreated);

        
        
        // Inserting values into the table
        String insertSQL = "INSERT INTO BABUJDBC (id, name, salary, phno) VALUES (9, 'Johnn Dooe', 500000, 12388997890)";
        stmt = c.prepareCall(insertSQL);
        int rowsInserted = stmt.executeUpdate();
        System.out.println("Rows inserted: " + rowsInserted);
        
        // Updating a record in the table
        String updateSQL = "UPDATE BABUJDBC SET salary = 600000 WHERE id = 9";
        stmt = c.prepareCall(updateSQL);
        int rowsUpdated = stmt.executeUpdate();
        System.out.println("Rows updated: " + rowsUpdated);
        
        // Deleting a record from the table
        String deleteSQL = "DELETE FROM BABUJDBC WHERE id = 9";
        stmt = c.prepareCall(deleteSQL);
        int rowsDeleted = stmt.executeUpdate();
        System.out.println("Rows deleted: " + rowsDeleted);
        
     // Deleting all records from the table
        String deleteAllRecordsSQL = "DELETE FROM BABUJDBC";
        stmt = c.prepareCall(deleteAllRecordsSQL);
        int rowsDeleted1 = stmt.executeUpdate();
        System.out.println("All rows deleted: " + rowsDeleted1);
        
       
        // Closing resources
        if (stmt != null) stmt.close();
        if (c != null) c.close();
    }
}
