package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector {

	public static void main(String[] args) {

           Vector V=new Vector();
           

           V.add("Nikhil");
           V.add(100);
           V.add('A');
           V.add(100);
           V.add(null);
           V.add(null);

//                System.out.println(V.capacity());  //10
//                System.out.println(V.size()); //6
//                System.out.println(V.isEmpty());  //False
//                System.out.println(V.get(3));  //100
//                System.out.println(V.contains("Nikhil"));  //true
//                System.out.println(V.indexOf('A'));   //2
//                System.out.println(V.lastIndexOf(100));  //3
//                System.out.println(V);
                
              //insert info in between vector--> right shift operation
//                V.add(2, 55.5f);
//                System.out.println(V);


                // remove/delete info in between vector--> left shift operation
//                V.remove(2);
//                System.out.println(V);


             // update/modify info in vector
//                V.set(0, "xyz");
//                System.out.println(V);

//                System.out.println("-----print all info in vector using iterator cursor---------");
//                Iterator itr = V.iterator();
//                while (itr.hasNext()) {
//                 System.out.println(itr.next());
//                }


//                System.out.println("-----print all info in vector using listIterator cursor---------");
//                ListIterator litr = V.listIterator();
//                 while (litr.hasNext()) {
//                 System.out.println(litr.next());
//                }


//                 System.out.println("-----print all info in vector using for loop---------");
//                 for (int i = 0; i <= V.size() - 1; i++) {
//                  System.out.println(V.get(i));
//                 }


//                 System.out.println("-----print all info in vector using foreach loop---------");
//                 for (Object s1 : V) {
//                  System.out.println(s1);
//                 }




                 System.out.println("-----print all info in vector using enumeration cursor---------");
                 Enumeration enu = V.elements();
                 while (enu.hasMoreElements()) {
                  System.out.println(enu.nextElement());
                 }








	}

}
