package sec01.tostring02;

public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}


	@Override
	public String toString() {
		return company + " , " + os;   // 필드 값을 재정의 해서 반환
	}
	
	
	
	
	
	
}
