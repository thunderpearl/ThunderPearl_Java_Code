package MySQLwordcount;

import java.io.IOException;
import java.sql.*;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// This is the format of input(key as LongWritable and value as Text) and 
// output(key as Text and value as IntWritable)
public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
			// driver and connector is same thing
			
			 // JDBC driver name and database URL
				// The driver class for mysql database is "com.mysql.jdbc.Driver"
			 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			 final String DB_URL = "jdbc:mysql://localhost:4357/grade8";
			
			 
			 //  Database credentials
			 final String USER = "root";
			 final String PASS = "meliodas";
			 
			 
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
			    sql = "SELECT NAME,SALARY FROM customers";
			    // executeQuery() is the method of Statement interface which return object of ResultSet
			    ResultSet rs = stmt.executeQuery(sql);

			    //STEP 5: Extract data from result set
			    while(rs.next()){
			       //Retrieve by column name
			     //  int id  = rs.getInt("ID");
			       String name = rs.getString("NAME");
			     //  int age = rs.getInt("AGE");
			     //  String address = rs.getString("ADDRESS");
			       int salary = rs.getInt("SALARY");
			       
			       
			       
					// Here we store the word in text(string) format 
					Text OutKey = new Text(name); // Text is string format in
					
					// Here we give value as 1 for every retrieved text.
					IntWritable One = new IntWritable(salary); // IntWritable is integer format in hadoop
					context.write(OutKey, One);	// Here we have output the text	and assign the value 1.		
					// context is an object used to communicate with the mapreduce systems.
			  	  	// It unifies the role of JobConf, 
			  	  	// OutputCollector, and Reporter from old API.

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

			
		}
	}

