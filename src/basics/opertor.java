package basics;
import java.util.Scanner;
public class opertor {
	static Scanner s;
	
	public void arithmatic() {
		 
		System.out.println("artahamic");
		int a,b,c;
		System.out.println("enter a,b values");
		
		a = s.nextInt();
		b = s.nextInt();
		c=a+b;
		System.out.println("addition of a and b is"+c);
		c=a-b;
		System.out.println("substraction of a and b is"+c);
		c=a*b;
		System.out.println("multiplicatin of a and b is"+c);
		c=a/b;
		System.out.println("division of a and b is"+c);
		c=a%b;
		System.out.println("percentage of a and b is"+c);
	
	}
	public static void main(String []args) {
		s = new Scanner(System.in);
		opertor obj = new opertor();
		obj.arithmatic();
	}
	}
	
	


