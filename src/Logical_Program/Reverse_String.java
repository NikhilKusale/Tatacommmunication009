package Logical_Program;

public class Reverse_String {

	public static void main(String[] args) {
		
		String org ="NIKHIL";
		String rev ="";
		
		//5                         0>=0
		
		for(int i=org.length()-1 ; i>=0 ; i--)
		{
			
			rev=rev + org.charAt(i);
			
		}
			
			
			System.out.println(rev);
			
	}

}
