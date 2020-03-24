package ex08class;
/* 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. 
init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 
삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

public static void main(String[] args)
{
Triangle t = new Triangle();
t.init(10, 17); //밑변10, 높이17로 초기화
System.out.println("삼각형의 넓이 : " + t.getArea());
t.setBottom(50);//밑변 50으로 변경
t.setHeight(14);//높이 14로 변경
System.out.println("삼각형의 넓이 : " + t.getArea());
}
결과:
삼각형의 넓이 : 85.0
삼각형의 넓이 : 350.0*/
class Triangle {
	//멤버변수
	int bottom;//밑변
	int height;//높이
	
	//밑변과 높이를 초기화하는 멤버메소드
	public void init(int bot, int hei) {
		bottom = bot;
		height = hei;
	}
	public double getArea() {		
		return bottom * height * 0.5;
	}
	//삼각형의 넓이를 계산해서 반환하는 멤버메소드
	public void setBottom(int bottom) {
		//우클릭 후 소스 누르면 setter를 지정해서 this멤버변수를 직접 적지 않고 입력가능
		this.bottom = bottom;//this는 멤버변수
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
public class QuTriangle {

	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		//t.getArea() 출력,대입할 내용이 있는지를 보고 반환타입인지를 판단.
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
