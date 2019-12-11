package basics;
import java.util.Scanner;

public class leapyear
//if else
 {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 2050;
		if(((i%4==0)&&(i%100!=0))||(i%400==0)) 	{
		System.out.println("leap yr");
		}
		else {
		System.out.println("non leap yr");
		
			
		}
		//nested if
		double n1=-2.4,n2= 3,n3=-4.5;
		if(n1<=n2) {
			if(n3>=n1) {
				
				System.out.println("large no is n2");
			}
			else {
		
			System.out.println("smallest no is n3");
			}
		}
		else {
			System.out.print("large no");
			System.out.println(" invalid number");
		}
		// else if ladder
		
			int number=-134;
			if (number>0) {
				System.out.println("positive" );
			}else if(number<0){
				System.out.println("negative");
			}else {
			System.out.println("zero");	
			}
			//else if ladder
			
			
			}
		}
			
	
	

