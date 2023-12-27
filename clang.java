package classmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class clang {

	public void c() {
		System.out.println("Enter 1 to basics of c++");
		System.out.println("Enter 2 to intermediate of c++");
		System.out.println("Enter 3 to advancedof c++");
		int option;
		String complete = null;
		Scanner Sc=new Scanner(System.in);
		option=Sc.nextInt();
		if(option==1) {
			  System.out.println("### 1. Hello World Program:");
		        System.out.println("```cpp");
		        System.out.println("#include <iostream>");
		        System.out.println();
		        System.out.println("int main() {");
		        System.out.println("    std::cout << \"Hello, World!\" << std::endl;");
		        System.out.println("    return 0;");
		        System.out.println("}");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 2. Variables and Data Types:");
		        System.out.println("```cpp");
		        System.out.println("int age = 25;");
		        System.out.println("double pi = 3.14159;");
		        System.out.println("char grade = 'A';");
		        System.out.println("std::string name = \"John\";");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 3. Basic Input/Output:");
		        System.out.println("```cpp");
		        System.out.println("int number;");
		        System.out.println("std::cout << \"Enter a number: \";");
		        System.out.println("std::cin >> number;");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 4. Control Flow:");
		        System.out.println("```cpp");
		        System.out.println("if (condition) {");
		        System.out.println("    // code if condition is true");
		        System.out.println("} else {");
		        System.out.println("    // code if condition is false");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("switch (variable) {");
		        System.out.println("    case value1:");
		        System.out.println("        // code");
		        System.out.println("        break;");
		        System.out.println("    case value2:");
		        System.out.println("        // code");
		        System.out.println("        break;");
		        System.out.println("    // ...");
		        System.out.println("    default:");
		        System.out.println("        // code if no match is found");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("for (int i = 0; i < 5; ++i) {");
		        System.out.println("    // code executed 5 times");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("while (condition) {");
		        System.out.println("    // code executed while condition is true");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("do {");
		        System.out.println("    // code executed at least once, then repeats while condition is true");
		        System.out.println("} while (condition);");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 5. Functions:");
		        System.out.println("```cpp");
		        System.out.println("int add(int a, int b);");
		        System.out.println();
		        System.out.println("int add(int a, int b) {");
		        System.out.println("    return a + b;");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("int result = add(3, 4);");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 6. Arrays and Strings:");
		        System.out.println("```cpp");
		        System.out.println("int numbers[5] = {1, 2, 3, 4, 5};");
		        System.out.println();
		        System.out.println("std::string greeting = \"Hello\";");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 7. Pointers:");
		        System.out.println("```cpp");
		        System.out.println("int x = 10;");
		        System.out.println("int *ptr = &x; // Pointer to the memory address of x");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 8. Memory Management:");
		        System.out.println("```cpp");
		        System.out.println("int *dynamicArray = new int[5]; // Allocate memory for an array");
		        System.out.println("delete[] dynamicArray; // Deallocate memory");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 9. Comments:");
		        System.out.println("```cpp");
		        System.out.println("// This is a single-line comment");
		        System.out.println();
		        System.out.println("/*");
		        System.out.println("   This is a");
		        System.out.println("   multi-line comment");
		        System.out.println("*/");
		        System.out.println("```");
			
			System.out.println("You completed 1st Stage of pyhton");
    		complete = complete + "c";
    		System.out.println("If You want to continue enter 2");
    		option = Sc.nextInt();	
		
		}if(option==2) {
			 System.out.println("### 1. Object-Oriented Programming (OOP):");
		        System.out.println("```cpp");
		        System.out.println("// Class declaration");
		        System.out.println("class MyClass {");
		        System.out.println("public:");
		        System.out.println("    int myVariable;");
		        System.out.println("    void myMethod();");
		        System.out.println("};");
		        System.out.println();
		        System.out.println("// Class definition");
		        System.out.println("void MyClass::myMethod() {");
		        System.out.println("    // code");
		        System.out.println("}");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 2. STL (Standard Template Library):");
		        System.out.println("```cpp");
		        System.out.println("#include <vector>");
		        System.out.println("#include <algorithm>");
		        System.out.println();
		        System.out.println("// Vector usage");
		        System.out.println("std::vector<int> numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5};");
		        System.out.println("std::sort(numbers.begin(), numbers.end()); // Sorting");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 3. File Handling:");
		        System.out.println("```cpp");
		        System.out.println("#include <fstream>");
		        System.out.println();
		        System.out.println("// Reading from a file");
		        System.out.println("std::ifstream inputFile(\"input.txt\");");
		        System.out.println("if (inputFile.is_open()) {");
		        System.out.println("    std::string line;");
		        System.out.println("    while (getline(inputFile, line)) {");
		        System.out.println("        // process each line");
		        System.out.println("    }");
		        System.out.println("    inputFile.close();");
		        System.out.println("}");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 4. Exception Handling:");
		        System.out.println("```cpp");
		        System.out.println("try {");
		        System.out.println("    // code that might throw an exception");
		        System.out.println("} catch (const std::exception& e) {");
		        System.out.println("    std::cerr << \"Exception caught: \" << e.what() << std::endl;");
		        System.out.println("}");
		        System.out.println();

		        System.out.println("throw MyException(\"Custom exception message\");");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 5. Templates:");
		        System.out.println("```cpp");
		        System.out.println("// Function template");
		        System.out.println("template <typename T>");
		        System.out.println("T myTemplateFunction(T param) {");
		        System.out.println("    // code");
		        System.out.println("    return param;");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("int result = myTemplateFunction(42);");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 6. Memory Management (Smart Pointers):");
		        System.out.println("```cpp");
		        System.out.println("#include <memory>");
		        System.out.println();
		        System.out.println("std::unique_ptr<int> uniquePointer = std::make_unique<int>(42);");
		        System.out.println("std::shared_ptr<int> sharedPointer = std::make_shared<int>(42);");
		        System.out.println("// No need for explicit deletion");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 7. Concurrency:");
		        System.out.println("```cpp");
		        System.out.println("#include <thread>");
		        System.out.println("#include <mutex>");
		        System.out.println();
		        System.out.println("std::mutex myMutex;");
		        System.out.println();
		        System.out.println("void myThreadFunction() {");
		        System.out.println("    std::lock_guard<std::mutex> lock(myMutex);");
		        System.out.println("    // thread-safe code");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("std::thread myThread(myThreadFunction);");
		        System.out.println("myThread.join();");
		        System.out.println("```");
			
			
			System.out.println("You completed 2st Stage of pyhton");
    		complete = complete + "o";
    		System.out.println("If You want to continue enter 3");
    		option = Sc.nextInt();	
		}
		if(option==3) {
			
			 System.out.println("### 1. Modern C++ Features (C++11/14/17/20):");
		        System.out.println("```cpp");
		        System.out.println("std::cout << \"Exploring features like lambda expressions, auto keyword, and smart pointers.\" << std::endl;");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 2. Template Metaprogramming:");
		        System.out.println("```cpp");
		        System.out.println("template <int N>");
		        System.out.println("struct Factorial {");
		        System.out.println("    static const int value = N * Factorial<N - 1>::value;");
		        System.out.println("};");
		        System.out.println();
		        System.out.println("const int result = Factorial<5>::value;");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 3. Advanced Memory Management:");
		        System.out.println("```cpp");
		        System.out.println("std::shared_ptr<MyClass> sharedPtr = std::make_shared<MyClass>(args);");
		        System.out.println("std::unique_ptr<MyClass> uniquePtr = std::make_unique<MyClass>(args);");
		        System.out.println("// Utilizing custom allocators and advanced memory techniques.");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 4. Advanced OOP Concepts:");
		        System.out.println("```cpp");
		        System.out.println("class Shape {");
		        System.out.println("public:");
		        System.out.println("    virtual void draw() = 0;");
		        System.out.println("};");
		        System.out.println();
		        System.out.println("class Circle : public Shape {");
		        System.out.println("public:");
		        System.out.println("    void draw() override { /* code */ }");
		        System.out.println("};");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 5. Concurrency in C++:");
		        System.out.println("```cpp");
		        System.out.println("#include <thread>");
		        System.out.println("std::mutex myMutex;");
		        System.out.println();
		        System.out.println("void myThreadFunction() {");
		        System.out.println("    std::lock_guard<std::mutex> lock(myMutex);");
		        System.out.println("    // thread-safe code");
		        System.out.println("}");
		        System.out.println();
		        System.out.println("std::thread myThread(myThreadFunction);");
		        System.out.println("myThread.join();");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 6. Custom Memory Allocators:");
		        System.out.println("```cpp");
		        System.out.println("void* customMalloc(std::size_t size) { /* code */ }");
		        System.out.println("void customFree(void* ptr) { /* code */ }");
		        System.out.println();
		        System.out.println("int* customIntArray = static_cast<int*>(customMalloc(5 * sizeof(int)));");
		        System.out.println("customFree(customIntArray);");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 7. Advanced STL Usage:");
		        System.out.println("```cpp");
		        System.out.println("// Implementing custom comparators and allocators for STL containers.");
		        System.out.println("std::vector<int, MyAllocator<int>> customVector;");
		        System.out.println("std::sort(customVector.begin(), customVector.end(), customComparator);");
		        System.out.println("```");
		        System.out.println();

		        System.out.println("### 8. C++ Networking and Boost Library:");
		        System.out.println("```cpp");
		        System.out.println("// Exploring network programming and utilizing the Boost C++ Libraries.");
		        System.out.println("#include <boost/asio.hpp>");
		        System.out.println("// ...");
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


