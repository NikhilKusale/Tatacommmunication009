package Logical_Program;

public class Prime_Number {

	public static void main(String[] args) {
		
		
		
		int num   =3;
		int count =0;
		
		for (int i =2; i< num ; i++) {
			if(num % i == 0) {
				
				count ++;
				break;
				
			}
		}
		
		if (count == 1)
		{
			System.out.println("Given number is not a Prime Number");
		}
		
		else
		{
			System.out.println("Given number is  a Prime Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
