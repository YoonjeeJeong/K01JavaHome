package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04MultiCatch {

	public static void main(String[] args) {
		/* 예외처리를 할 때 필요에 따라 여러개의  catch 블럭을 사용할 수 있다.
		 - 이 경우 반드시 자식 예외클래스부터 catch 블럭에 사용한다
		 - Exception클래스는 모든 예외를 catch하기 때문에 마지막 블럭에
		   사용해야 한다
		 - 중간에 사용하면 에러가 발생한다	*/
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		
		try {
			for(int i=0; i<array.length; i++) {
				System.out.println("array["+ i +"]에 저장할 숫자입력:");
				array[i] = Integer.parseInt(scanner.nextLine());
			}// 테스트시 '11a'형태로 입력할 것
			
			System.out.println("배열에 저장된 두 숫자 나누기:"+ 
						array[0]/array[1]);//테스트시 0 입력할 것
			
			System.out.print("나이를 입력하세요:");
			int age= scanner.nextInt();//나이 입력시 숫자이이외의 문자 입력할 것
			System.out.println("당신의 나이는:"+ age);//여기서 인덱스를 초과한다고 뜬다
			
			array[3] = age;//애초에 배열이 0~2까지만 있으니...여기에 입력하면 당연 에러가 난다
		}
		catch(InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다");
		}
		catch(ArithmeticException e) {
			System.out.println("산술연산이 불가능합니다");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력가능합니다");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다");
		}
		catch(Exception e) {
			System.out.println("예외가 발생하였습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("==프로그램 끝==");
		
	}

}
