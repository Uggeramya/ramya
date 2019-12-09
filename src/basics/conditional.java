package basics;
import java.util. Scanner;
public class conditional {
	public static void main(String [] args) {
		 Scanner sc = new Scanner (System.in);
		 //simple if
		 //verify given number  integer
		 float f =7.5f;
		 if (f>=0);{
		 System.out.println("given numer is negative");
			 
		 }
		
		 //if else
	//verify given is prime
		 if(f%2==1) {
			 System.out.println("given number is prime");
		 }
		 else 
		 {
System.out.println("not a prime");				 
			 }
		 
//		 //else if ladder
//	 //twitter
//		 System.out.println(" enter user name");
//		 String username= sc.next();
//	 //pas
//		 System.out.println("enter passwrd");
//		 String passwrd = sc.next();
//	 if(username.equalsIgnoreCase ("ramya")&& passwrd.equals("chinna123")) {
//	
//		 System.out.println("welcome");
// }
//		 else {
//			 System.out.println("invalid");
//	 }
		//nested if
		 
		 System.out.println(" enter browser");
	 String rname = sc .next();
		 if(rname.equalsIgnoreCase("chorme"))
		 {
			 System.out.println("open chorme");		 }
	 else if(rname.equalsIgnoreCase("firefax"))
		 {
			 System.out.println("open firefox");
		 }
		 else if(rname.equalsIgnoreCase("opera")) {
		 System.out.println("open opera");
		 }
//switch case
		switch (rname.toLowerCase()) {
		case "ramya":
			System.out.println("ramya");
			break;
		case "haritha":
			System.out.println("haritha");
			break;
			default:
				System.out.println("anu");
		
		}
	}

}
