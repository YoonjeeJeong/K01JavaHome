package ex10accessmodifier;


/*
class를 정의할 때는 반드시 public과 default(생략형)만 가능하다.
아래는 에러 발생됨. 

private class PrivateClass1 {
		void myFunc() {
			System.out.println("나는 정의할 수 없는 Class");
		}		
}*/

/*
접근지정자를 생략했으므로 default클래스로 지정된다.
해당 클래스는 동일 패캐지에서만 접근 가능하다. 
*/
public class E01AccessModifier1 {
	//멤버 변수를 각가의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	/*
	 동일 클래스내에선 private멤버라 할지라도 접근이 가능하다.
	 즉 동일 클래스라면 접근지정자의 영향을 받지 않는다. 
	 */
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("deafultMethod() 메소드 호출");
	}
	/*
	 private으로 선언된 멤버(변수혹은 메소드에)를 외부클래스에서 접근하고 싶을때는
	 public으로 선언된 멤범메소드를 이용해서 간접적으로 접근을 허용한다.
	 */
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();//public메소드를 통해서 private도 접속가능
	}
}
