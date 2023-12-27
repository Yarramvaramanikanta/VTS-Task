package classmain;

import java.util.Scanner;

public class displaycourse {

	public void displays() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("**************************");
		System.out.println("Courses Available");
		System.out.println("Enter 1->C++ ");
		System.out.println("Enter 2-> cybsecurityer ");
		System.out.println("Enter 3-> AI");
		System.out.println("**************************");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			clang a = new clang();
			a.c();
		}
		else if(choice == 2) {
			ccyber b = new ccyber();
			b.cybers();
		}
		else if(choice == 3) {
			AI c = new AI();
			c.lang();
		}		
	 }
	

		
	}


