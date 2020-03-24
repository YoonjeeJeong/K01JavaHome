package ex05method;

public class Qu_04_08 {

	public static void main(String[] args) 
	{			
//	문제3] 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
//	파일명 : Qu_04_08.java
//	출력]	
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*  =>25번 출력

//		for(int x=1; x<=5; x++)
//		{
//			for(int y=1 ; y<=5 ; y++)
//			{
//				System.out.print("* ");	
//			}
//			System.out.println();//줄바꿈용
//		} 이건 바둑판을 출력한다
		// final은 별표(*)를 출력할 층수를 표현하는 상수이다.
		final int FLOOR = 7;//final(상수)은 대문자로 됨. 스캐터 클래스를 쓰면 내가 입력한 수의 층의 나온다.
		/*
		 FLOOR-x+1
		  => 변수x가 증가함에 따라 점점 감소하는 y값을 
		     표현하기 위한 일반식 정의
		 */
		for(int x=1; x<=FLOOR; x++)//5대신 FLOOR를 넣음 7개의 층이 나온다.
		{
			for(int y=1 ; y<=(FLOOR-x+1) ; y++)
			{
				System.out.print("* ");	
			}
			System.out.println();//줄바꿈용
		}
		
	}//메인의 끝

}//클래스의 끝
