package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapsse {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(102,"vikash");
		hm.put(104,"vikrant");
		hm.put(134,"vikram");
		hm.put(1234,"vijay");
		hm.put(6345,"vish");

		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry=(Entry<Integer,String>)itr.next();
			System.out.println("key :"+entry.getKey());
			System.out.println("value :"+entry.getValue());
		}
		
		}
}
