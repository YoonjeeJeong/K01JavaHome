package quiz_game;
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

class Triangle{
	int bottom;
	int height;
	
	public void init(int bott, int he) {
		bottom = bott;
		height = he;
	}
	public double getArea() {
		return bottom*height / 2;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

public class Qu_triangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
