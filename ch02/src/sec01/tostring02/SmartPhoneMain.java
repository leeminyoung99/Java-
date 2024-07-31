package sec01.tostring02;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);

	}

}
