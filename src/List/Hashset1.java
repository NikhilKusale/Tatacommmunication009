package List;

import java.util.ArrayList;
import java.util.HashSet;

import com.sun.media.sound.AlawCodec;

public class Hashset1 {

	public static void main(String[] args) {
		
		
		HashSet Hs = new HashSet();
		
		  Hs.add("Nikhil");
		  Hs.add(100);
		  Hs.add('A');
		  Hs.add(100);
		  Hs.add(null);  
		  Hs.add(null);

 System.out.println(Hs); //All Arraylist in row
	   
	  //System.out.println(Hs.size()); //6
	   
	  //System.out.println(al.isEmpty());  //False
	   
	   
	   //System.out.println(al.get(3));  //100
	   
	   
	   //System.out.println(al.contains("Nikhil"));   //True
	   
	   
		//System.out.println(al.indexOf('A'));     //2
	   
	   
		//System.out.println(al.lastIndexOf(100));  //3
		
	
		
	    //System.out.println(al);
		
		//insert info in between Arraylist--> right shift operation

		//al.add(3, 99.5f);
	   //System.out.println(al);
		
	     // remove/delete info in between Arraylist--> left shift operation
		//al.remove(3);
		//System.out.println(al);
		
		
		//update/modify info in Arraylis
		//al.set(4,"Sachin" );
		//System.out.println(al);
		
		




		//  System.out.println("-----print all info in arraylist using iterator cursor---------");
		//Iterator itr = al.iterator();
		//while (itr.hasNext());
		//{
		//System.out.println(itr.next());
		//}
		
		
		//System.out.println("-----print all info in arraylist using listIterator cursor---------");
		 // ListIterator litr = al.listIterator();
		 // while (litr.hasNext()) {
		   //System.out.println(litr.next());
		 // }



		 // System.out.println("-----print all info in arraylist using for loop---------");
		 // for (int i = 0; i <= al.size() - 1; i++)
		  //{
		  // System.out.println(al.get(i));
		 // }

		  System.out.println("-----print all info in arraylist using foreach loop---------");    
		  
		  for(Object s1:Hs){
		  System.out.println(s1);}
	


		
		
		

	}

}
