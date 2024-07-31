package sec01.exam02;

public class ObjectEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		
		boolean result = obj1.equals(obj2);
		
		System.out.println(result);
		
		boolean  result2 = (obj1 == obj2);
		
		System.out.println(result2);
		
		int a = 5;
		int b = 5;
		
		obj1 = a;
		obj2 = b;
		
		result = obj1.equals(obj2);
		
		System.out.println(result);
		
		result2 = (obj1 == obj2);
		
		System.out.println(result);
		

	}

}
