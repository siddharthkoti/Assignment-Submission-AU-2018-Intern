import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*; 

public class csvjdbc {

    public static void main(String[] args) throws SQLException {

        String csvFile = "x.csv";
        String line = "";
        String cvsSplitBy = ",";
        String table_name = "csvToJDBC";
        int len;
        
        Connection con;
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
		
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/advjavajdbc","root","root");
		
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
        	if((line = br.readLine()) != null) {
//        		System.out.println("line:" + line);
        		String[] heading = line.split(cvsSplitBy);
        		len = heading.length;
//        		System.out.println(len);
        		
        		String q = "create table " + table_name + "(";
        		//"Host_Name varchar(50),IP_address varchar(40),OS varchar(40),Load_avg_1min varchar(40),Load_avg_5min varchar(40),Load_avg_15min varchar(40));";
        		
        		for(int i = 0; i< len ;i++) {
                	q += heading[i] + " varchar(40)";
                	if(i == len-1) 
                	{
                		break;
                	}
                	q+= ",";
                }
                
                q+=")";
        		
                System.out.println("Query " + q);
                Statement stm;
                stm = con.createStatement();
				
				int rs = stm.executeUpdate(q);
        	
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                
                String query = "INSERT INTO "+ table_name +" ( Host_Name, IP_address, OS,Load_avg_1min, Load_avg_5min, Load_avg_15min) VALUES (";
                for(int i = 0; i< len ;i++) {
                	query += "\"" + country[i] + "\"";
                	if(i == len-1) 
                	{
                		break;
                	}
                	query+= ",";
                }
                
                query+=")";
                
                System.out.println("Query " + query);
                Statement stmt;
				try {
					stmt = con.createStatement();
				
					int r = stmt.executeUpdate(query);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                
                
            }
        	

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        con.close();
        System.out.println("added succesfully!");
    }
}



