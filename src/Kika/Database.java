package Kika;

import java.sql.*;

public class Database {

        // JDBC driver name and database URL
            static final String JDBC_DRIVER = "org.h2.Driver";
            static final String DB_URL = "jdbc:h2:~/test";

            //  Database credentials
            static final String USER = "sa";
            static final String PASS = "";


            public void insertResult (String player1, String player2, String winner){
                Connection conn = null;
                Statement stmt = null;
                try{
                    // STEP 1: Register JDBC driver
                    Class.forName(JDBC_DRIVER);

                    // STEP 2: Open a connection
                    System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    System.out.println("Connected database successfully...");

                    // STEP 3: Execute a query
                    stmt = conn.createStatement();
                    String sql = "INSERT INTO results (player1, player2, winner) " +
                            "VALUES (' "+ player1 +"', ' "+ player2+ " ', ' "+ winner +" ')";

                    stmt.executeUpdate(sql);
                    System.out.println("Inserted records into the table...");

                    // STEP 4: Clean-up environment
                    stmt.close();
                    conn.close();
                } catch(SQLException se) {
                    // Handle errors for JDBC
                    se.printStackTrace();
                } catch(Exception e) {
                    // Handle errors for Class.forName
                    e.printStackTrace();
                } finally {
                    // finally block used to close resources
                    try {
                        if(stmt!=null) stmt.close();
                    } catch(SQLException se2) {
                    } // nothing we can do
                    try {
                        if(conn!=null) conn.close();
                    } catch(SQLException se) {
                        se.printStackTrace();
                    } // end finally try
                } // end try
                System.out.println("Goodbye!");
            }

            public static void readResults () {
                Connection conn = null;
                Statement stmt = null;
                try {
                    // STEP 1: Register JDBC driver
                    Class.forName(JDBC_DRIVER);

                    // STEP 2: Open a connection
                    System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);

                    // STEP 3: Execute a query
                    System.out.println("Connected database successfully...");
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM results";
                    ResultSet rs = stmt.executeQuery(sql);

                    // STEP 4: Extract data from result set
                    while(rs.next()) {
                        // Retrieve by column name
                        int id  = rs.getInt("id");
                        String player1 = rs.getString("player1");
                        String player2= rs.getString("player2");
                        String winner = rs.getString("winner");

                        // Display values
                        System.out.print("ID: " + id);
                        System.out.print(", Player1: " + player1);
                        System.out.println(", Player2: " + player2);
                        System.out.println( ", Winner: " +  winner);

                    }
                    // STEP 5: Clean-up environment
                    rs.close();
                } catch(SQLException se) {
                    // Handle errors for JDBC
                    se.printStackTrace();
                } catch(Exception e) {
                    // Handle errors for Class.forName
                    e.printStackTrace();
                } finally {
                    // finally block used to close resources
                    try {
                        if(stmt!=null) stmt.close();
                    } catch(SQLException se2) {
                    } // nothing we can do
                    try {
                        if(conn!=null) conn.close();
                    } catch(SQLException se) {
                        se.printStackTrace();
                    } // end finally try
                } // end try
                System.out.println();
                System.out.println("Goodbye!");
            }
}

