package collection.set;

public class Member {
		public String id;
		
		
		public Member (String id) {
			this.id = id;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) { //obj가 멤버타입인지
				Member member = (Member) obj;
				if(id.equals(member.id)){
					return true;
				}
			}
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
