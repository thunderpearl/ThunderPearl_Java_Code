package JavaPractice;

//STEP 1. Import required packages
import java.sql.*;

public class JDBC_tom1 {
	// driver and connector is same thing
	
 // JDBC driver name and database URL
	// The driver class for mysql database is "com.mysql.jdbc.Driver"
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:4357/grade8";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "meliodas";
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
	 
	 // In latest jdk, we do not need to register the driver
	 
    //STEP 2: Register JDBC driver with driver manager
       Class.forName(JDBC_DRIVER);

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    // createStatement() is the method of connection interface.
    stmt = conn.createStatement();
    String sql;
    sql = "SELECT ID, NAME, AGE, ADDRESS, SALARY FROM customers";
    // executeQuery() is the method of Statement interface which return object of ResultSet
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int id  = rs.getInt("ID");
       String name = rs.getString("NAME");
       int age = rs.getInt("AGE");
       String address = rs.getString("ADDRESS");
       int salary = rs.getInt("SALARY");

       //Display values
       System.out.print("ID: " + id);
       System.out.println("Name: "+ name);
       System.out.print(", Age: " + age);
       System.out.print(", First: " + address);
       System.out.println(", Last: " + salary);
    }
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}//end FirstExample
