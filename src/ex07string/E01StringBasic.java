package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20;
		String numResult = (num1==num2)?
				"데이터가 같다" : "데이터가 다르다";
		System.out.println("비교결과:"+ numResult);
		/*
		 ※String클래스의 객체형성 방법1: new를 사용한다
		 new를 사용하여 객체를 생성하면 동일한 문자열이라도 항상 새로운 메모리를 할당한다.
		 그러므로 문자열이 같아도 참조주소가 다르고 데이터가 다른 것이다.
		 */
		String str1 = new String("Hello JAVA");//new 붙어서 객체 생성		
		String str2 = new String("Hello JAVA");
		/*
		 str1, str2는 String객체의 참조값을 가지고 있으므로
		 아래는 참조값에 대한 비교를 진행한다. 
		 */
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		
		
		 /*equals() 메소드:
		 Object클래스로부터 상속받은 메소드로 실제 저장된 문자열을 비교하도록 만들어진
		 메소드이다. 즉 아래는 객체에 실제 저장된 문자열에 대한 비교가 이루어진다.  
		 */
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");//둘다"Hello JAVA"
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
		
		//String클래스의 객체생성 방법2 : "(더블쿼테이션)"을 사용한다 
		String str3 = "KOSMO";// " " 안에 넣어서 객체 생성
		String str4 = "KOSMO";//가급적이면 ""을 쓰자
		//내용에 대한 비교는 동일하다.
		System.out.println("equals()메소드로 문자열 비교:" +
				str3.equals(str4));
		/*
		 자바에서 문자열객체를 생성할 때 new를 사용하지 않고 ""를 사용하면
		 동일한 문자열일 경우 한군데만 메모리를 생성하여 공유하게 된다
		 */
		if(str3==str4) {
			System.out.println("주소가 같다");
		}
		else{
			System.out.println("주소가 다르다");
		}
		System.out.println();
		
	}//
}//
