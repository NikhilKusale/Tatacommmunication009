package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		  al.add("Nikhil");
		  al.add(100);
		  al.add('A');
		  al.add('N');
		  al.add(100);
		  al.add(null);  
		  al.add(null);
	      al.add("Balaji");
		  
		  System.out.println(al.indexOf('N'));

	  System.out.println(al); //All Arraylist in row
	   
	 System.out.println(al.size()); //6
	   
	  System.out.println(al.isEmpty());  //False
	   
	   
	   System.out.println(al.get(3));  //100
	   
	   
	   System.out.println(al.contains("Nikhil"));   //True
	   
	   
		//System.out.println(al.indexOf('A'));     //2
	   
	   
	//	System.out.println(al.lastIndexOf(100));  //3
		
		System.out.println(al.clone());
		
	 
		
		// insert info in between Arraylist--> right shift operation

//		al.add(3, 99.5f);
//	   System.out.println(al);
//		
	  // remove/delete info in between Arraylist--> left shift operation
	//	al.remove(3);
//		System.out.println(al);
//		
//		
//		//update/modify info in Arraylis
//		al.set(4,"Sachin" );
//		System.out.println(al);
//		
		




//	  System.out.println("-----print all info in arraylist using iterator cursor---------");
//	  Iterator itr = al.iterator();
//		while (itr.hasNext());
//		{
//		System.out.println(itr.next());
//		}
//		
//		
//		System.out.println("-----print all info in arraylist using listIterator cursor---------");
//		  ListIterator litr = al.listIterator();
//		  while (litr.hasNext()) {
//		  System.out.println(litr.next());
		//  }



//		  System.out.println("-----print all info in arraylist using for loop---------");
//		  for (int i = 0; i <= al.size() - 1; i++)
//		  {
//		  System.out.println(al.get(i));
//		 }

//		 System.out.println("-----print all info in arraylist using foreach loop---------");    
//		  
//		  for(Object s1:al){
//		  System.out.println(s1);}
	}

}
