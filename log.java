package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class log {

	public void logins() {
		String email;
		String password;
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Registered Email Id:");
			email=sc.next();
			System.out.println("Enter Your password");
			password=sc.next();
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			Connection yes=null;
			
			try {
				yes=DriverManager.getConnection("jdbc:mysql://localhost:3306/yerram","root","root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			String que1="select * from regi";
			PreparedStatement view;
			int user=1;
			try {
				view = yes.prepareStatement(que1);
				ResultSet rs=view.executeQuery();
				while (rs.next()) {
					  if(email.equals(rs.getString("us_Email")) && password.equals(rs.getString("us_Password"))) {
			            	int opt=1;
			            	user=2;
			            	System.out.println("*********************************");
		        			System.out.println("Your Logged into the website");
		        			System.out.println("*********************************");
		        			while(opt ==1) {
		        				System.out.println("*********************************");
			        			System.out.println("Enter 1 to Diplay the courses");
			        			System.out.println("Enter 2 to Improvement");
			        			System.out.println("Enter 3 to log out");
			        			System.out.println("*********************************");
			        			System.out.println("");
			        			int select = sc.nextInt();
			        			
			        			
			        			if(select == 1) {
			        				displaycourse s=new displaycourse();
			        				s.displays();
			        			}
			        			if(select == 2) {
			        				improvement a=new improvement();
			        				email = a.Progresses(email);
			        			}
			        			if(select == 3) {
			        				System.out.println("You are Logged Out");
			        				System.out.println("Thank You !");
			        				opt =2;
			        				break;
			        				
			        			}
			        			
			        		}
							break;
			            }
			             
					}
					if(user == 1) {
			           	System.out.println(" Your User Name or Password are wrong");
			           	System.out.println("Please check it once");
			            
						}
		      		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
			        		
			
		
	

}
