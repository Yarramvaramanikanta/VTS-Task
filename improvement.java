package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class improvement {

	public String Progresses(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection madam= null;
		try {
			madam= DriverManager.getConnection("jdbc:mysql://localhost:3306/yerram","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from improvement";
		PreparedStatement view;
		try {
			view = madam.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				if(email.equals(rs.getString("i_email"))) {
					if(email.equals(rs.getString("i_email"))) {
						if(rs.getBoolean("i_c")== false) {
							System.out.println("c++" + " - "+"Not Completed");
						}
						else {
							System.out.println("c++" + " - "+"Completed");
						}
						if(rs.getBoolean("i_cyber")== false) {
							System.out.println("Cyber Security" + " - "+"Not Completed");
						}
						else {
							System.out.println("Cyber Security" + " - "+"Completed");
						}
						if(rs.getBoolean("i_AI")== false) {
							System.out.println("AI" + " - "+"Not Completed");
						}
						else {
							System.out.println("AI" + " - "+"Completed");
						}
					}
						
	            	
				}
			}
		}
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return email;
		

	}

}
