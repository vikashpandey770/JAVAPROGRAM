package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("vikash");
		hs.add(true);
		hs.add('t');
		hs.add("java");
		hs.add(10);
		hs.add("new");
		
		System.out.println(hs);
System.out.println(hs.isEmpty());
System.out.println(hs.hashCode());
System.out.println(hs);

Iterator itr=hs.iterator();
System.out.println("-------------Iterator data-----------");

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	
	Spliterator litr=hs.spliterator();
	System.out.println("spiltetere ");
	while(litr.hasCharacteristics(0)) {
		System.out.println(litr.characteristics());
	}
}
}
