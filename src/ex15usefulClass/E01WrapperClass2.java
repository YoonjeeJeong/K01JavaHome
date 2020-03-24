package ex15usefulClass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		
		// 1. parseInt(): 숫자형식의 문자열을 숫자로 변경
		String strNumber = "1000";
		System.out.println("10+strNumber="+(10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경: "+
						(10+ Integer.parseInt(strNumber)));
		
		System.out.println("10+strNumber를 숫자로 변경: "+
						(10+Integer.valueOf(strNumber)));//동일 기능. valueOf: 반환타입Integer타입임.
		
		
		/*문자열을 숫자로 변경할 때는반드시 숫자형식만 와야함.
		 "원"은 숫자가 아님.NumberFormatException이 발생된다*/
		String money = "120";//120원은 문자열로 해석이 되어서 실행이 안 됨
		System.out.println("120원:"+Integer.parseInt(money));

		/* 실수형태의 문자열을 실수로 변경할때는 parseInt()를 사용할 수 없다.
		 위와 똑같은 에러가 발생된다. */
		String floatString = "3.14";
		//System.out.println(Integer.parseInt(floatString));//parseInt는 정수만 와야 함.실수 불가.
		System.out.println("실수형(float)형으로 변경: "+ Float.parseFloat(floatString));
		//실수를 쓰려면 parseFloat 등으로...
		System.out.println("실수형(Double)형으로 변경: "+ Double.parseDouble(floatString));
		
		//Character클래스의 주요메소드
		// 2] codePointAt(): 문자열에서 index에 해당하는 한 문자의 아스키코드 값을 반환함.
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));//D의 아스키코드는 68임
		
		
		//3] isDigit(): 인자로 전달된 문자가 숫자인지 판단함
		//숫자로 판단될때 true반환함
		System.out.println("isDigit()을 통한  숫자판단");
		System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");//숫자 형태의 문자로 숫자로 인식됨
		
		
		//4]isLetter(): 문자여부를 판단하는 메소드로 
		//특수기호나 숫자형은  false반환
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));//true
		System.out.println(Character.isLetter('A'));//true
		System.out.println(Character.isLetter('#'));//false
		System.out.println(Character.isLetter('9'));//false
		
		//5]isWhitespace(): 공백문자인지 판단하는 메소드
		System.out.println("isWhitespace() 메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));//false
		System.out.println(Character.isWhitespace(' '));//true
		
		//6]isLower/UpperCase(): 대소문자를 판단함. 영문만 적용됨.
		//영문이외는 다 false로 판단됨.
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));//false
		System.out.println(Character.isUpperCase('z'));//false
		System.out.println(Character.isLowerCase('a'));//true
		System.out.println(Character.isUpperCase('Z'));//true
		System.out.println(Character.isLowerCase('가'));//무조건! false
		
		
		/*시나리오] 
		 주어진 문자열안에 몇개의 공백문자(스페이스)가 있는지
		 판단하는 프로그램을 작성하시오.
		 참고: toCharArray() : 문자열char형 배열로 반환해주는
		 String클래스에 정의된 메소드.  */
		
		//7]toCharArray(): 
		String whiteString = " H E L L O ";
		int whiteCount =0;
		char[] chArr = whiteString.toCharArray();
		for(int i=0; i<chArr.length ; i++) {
			if(Character.isWhitespace(chArr[i])) {
				whiteCount++;//공백이 맞으면 공백수를 증가시킨다
				//tab을 쓸 경우 넓이와 상관없이 하나의 공백으로 취급된다
			}
		}
		System.out.println("총 공백수: "+whiteCount);//6
	}
	

}
