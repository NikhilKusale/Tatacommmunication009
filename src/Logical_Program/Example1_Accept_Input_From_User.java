
package Logical_Program;

import java.util.Scanner;

public class Example1_Accept_Input_From_User {
  // SAME LIKE CALCULATER
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Num2");
		int Num1 = scan.nextInt();    //Accept Input From User
		
		System.out.println("Enter Num1");
		
		int Num2 = scan.nextInt();    
		System.out.println("Addition of 2 Num:"+ (Num1 +Num2));
		
		
		
		
	}
}
