package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
public static void main(String[] args) {
	
 TreeSet tr=new TreeSet();
	
 tr.add(100);
 tr.add(200);
 tr.add(500);
 tr.add(50);
 tr.add(100);
 tr.add(200);
 tr.add(100);
 tr.add(200);
 //tr.add(null);
 System.out.println(tr);  //[50, 100, 200, 500]
 System.out.println(tr.contains(400)); // false
 System.out.println(tr.size()); // 4
 System.out.println(tr.first()); // 50
 System.out.println(tr.last()); // 500
	
 tr.pollFirst();  //[100, 200, 500]
 System.out.println(tr);
	
 tr.pollLast();   //[100, 200]
 System.out.println(tr);
	
 tr.add(600);
 tr.add(25);
	
 System.out.println(tr);
 System.out.println("---print info using iterator--Asending order-");
 Iterator itr = tr.iterator();
 while (itr.hasNext()) {
  System.out.println(itr.next());
  
 }
	
 System.out.println("---print info using iterator-> descending order---");

 Iterator itr1 = tr.descendingIterator();
 while (itr1.hasNext()) {
  System.out.println(itr1.next());  
 }
	
 
}
}
