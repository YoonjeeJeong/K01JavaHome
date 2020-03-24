package ex15usefulClass;
/* object 클래스:
 	-자바에서의 최상위 클래스임
 	-별도의 선언없이 object클래스에 정의된 모든 메소드를 사용할 수 있음
 	-개발자가 정의한 모든 클래스를 object인스턴스로 참조할 수 있음 
 	예) Object obj = new Person() 
 				혹은 
 		void myFunc(Object obj){
 		실행부;
 		} 
 		*/
class myFriends extends Object {
	String myName;
	public myFriends(String name) {
		myName= name;
	}
	//오버라이딩 처리하여 메소드를 재정의 함
	@Override
	public String toString() {
		return "이름"+ myName;
	}
}
/*
 toString 메소드: 
 	-Object클래스에 정의된 메소드로 println()이 문자열을 
 	 출력하기 전에 자동으로 호출하는 메소드임.
 	-인스턴스 변수를 문자열 형태로 변환해 줌.
 	-필요한 경우 클래스를 정의할 때 적절히 오버라이딩하여 재정의 하는 것이 좋다.
 	 단 필수사항은 아니다. */
class yourFriends extends Object {
	String	myName;
	public yourFriends(String name) {
		myName = name;
	}
}
public class E04Object1toString {

	public static void main(String[] args) {
		
		myFriends fnd1 = new myFriends("박정민");
		yourFriends fnd2 = new yourFriends("김재형");
		
		System.out.println(fnd1);//이름출력된다
		System.out.println(fnd2);//인스턴스의 주소값이 출력된다		
	}
}
