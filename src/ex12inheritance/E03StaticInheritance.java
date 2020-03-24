package ex12inheritance;

/* 스태틱  타입의 멤버도 상속이 되고, 하위클래스에서 접근
할때는 멤버변수의 이름만으로 접근이 가능하다.
단, 클래스 외부에서 접근시 객체생성없이 클래스명을 
통해서도 접근이 가능하다. 특, 스태틱이 가진 기본적인 규칙을
그대로 따른다. */
class Adder {
	public static int val = 0;
	/*스태틱으로 선언된 멤버변수는 실제로는 외부(메소드영역)에
	 생성되어 있으므로 클래스명을 통한 접근이 허용된다.
	 코드 레벨에서 보면 해당 클래스의 멤버변수이므로 
	 변수명만으로 접근하는 것도 가능하다. */
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

//자식클래스의 멤버메소드는 모두 실행가능한 코드임.
class AdderFriend extends Adder {
	public void friendAdd(int num) {
		//아래: 동일 멤버변수에 num이 두번 더해짐. 
		//그래서 아래의 ad.add가 1+1이 된다.
		val+=num;
		Adder.val +=num;
	}
	public void showVal() {
		System.out.println("val="+ val);
		System.out.println("val="+ Adder.val);
	}
}
public class E03StaticInheritance {

	public static void main(String[] args) {
		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);//위의 주석을 풀 경우 1+1이 되고
		adFriend.friendAdd(3);//여긴 3+3이 된다
		Adder.val +=5;
		AdderFriend.val +=7;
		
		adFriend.showVal(); // 1+3+5+7=의 결과: 16 출력됨(주석 안 풀면!)		
	}	//주석 풀면 2+6+5+7=20이 된다.

}
