package ex04controlstatement;

import java.io.IOException;

/*
 if문(조건문, 분기문)
 	형식1
 		if(조건문){
 			실행문1;
 			실행문2;
 		}
 		-if문의 조건문은 반드시 비교식 혹은 논리식이여야 함
 		-즉 결과값이 boolean 타입(t or f)이어야한다
 		-실행할 문장이 하나인 경우 중괄호 생략 가능함	
 */

public class E01If01 {

	public static void main(String[] args) throws IOException {		
		int num = 10;		
		/*if(num%2) {
			System.out.println("잘못된 조건식입니다.");
		위 문장은 조건식이 아닌 산술식이므로 에러			
		}
		if(num) {
			System.out.println("이것도 잘못된 조건식입니다.");
		}
		위에건 그냥 실행이 불가능한 것
		*/		
		/*
		 if문의 조건은 아래와 같이 boolean 값을 반환하는 조건식이어야 한다
		 */
		if(num%2==0); 
		{
		System.out.printf("%d는 짝수입니다", num);
		}

		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다 "
					+ "크거나 같다.%n", num);
		}/* 경우에 따라 무조건 실행되는 if문도 필요함. 아래 참고. */
		if(true) {
			System.out.println("무조건 실행되는if문이다");
		}		
		 /*if(조건식); => 조건식에 상관없이 다음 문장이 실행되는 형태로
		 세미콜론은 문장의 끝을 나타내므로 사용에 주의! 
		 */		
		if(num%2 != 0);
		{
			//위 조건에 상관없이 무조건 출력되는 문장임
			System.out.println("%d는 홀수다");
		}
		
		/*
		 조건 검사 후 실행할 문장이 하나면 { } 중괄호를 생략할 수 있다.
		 다만, 실행문이 2개이상이면 한 문장만 실행되니 주의!
		 */
		if(num%2 == 0)
			System.out.println("\n"+ num+ "은 짝수다");
		if(num%2 !=0) {
			System.out.println("num은"+ num +"입니다");
			System.out.println(num +"은 홀수이다.");
		}

		/*
		 System.in.read()
		 : 사용자에게 하나의 문자를 입력받을때 사용하는 메소드로
		 입력한 문자의 아스키코드값을 반환함.
		 해당함수는 IOException을 기본적으로 가지고 있어 
		 이를 무시하기 위해 main()함수에서 throws 처리를 해준다.
		 */
//		System.out.print("하나의 문자를 입력하세요");
//		int asciiCode = System.in.read();
		/*
		 아스키코드값을 알고 있을 때 구현방법
		 '0'=> 48
		 '9'=>57 이므로 해당 구간안에 있다면 숫자로 판단할 수 있다 
		 */
//		System.out.println("입력한문자:"+ asciiCode);
//		System.out.println("입력한문자"+ (char)asciiCode);
		
		/*
		 시나리오: 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해 구연하시오 
		 */
		System.out.print("하나의 문자를 입력하세요:");
		int asciiCode = System.in.read();//내가 콘솔에 숫자 입력 후 결과 출력함
		/*
		 아스키코드값을 알고 있을 때 구현방법
		 '0'=> 48
		 '9'=>57 이므로 해당 구간안에 있다면 숫자로 판단할 수 있다 
		※ 숫자의 구간을 정할 때는 반드시 논리and를 사용해야 함 
		 */
		if(asciiCode>=48 && asciiCode<=+57) {
			System.out.println("입력한 문자는 숫자입니다");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		/*
		ascii코드값을 모를때 구현방법
		char형 문자는 메모리에 저장시 아스키코드 값으로 저장되므로 아래처럼
		비교연산이 가능하다. 또한 산술연산도 가능. 
		 */
		boolean isNumber = (asciiCode>='0' && asciiCode<='9');
		if(isNumber==true) {
			System.out.println("입력한 문자는 숫자입니다");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다");
		}
		
		
	}
}
		
