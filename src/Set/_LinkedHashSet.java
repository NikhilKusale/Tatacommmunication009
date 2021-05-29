package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _LinkedHashSet {
	 public static void main(String[] args) {
	  LinkedHashSet lhs = new LinkedHashSet();
	  lhs.add("abc");
	  lhs.add(100);
	  lhs.add('A');
	  lhs.add(100);
	  lhs.add(null);
	  lhs.add(null);

	  System.out.println(lhs);
	  System.out.println(lhs.contains(100)); // true
	  System.out.println(lhs.size()); // 4
	  System.out.println(lhs.isEmpty()); // false
	  lhs.remove(null);
	  System.out.println(lhs);

	  System.out.println("--print all info in hashset using iterator--");

	  Iterator itr = lhs.iterator();
	  while (itr.hasNext()) {
	   System.out.println(itr.next());
	  }

	  System.out.println("--print all info in hashset using foreach loop--");

	  for (Object s1 : lhs) {
	   System.out.println(s1);
	  }
	  
	  lhs.clear();
	  System.out.println(lhs.size());

	 }
	}
