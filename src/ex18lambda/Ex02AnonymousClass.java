package ex18lambda;
/*
 익명클래스로 오버라이딩*/
interface IKosmo2 {
	/*
	 인터페이스에 정의된 메소드는 public abstract로 선언된다.*/
	void studyLambda(String str);
	//void앞에 public abstract가 있다(눈엔 안 보이지만)

}
public class Ex02AnonymousClass {
	//IKosmo2 인터페이스를 구현한 익명클래스 정의
	public static void main(String[] args) {
		
		IKosmo2 kosmo = new IKosmo2() {
			@Override
			public void studyLambda(String str) {
				System.out.println(str+
						"을 공부하기 위해 익명클래스를 만들어요");
			}
		};
		kosmo.studyLambda("람다식");
	}
}
