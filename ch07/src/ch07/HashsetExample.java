package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>(); // Hashset - 파라미터생략하면 왼쪽set에 지정된 타입을 따라간다.
		
		/*
		 * Hashset - 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지않는다.
		 * 인스턴스를 뜻하지 않으며, 객체를 저장하기전에 Hashcode() 메서드를 호출해서 얻어내고,저정되어 있는 객체들의 해시코드와 비교한다.
		 * 동일한 해시코드가 있다면 equals()메서드로 두객체를 비교해서 true가 나오면 중복저장 x
		 */
		
		set.add("Java");// 동등객체라 객체수는 4
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 동등객체라 객체수는 4
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator(); //  저장된 객체를 한번 씩 가져오는 반복자를 리턴한다.\
		while(iterator.hasNext()) { // 가져올 객체 있으면 true 없으면  false로 리턴
			String element = iterator.next(); // 컬렉션에서 하나 가져온다
			System.out.println("\t"+element); // 컬렉션에서 가져온 요소들을 출력	
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수"+ set.size());
		
		iterator = set.iterator(); //  저장된 객체를 한번 씩 가져오는 반복자를 리턴한다.\
		while(iterator.hasNext()) { // 가져올 객체 있으면 true 없으면  false로 리턴
			String element = iterator.next(); // 컬렉션에서 하나 가져온다
			System.out.println("\t"+element); // 컬렉션에서 가져온 요소들을 출력	
		}
		
		
		set.clear(); // 모든 객체를 제거하고 없앤다
		if(set.isEmpty()) { //객체가 비어있는지 확인하기
			System.out.println("비어있음");
		}
		
		
	}

}
