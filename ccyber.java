package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ccyber {

	public void cybers() {
		System.out.println("Enter 1 to basics of cyber security");
		System.out.println("Enter 2 to intermediate of cyber security");
		System.out.println("Enter 3 to advanced2 of cyber security");
		int option;
		String complete = null;
		Scanner Sc = new Scanner(System.in) ;
			option=Sc.nextInt();
			if(option==1) {
				 System.out.println("### 1. Introduction to Cybersecurity:");
			        System.out.println("Cybersecurity involves protecting computer systems, networks, and data from security breaches.");
			        System.out.println();

			        System.out.println("### 2. Types of Cyber Attacks:");
			        System.out.println("```plaintext");
			        System.out.println("- Malware: Software designed to harm or exploit systems.");
			        System.out.println("- Phishing: Deceptive attempts to obtain sensitive information.");
			        System.out.println("- Denial of Service (DoS) Attacks: Overloading a system to disrupt services.");
			        System.out.println("- Man-in-the-Middle (MitM) Attacks: Intercepting and altering communication.");
			        System.out.println("- SQL Injection: Exploiting vulnerabilities in database queries.");
			        System.out.println("```");
			        System.out.println();

			        System.out.println("### 3. Importance of Password Security:");
			        System.out.println("```java");
			        System.out.println("String password = \"MySecurePassword123!\";");
			        System.out.println("if (password.length() >= 12 && containsDigits(password) && containsSpecialChars(password)) {");
			        System.out.println("    System.out.println(\"Password is strong.\");");
			        System.out.println("} else {");
			        System.out.println("    System.out.println(\"Password is weak. Consider using a longer, more complex password.\");");
			        System.out.println("}");
			        System.out.println();
			        System.out.println("boolean containsDigits(String str) {");
			        System.out.println("    return str.matches(\".*\\d+.*\");");
			        System.out.println("}");
			        System.out.println();
			        System.out.println("boolean containsSpecialChars(String str) {");
			        System.out.println("    return str.matches(\".*[!@#$%^&*()_+{}|<>?].*\");");
			        System.out.println("}");
			        System.out.println("```");
			        System.out.println();

			        System.out.println("### 4. Network Security Basics:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Encrypting sensitive data during transmission to prevent eavesdropping.\");");
			        System.out.println("System.out.println(\"Implementing firewalls to control incoming and outgoing network traffic.\");");
			        System.out.println("System.out.println(\"Regularly updating and patching systems to address vulnerabilities.\");");
			        System.out.println("```");
			        System.out.println();

			        System.out.println("### 5. Basic Principles of Cryptography:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Confidentiality: Ensuring data is only accessible to authorized parties.\");");
			        System.out.println("System.out.println(\"Integrity: Verifying data is not altered during storage or transmission.\");");
			        System.out.println("System.out.println(\"Authentication: Confirming the identity of users or systems.\");");
			        System.out.println("System.out.println(\"Non-repudiation: Preventing denial of actions performed by a user.\");");
			        System.out.println("```");
			        System.out.println();

			        System.out.println("### 6. Software and System Updates:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Regularly updating operating systems and software to apply security patches.\");");
			        System.out.println("System.out.println(\"Enabling automatic updates to ensure timely protection against vulnerabilities.\");");
			        System.out.println("```");
			        System.out.println();

			        System.out.println("### 7. User Education and Awareness:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Educating users about common cyber threats and best security practices.\");");
			        System.out.println("System.out.println(\"Promoting awareness of social engineering tactics, such as phishing.\");");
			        System.out.println("```");
			       
			       
				
			}
			if(option==2) {
				System.out.println("### 1. Secure Network Protocols:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing secure protocols like HTTPS for encrypted communication.\");");
			    System.out.println("System.out.println(\"Using VPNs to create secure and private communication channels.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 2. Intrusion Detection and Prevention Systems (IDPS):");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Deploying IDPS to detect and respond to potential security threats.\");");
			    System.out.println("System.out.println(\"Setting up alerts for suspicious activities and unauthorized access.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 3. Security Information and Event Management (SIEM):");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing SIEM solutions to centralize and analyze security event data.\");");
			    System.out.println("System.out.println(\"Correlating information to identify security incidents.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 4. Multi-Factor Authentication (MFA):");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Enhancing authentication with MFA to add an extra layer of security.\");");
			    System.out.println("System.out.println(\"Using factors like passwords, biometrics, and one-time codes.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 5. Web Application Security:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing secure coding practices to prevent common web vulnerabilities.\");");
			    System.out.println("System.out.println(\"Regularly testing and scanning web applications for security flaws.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 6. Incident Response Planning:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Developing and testing incident response plans for effective handling of security incidents.\");");
			    System.out.println("System.out.println(\"Establishing communication channels and roles during incidents.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 7. Security Awareness Training for Employees:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Providing regular training on security best practices for employees.\");");
			    System.out.println("System.out.println(\"Simulating phishing attacks to educate users about potential threats.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 8. Data Encryption Techniques:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Utilizing advanced encryption algorithms to protect sensitive data.\");");
			    System.out.println("System.out.println(\"Encrypting data at rest, in transit, and during processing.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 9. Security Auditing and Compliance:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Conducting regular security audits to assess compliance with industry standards.\");");
			    System.out.println("System.out.println(\"Ensuring adherence to regulations such as GDPR, HIPAA, or PCI DSS.\");");
			    System.out.println("```");
				
				
				System.out.println("You completed 2st Stage of pyhton");
				complete = complete + "o";
				System.out.println("If You want to continue enter 3");
				option = Sc.nextInt();	
			}

			if(option==3) {
				System.out.println("### 1. Advanced Persistent Threats (APTs):");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Understanding and mitigating APTs, which are prolonged and targeted cyber attacks.\");");
			    System.out.println("System.out.println(\"Implementing advanced threat intelligence and monitoring techniques.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 2. Threat Hunting and Cyber Threat Intelligence:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Proactively searching for security threats within networks using advanced analytics.\");");
			    System.out.println("System.out.println(\"Leveraging cyber threat intelligence to enhance security measures.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 3. Zero Trust Security Model:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing a Zero Trust model, where trust is never assumed, and verification is continuous.\");");
			    System.out.println("System.out.println(\"Securing access at every level, regardless of user location or network.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 4. Blockchain for Cybersecurity:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Exploring the use of blockchain for securing transactions and preventing data tampering.\");");
			    System.out.println("System.out.println(\"Applying decentralized and immutable ledgers for enhanced security.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 5. Cloud Security and Virtualization:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing robust cloud security measures to protect data stored in cloud environments.\");");
			    System.out.println("System.out.println(\"Ensuring security in virtualized environments through hypervisor-level protection.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 6. Internet of Things (IoT) Security:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Addressing security challenges in IoT devices through encryption and access control.\");");
			    System.out.println("System.out.println(\"Monitoring and securing the communication between IoT devices.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 7. Quantum Cryptography:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Exploring quantum-resistant cryptographic algorithms to secure communication.\");");
			    System.out.println("System.out.println(\"Preparing for the impact of quantum computing on current encryption standards.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 8. Biometric Security Systems:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Implementing advanced biometric authentication systems for enhanced identity verification.\");");
			    System.out.println("System.out.println(\"Utilizing fingerprints, facial recognition, and other biometric factors.\");");
			    System.out.println("```");
			    System.out.println();

			    System.out.println("### 9. Cybersecurity Automation and Orchestration:");
			    System.out.println("```java");
			    System.out.println("System.out.println(\"Leveraging automation tools to streamline security processes and incident response.\");");
			    System.out.println("System.out.println(\"Orchestrating different security tools for a more coordinated defense.\");");
			    System.out.println("```");
			
			System.out.println("You completed 3st Stage of pyhton");
			complete = complete + "m";
    		int c=0;
	        int o=0;
	        int e=0;
        		for(int i=0; i<complete.length(); i++) {
    	        	if( complete.contains("c")) {
    	        		c=1;
    	        	}
    	        	if(complete.contains("o")) {
    	        		o=1;
    	        	}
        		}
    	        	if(c==0) {
    		        	System.out.println("To Get certificate comlete Basic Cyber Security");
    		        	e=1;
    		        }
    		        if(o==0) {
    		        	System.out.println("To Get certificate comlete Intermediate Cyber Security");
    		        	e=1;
    		        }
    		        String email;
    		        if (e==0) {
    		        	System.out.println("Please confirm your email to send certificate to your mail");
    		        	email = Sc.next();
    		        	try {
    		    			Class.forName("com.mysql.cj.jdbc.Driver");
    		    		} catch (ClassNotFoundException e1) {
    		    			// TODO Auto-generated catch block
    		    			e1.printStackTrace();
    		    		}
    		    		Connection krishna = null;
    		    		try {
    		    			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3306/yerram","root","root");
    		    		} catch (SQLException e1) {
    		    			// TODO Auto-generated catch block
    		    			e1.printStackTrace();
    		    		}
    		    		String query="select * from regi";
    		    		PreparedStatement view;
    		        	try {
    		    			int user=1;
    		    			view = krishna.prepareStatement(query);
    		    			ResultSet rs = view.executeQuery();
    		    			while (rs.next()) {
    		    	            if(email.equals(rs.getString("us_Email"))) {
    		    	            	user=2;
    		    	            	
    		    	            	
    		    	        		String updateProductQuery = "UPDATE improvement SET i_cyber = ? WHERE i_email = ?";
    	                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
    	                                updateProductStatement.setInt(1, 1);
    	                                updateProductStatement.setString(2, email);
    	                                updateProductStatement.executeUpdate();
    	                            }
    		    	            }
    		    			}
    		    			if(user == 1) {
    		    				System.out.println("Please enter your email with registerd email");
    		    				
    		    			}
    		    			else {
    		    				System.out.println("Your certificate is send to your mail....");
    		    			}
    		        	
    		        	}
    		        	catch (SQLException e1) {
    		    			// TODO Auto-generated catch block
    		    			e1.printStackTrace();
    		    		}
    		        }
    				
    			}
		
        }
    
		
	
}

	
	
  



	
		
		
		
	


