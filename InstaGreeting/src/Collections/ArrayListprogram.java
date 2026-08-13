package Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprogram {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.50);
		list.add("vikash");
		list.add(true);
		list.add('t');
		list.add(450);
		list.add(null);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.add(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf(10));
		System.out.println(list.remove(2));
		System.out.println(list.isEmpty());
		System.out.println(list.set(1,"pandey vikash"));
		System.out.println(list.clone());
		System.out.println(list.hashCode());
		System.out.println(list.lastIndexOf(10));
		System.out.println(list);
		
		
		Iterator itr=list.iterator();
		System.out.println("-------------Iterator data-----------");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator litr=list.listIterator();
		while(litr.hasNext()) {
			litr.set(litr.next()+"Tops techno");
			
		}
		System.out.println("-------------------ListIterator program ---------------------");
		litr=list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("---- listIterator data reverse direction----------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
