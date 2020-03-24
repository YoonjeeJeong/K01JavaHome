package quiz_game;

import java.util.Calendar;

/*
 *아래의 지시사항에 따라 작업을 진행하시오.
1. 다음의 요구사항을 충족하는 프로그램의 소스코드와 결과화면 스크린 샷을 제출하시오
  [요구사항] 
  가. 자신이 태어난 년도인 숫자를 저장 할 수 있는 변수 year를 선언하고
      자신이 태어난 년도를 대입한다.     
  나. 자신의 나이를 저장할 수 있는 변수 age를 선언하고, 
     year 변수를 사용하여 자신의 나이를 
     계산하여 대입한다(공식:현재년도-태어난 년도)
     단,현재 년도는 Calendar클래스를 사용하여 구해야 한다
     그리고 age 와 year를 출력하여라
 */

public class Age {

	public static void main(String[] args, int b) {
		Calendar cal = Calendar.getInstance();
		int year = 1992;
		int age = cal.get(Calendar.YEAR)-year;
		
		System.out.println("내가 태어난 해:" + year);
		System.out.println("내 나이:" + age);
	}

}
