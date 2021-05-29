package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList {
	 public static void main(String[] args) {

	  LinkedList ll = new LinkedList();
	  ll.add("abc");
	  ll.add(100);
	  ll.add('A');
	  ll.add(100);
	  ll.add(null);
	  ll.add(null);

	  System.out.println(ll);
	  
	  
	  System.out.println(ll.size()); // 6
	  System.out.println(ll.isEmpty()); // false

	  System.out.println(ll.get(3)); // 100

	  System.out.println(ll.contains("abc")); // true
	  System.out.println(ll.indexOf('A')); // 2
	  System.out.println(ll.lastIndexOf(100)); // 3
	  System.out.println(ll);

	  // add/insert info in between linkedlist
	  ll.add(2, 55.5f);
	  System.out.println(ll);

	  // remove/delete info in between linkedlist
	  ll.remove(2);
	  System.out.println(ll);

	  // update/modify info in linkedlist
	  ll.set(0, "xyz");
	  System.out.println(ll);

	  System.out.println("-----print all info in linkedlist using iterator cursor---------");
	  Iterator itr = ll.iterator();
	  while (itr.hasNext()) {
	   System.out.println(itr.next());
	  }

//	  System.out.println("-----print all info in linkedlist using listIterator cursor---------");
//	  ListIterator litr = ll.listIterator();
//	  while (litr.hasNext()) {
//	   System.out.println(litr.next());
//	  }

//	  System.out.println("-----print all info in linkedlist using for loop---------");
//	  for (int i = 0; i <= ll.size() - 1; i++) {
//	   System.out.println(ll.get(i));
//	  }
//
//	  System.out.println("-----print all info in linkedlist using foreach loop---------");
//	  for (Object s1 : ll) {
//	   System.out.println(s1);
	//  }

	 }
}