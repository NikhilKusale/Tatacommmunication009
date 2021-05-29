package Logical_Program;

public class Find_total_no_of_White_space_in_String {

	public static void main(String[] args) {
		
		
		String str = " ab  c d";
		int count =0;  //4
		
		for (int i=0 ; i<=str.length()-1; i++) {
		
			char str1 = str.charAt(i);
		
		
		      if(str1 ==' ') {
				count ++;
				
			}
			
			System.out.println("No of Space in Given String :"+ count );
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
