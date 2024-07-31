package collection.hashcode1;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	
	@Override
	public boolean equals(Object obj) {//최상위 클래스
		if(obj instanceof Key) { //  obj 들어오는 객체가 key 객체인지 확인
			Key compareKey = (Key) obj;	// key로 변환
			if(this.number == compareKey.number) { // 현재 넘버 필드 값과 매개변수로 제공된 comparekey에 number 값이 같다면
				return true;		// 리턴 true; 반환
			}
			
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
	
	
}
