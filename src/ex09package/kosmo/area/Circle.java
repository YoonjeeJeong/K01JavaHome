package ex09package.kosmo.area;

public class Circle {
	double rad;
	final double PI;
	//원의 넚이를 반환하는 멤버메소드
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	public double getArea() {
		return 2 *PI * rad;
	}
}