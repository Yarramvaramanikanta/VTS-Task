package classmain;
import java.util.*;

public class classmain {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int useropt=1;
		
		while(useropt==1) {
			System.out.println("*********************");
			System.out.println("Enter 1 to register");
			System.out.println("Enter 2 to login");
			System.out.println("Enter 3 to Leave");
			int select=Sc.nextInt();
			
			if(select==1) {
				EnrolementRegestration r=new EnrolementRegestration();
				r.EnrolementRedestration();
			}
			else if(select ==2) {
				log l=new log();
				l.logins();
			}
			else if(select==3) {
				System.out.println("Thank you");
				break;
			}
		}
	}

}