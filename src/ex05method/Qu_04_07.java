package ex05method;

public class Qu_04_07 {
//	문제2] 1~100까지의 숫자중 3의배수 이거나 7의배수인 
//	숫자의 합을 구하는 프로그램을 작성하시오. 
//단, 3과 7의 공배수인 경우 합에서 제외해야 한다(21등). 
//출력의결과는 누적되는 모든 수를 콘솔에 print한다.
//	파일명 : Qu_04_07.java
//	결과]~~ 3+6+7+~~~~~~=????

	public static void main(String[] args) {
		int sum = 0;//누적할 변수
		//for문을 쓰는 이유는 반복횟수가 명백해서다
		for(int i=1; i<=100 ; i++) {//1~100까지의 반복
			if(i%3==0 || i%7==0)  {//3이나 7의 배수

				if(i%(3*7)!=0) {//!의 의미: 3과 7의 공배수가 아닌 정수
					sum +=i;
					System.out.println("i="+ i);
				}
			}
		}
				System.out.println("결과="+ sum);
				
			
				
				
				
			
			
		
		
	}

}
