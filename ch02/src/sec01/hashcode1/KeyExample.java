package sec01.hashcode1;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap <Key,String> hashMap = new HashMap<Key,String>();
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3"); // 키값이 같을경우 예전의 키를 없애고 새로운 값이 만들어짐.
		
		System.out.println(hashMap.size());
		
		
		
	}

}
