package Set;

import java.util.HashSet;
import java.util.Iterator;

public class _Hashset {
	 public static void main(String[] args) {
	  HashSet hs = new HashSet();
	  hs.add("abc");
	  hs.add(100);
	  hs.add('A');
	  hs.add(100);
	  hs.add(null);
	  hs.add(null);

	  System.out.println(hs);
	  System.out.println(hs.contains(100)); // true
	  System.out.println(hs.size()); // 4
	  System.out.println(hs.isEmpty()); // false
	  hs.remove(null);
	  System.out.println(hs);

	  System.out.println("--print all info in hashset using iterator--");

//	  Iterator itr = hs.iterator();
//	  while (itr.hasNext()) {
//	   System.out.println(itr.next());
//	  }
//
//	  System.out.println("--print all info in hashset using foreach loop--");
//
//	  for (Object s1 : hs) {
//	   System.out.println(s1);
//	  }
	  
	  hs.clear();
	  System.out.println(hs.size()); //0

	 }
	}
