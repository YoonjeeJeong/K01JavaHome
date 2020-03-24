package ex16exception;

import java.io.IOException;

/*	예외처리 방법 3] 
 	예외가 발생한 위치에서는 처리하지 않고 
 	외부로 던지고, 함수를 호출한 지점에서 예외객체를
 	받은 후 처리한다. 이때 예외발생과 상관없이 finally절은
 	실행된다.
  */
public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException {
		try {//여기서 직접 예외처리하기
			System.out.println("하나의 문자를 입력하세요:");
			int userChar = System.in.read();//에러가 여기에서 발생하진 않지만 에러를 만들 가능성을 가지고 있다.
			//read()는 뭐든지 다 읽어내니 에러도 읽어서 출력할 수 있다
			System.out.println("입력된 문자는:"+ (char)userChar);
		}
		finally {//finally는 예외가 있다해도 프로그램을 무조건실행시킨다
			System.out.println("예외발생? 난 몰라");
		}
	}
	public static void main(String[] args) {
		try {
		compileFunc();
		}
		catch(IOException e) {
			System.out.println("complieFunc()메소드에서 예외발생됨");
		}
	}
}
