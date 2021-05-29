package Logical_Program;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int orgNum = 154;
		int sum =0;
		for(int i =orgNum ;i>0; i=i/10)
		{
			
			int rem=i % 10 ;
			sum = sum+(rem*rem*rem);
			
		}
			
		if (orgNum == sum )
		{
			System.out.println("Given Number " + orgNum + " is an Armstrong" );
		}
		else
		{
			System.out.println("Given Number "+ orgNum +  "  is not an Armstrong");
		}
		
		
	}

}
