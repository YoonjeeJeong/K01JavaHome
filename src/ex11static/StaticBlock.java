package ex11static;

/*
 스태틱 블럭: StaticBlock()
 		동일 클래스 안의 메인메소드보다 먼저 실행되는 블럭으로
 		메인 메소드의 실행코드가 없어도 먼저 실행된다.
 		단, 다른 클래스에 메인이 있는 경우에는 메인이 순차적으로 
 		실행되다가 스태틱블럭이 있는 클래스가 객체화될 때
 		실행되게 된다. 이때 생성자보다 스태틱블럭이 먼저 실행된다.
 */
public class StaticBlock {
	//인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
	
	//정적멤
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	 //스태틱블럭
	static {
		//블럭안에서는 정적멤버인 staticVar에 접근가능
		staticVar = 1000;
		
		/* 스태틱 블럭 안에서만 사용할 수 있는 지역변수 선언.
		 블럭내에서는 제한적으로 사용이 가능하다.  */
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar);//허용
		
		

		// static 블럭에서는 인스턴스형 멤버를 사용할 수 없다. 
//		System.out.println("instanceVar="+ instanceVar);//에러
//		instanceMethod();//에러
		
		/*
		 정적멤버만 접근이 가능하다. 
		 */
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		//메인메소드보다 먼저 실행이 되는지 확인용 출력문
		System.out.println("========static block====");	
	}
	//생성자 메소드
	/* 외부파일의 메인메소드에서 실행되는 경우 해당 클래스의 객체가 생성자를
	 통해 생성되기 전에 스태틱블럭이 먼저 실행된다. */
	public StaticBlock() {
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
	public static void main(String[] args) {
		/*
		 E02StaticBlockMain.java에서 실행할때는 주석처리후 실행하세요.
		 메인메소드가 외부파일에 있을때 실행을 테스트하기 위함.
		 */
		System.out.println("==메인메소드==");
//		System.out.println("localVar="+ localVar);static밖에 있어서 에러
		//StaticBlock a = new StaticBlock();//이 문장으로 StaticBlock을 호출한다
	}	
	
}
