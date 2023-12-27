package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AI {

	public void lang() {
		System.out.println("Enter 1 to basics of AI");
		System.out.println("Enter 2 to intermediate of AI");
		System.out.println("Enter 3 to advancedof AI");
		int option;
		String complete = null;
		Scanner Sc=new Scanner(System.in);
			option=Sc.nextInt();
			if(option==1) {
				System.out.println("### 1. Introduction to Artificial Intelligence:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Artificial Intelligence (AI) is the simulation of human intelligence in machines.\");");
			        System.out.println("System.out.println(\"It involves the development of algorithms that enable machines to perform tasks that typically require human intelligence.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 2. Types of Artificial Intelligence:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"- Narrow AI (Weak AI): Designed for a specific task, e.g., virtual assistants.\");");
			        System.out.println("System.out.println(\"- General AI (Strong AI): Capable of understanding, learning, and performing any intellectual task.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 3. Machine Learning Basics:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Using algorithms that allow machines to learn from data and make predictions or decisions.\");");
			        System.out.println("System.out.println(\"Supervised learning, unsupervised learning, and reinforcement learning are common paradigms.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 4. Natural Language Processing (NLP):");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Enabling machines to understand, interpret, and generate human language.\");");
			        System.out.println("System.out.println(\"Applications include chatbots, language translation, and sentiment analysis.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 5. Computer Vision:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Teaching machines to interpret and understand visual information from the world.\");");
			        System.out.println("System.out.println(\"Image recognition, object detection, and facial recognition are common tasks.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 6. Expert Systems:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Rule-based systems designed to emulate the decision-making ability of a human expert in a specific domain.\");");
			        System.out.println("System.out.println(\"Used for tasks such as diagnosis and problem-solving.\");");
			        System.out.println("```");
			        System.out.println();
	
			        System.out.println("### 7. AI Ethics and Bias:");
			        System.out.println("```java");
			        System.out.println("System.out.println(\"Considering ethical implications of AI, including transparency, accountability, and fairness.\");");
			        System.out.println("System.out.println(\"Addressing biases in training data and algorithms.\");");
			        System.out.println("```");
			        complete = complete+"c";
			        System.out.println("Enter 2");
			        option =Sc.nextInt();
			        
	    	}
				if(option==2) {
					System.out.println("### 1. Machine Learning Algorithms:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Implementing various machine learning algorithms such as decision trees, support vector machines, and k-nearest neighbors.\");");
		        System.out.println("System.out.println(\"Understanding the principles behind supervised and unsupervised learning.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 2. Clustering and Dimensionality Reduction:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Applying clustering algorithms like k-means and hierarchical clustering.\");");
		        System.out.println("System.out.println(\"Utilizing dimensionality reduction techniques such as principal component analysis (PCA).\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 3. Time Series Analysis and Forecasting:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Analyzing time-dependent data using methods like autoregressive integrated moving average (ARIMA) and LSTM networks.\");");
		        System.out.println("System.out.println(\"Predicting future values and trends based on historical data.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 4. Recommender Systems:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Building recommender systems using collaborative filtering and content-based approaches.\");");
		        System.out.println("System.out.println(\"Personalizing recommendations for users based on their preferences.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 5. Natural Language Processing (NLP) Applications:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Implementing text classification, named entity recognition, and sentiment analysis.\");");
		        System.out.println("System.out.println(\"Utilizing tools like spaCy and NLTK for processing and analyzing text data.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 6. Ensemble Learning Techniques:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Building ensemble models like random forests and gradient boosting for improved predictive performance.\");");
		        System.out.println("System.out.println(\"Understanding the concept of combining multiple models to make more accurate predictions.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 7. Model Evaluation and Hyperparameter Tuning:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Evaluating machine learning models using metrics like accuracy, precision, and recall.\");");
		        System.out.println("System.out.println(\"Optimizing model performance through hyperparameter tuning.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 8. AI in Healthcare and Biotechnology:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Applying AI techniques for medical image analysis, disease prediction, and drug discovery.\");");
		        System.out.println("System.out.println(\"Addressing challenges and ethical considerations in the healthcare domain.\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 9. AI in Business and Finance:");
		        System.out.println("```java");
		        System.out.println("System.out.println(\"Utilizing AI for fraud detection, risk management, and predictive analytics in business and finance.\");");
		        System.out.println("System.out.println(\"Understanding the impact of AI on decision-making processes in these industries.\");");
		        System.out.println("```");
		        
		        System.out.println("You completed 2st Stage of pyhton");
	    		complete = complete + "o";
	    		System.out.println("If You want to continue enter 3");
	    		option = Sc.nextInt();
		}
		if(option==3) {
			System.out.println("### 1. Deep Learning and Neural Networks:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Building and training deep neural networks using frameworks like TensorFlow or PyTorch.\");");
	        System.out.println("System.out.println(\"Exploring advanced architectures like convolutional neural networks (CNNs) and recurrent neural networks (RNNs).\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 2. Natural Language Processing (NLP):");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Implementing language models, sentiment analysis, and named entity recognition.\");");
	        System.out.println("System.out.println(\"Utilizing pre-trained models such as BERT and GPT for advanced language understanding.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 3. Reinforcement Learning:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Creating and training agents using reinforcement learning algorithms.\");");
	        System.out.println("System.out.println(\"Implementing Q-learning, deep Q networks (DQN), and policy gradients.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 4. Generative Adversarial Networks (GANs):");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Building GANs for image generation, style transfer, and data augmentation.\");");
	        System.out.println("System.out.println(\"Understanding the interplay between generators and discriminators.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 5. Transfer Learning:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Leveraging pre-trained models for specific tasks, fine-tuning, and domain adaptation.\");");
	        System.out.println("System.out.println(\"Using transfer learning to achieve better performance with limited data.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 6. Explainable AI (XAI):");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Understanding and implementing models with interpretable results.\");");
	        System.out.println("System.out.println(\"Exploring techniques to make complex AI models more transparent and accountable.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 7. AI for Edge Computing:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Deploying machine learning models on edge devices for real-time processing.\");");
	        System.out.println("System.out.println(\"Optimizing models for performance and resource constraints.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 8. Autonomous Systems and Robotics:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Developing AI algorithms for autonomous vehicles, drones, and robotic systems.\");");
	        System.out.println("System.out.println(\"Implementing computer vision and sensor fusion for navigation and decision-making.\");");
	        System.out.println("```");
	        System.out.println();

	        System.out.println("### 9. AI Ethics and Bias Mitigation:");
	        System.out.println("```java");
	        System.out.println("System.out.println(\"Addressing ethical considerations in AI development and deployment.\");");
	        System.out.println("System.out.println(\"Implementing strategies to identify and mitigate biases in AI models.\");");
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
    		        	System.out.println("To Get certificate comlete Basic c++");
    		        	e=1;
    		        }
    		        if(o==0) {
    		        	System.out.println("To Get certificate comlete Intermediate c++");
    		        	e=1;
    		        }
    		        
    		        if (e==0) {
    		        	System.out.println("Please confirm your email to send certificate to your mail");
    		        	String email = Sc.next();
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
    		    	            	
    		    	            	
    		    	        		String updateProductQuery = "UPDATE improvement SET i_c = ? WHERE i_email = ?";
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
		
		
	


