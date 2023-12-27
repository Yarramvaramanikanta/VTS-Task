package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EnrolementRegestration {
	 String user_name;
	    String user_email;
	    String user_password;
	    int u_Id;
	    Scanner sc = new Scanner(System.in);
		public void EnrolementRedestration() {
			System.out.println("Enter Your Name : ");
			user_name = sc.next();
			System.out.println("Enter Your Email : ");
			user_email = sc.next();
			System.out.println("Enter Your Password : ");
			user_password = sc.next();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection madam = null;
			
			try {
				
				madam=DriverManager.getConnection("jdbc:mysql://localhost:3306/yerram","root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 String mani = "INSERT INTO regi(us_Name, us_Email, us_Password) VALUES (?, ?, ?)";
			 try
				 (PreparedStatement ps = madam.prepareStatement(mani)) {
			            ps.setString(1, user_name);
			            ps.setString(2, user_email);
			            ps.setString(3, user_password);

			            ps.executeUpdate();
				 }
			  
			 catch (SQLException e) {
				 e.printStackTrace();
			 }
			        String query1="select * from regi";
					PreparedStatement view;
					try {
						
						view = madam.prepareStatement(query1);
						ResultSet rs = view.executeQuery();
						while (rs.next()) {
				            if(user_email.equals(rs.getString("us_Email"))) {
				            	u_Id = rs.getInt("us_Id");
				            }
						}
					}
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					int opt = 1;
					
					while(opt == 1) {
						System.out.println("*********************************");
						System.out.println("Your Registration is successful");
						System.out.println("*********************************");
						System.out.println("Enter->1 Login");
						System.out.println("Enter->2 Leave");
						int select = sc.nextInt();
						String insertProductQuery = "insert into improvement (i_ID,i_name,i_email,i_c,i_cyber,i_AI) VALUES (?, ?, ?, '0', '0', '0')";
			            try (PreparedStatement insertps = madam
			                    .prepareStatement(insertProductQuery)) {
			                insertps.setInt(1, u_Id);
			                insertps.setString(2, user_name);
			                insertps.setString(3, user_email);
			                insertps.executeUpdate();
			            }
			            catch (SQLException e) {
			    			// TODO Auto-generated catch block
			    			e.printStackTrace();
			    		}
						
						if(select == 1) {
							log l = new log();
							l.logins();
							System.out.println("Thanks for visiting");
							opt = 2;
						}
						else if(select == 2) {

							System.out.println("Thanks for visiting");
							opt = 2;
						}
					}
					
				}

			


			 
				 
			 
					 
			 

			
		
}
