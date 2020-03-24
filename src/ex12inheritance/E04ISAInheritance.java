package ex12inheritance;
/*	Is-A관계: 
 	X is A Y => X는 Y의 일종이다로 표현가능
 	-노트북은 컴퓨터의 일종이다
 	-휴대폰은 전화기의 일종이다
 	이와같이 Is-A관계가 성립하는 개체를 상속으로 표현하기에 적합. */

/*	 컴퓨터를 표현	
  	: 기본적인 컴퓨터 환경을 제공하여 입력된 내용을 계산한다 */
class Computer{
	String owner;//컴퓨터 소유주 이름
	
	public Computer(String name) {//여기서 생성자를 정의했기 때문에 디폴트가 아래에서 안 생긴다.
		owner = name;
	
		/*
		 private접근 지정자로 선언된 멤버메소드는 외부클래스 혹은
		 상속받은 클래스에서 접근 불가므로 public으로 선언된 메소드를 통해서
		 간접호출해야 한다. 상속관계라면 protected로 선언된 메소드로 호출가능.
		 */
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력함");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다");
	}
	public void calculateFunc() {//protected로 선언도 가능.
		keyboardTouch();
		calculate();
	}
	/*
	 해당 메소드는 내부에서만 접근되므로 호출순서를 지켜 실행할 수 있도록 캡슐하여 정의하였다. 
	 */
}
/*
 컴퓨터를 상속한 노트북컴퓨터
  	: 컴퓨터가 가지고 있는 기본기능에 휴대이용 부분을 확장하여 정의하였음.
  	휴대이용을 위해 배터리 멤버변수가 추가됨.
 */
class NotebookComputer extends Computer {
	int battery; //배터리 충전량
	
	public NotebookComputer(String name, int initCharge) {
		super(name);//슈퍼(부모생성자 호출위해)는 생략은 가능하지만 앞에 다른문장이 오면 안됨.
		battery = initCharge;
	}
	public void charging() {//배터리 충전을 표현
		battery += 5;
	}
	public void movigCal() {//휴대하면서 컴퓨팅을 할 수 있는 것을 표현
		if(battery < 1) {//배터리양 체크하여 사용여부 판단
			System.out.println("배터리 방전되어 사용불가");
			return;
		}
		System.out.println("이동하면서");
		
		//keyboardTouch();//private으로 선언되었으므로 상속받은 자식클래스에서도 접근은 불가임.
		//calculate();//위와 같은 이유
		calculateFunc();//이 함수가 위 두개를 한꺼번에 호출할 수 있음.위 참고!
		
		battery -= 1;//배터리 차감
	}	
}
/*
  	태블릿노트북 컴퓨터:
  		컴퓨터의 기본기능, 휴대이용에 펜으로 드로잉할 수 있는 기능까지 추가된 클래스 */
class TabletNotebook extends NotebookComputer {
	String registPencil; //태블릿을 사용하기 위한 펜슬
	
	public TabletNotebook(String name, int initCharge,
			String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	
	//태블릿 사용을 위해 배터리양 체크 빛 등록된 펜인지 체크
	public void write(String penInfo) {
		if(battery < 1) {
			System.out.println("배터리 방전되어 사용불가");
			return;
		}
		/*
		 A.compareTo(B)
		 : 문자열 A와 B를 비교하여 0이 반환되면 같은 문자열로 판단하고, -1 혹은
		 1이 반환되면 서로 다른 문자열로 판단하는 String클래스에 정의된 메소드
		 */
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된펜이 아님");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그림");
		battery -=1;
	}
}
public class E04ISAInheritance {

	public static void main(String[] args) {
		
		NotebookComputer noteBook = new NotebookComputer("정윤지", 5);
		TabletNotebook tablet = new TabletNotebook("김성준", 5, "ISE-777");
		
		System.out.println("==노트북 컴퓨터 사용==");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		
		System.out.println("===ISE-777 펜으로 테블릿사용====");
		tablet.write("ISE-777");//정상사용
		
		tablet.write("xyz-000");//사용불가
		

	}

}
