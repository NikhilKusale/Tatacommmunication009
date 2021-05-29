package Logical_Program;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String org ="NIKIN";  //  <  >
		String rev ="";
		for(int i=org.length()-1; i>=0 ; i--)

   {
	   rev=rev+org.charAt(i);
	
   }
		
   if (org.equals(rev)) {
	   
	   System.out.println("Given String is Pallindrome");
   }
   else {
	   
	   System.out.println("Given String is not Pallindrome");
   }
   
   
	}

}
