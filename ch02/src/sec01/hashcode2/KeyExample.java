package sec01.hashcode2;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Member, String> hashMap2 = new HashMap<Member, String>();
		
		hashMap2.put(new Member("fall"), "value1");
		hashMap2.put(new Member("winter"), "value2");
		hashMap2.put(new Member("fall"), "value3");
		
		System.out.println(hashMap2.size());
		
		
	}

}
