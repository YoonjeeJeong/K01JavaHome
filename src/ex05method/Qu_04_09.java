package ex05method;

public class Qu_04_09 
{

	public static void main(String[] args) 
	{
//	문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
//	파일명 : Qu_04_09.java
//	출력]				
//		2*1=2   3*1=3 ~~~~~~~~~~  9*1=9
//		2*2=4   ~~~~~~~~~~~~~~~ 9*2=18
//		~~~~~~~~~~~~~
//		2*8=16~~~~~~~~~~~~~~~~9*8=72
//		2*9=18~~~~~~~~~~~~~~~~9*9=81
// 수가 고정되고 단이 바뀌는 형식의 구구단. 구구단 만드는 법은 외워야...
/*		for(int dan=2 ; dan<=9 ; dan++)
		{
			for(int su=1; su<=9; su++)
			{
				System.out.printf("%2d *%2d=%3d ", dan, su, (dan*su));		
			}
			System.out.println();
		}*/ //<이것이 기본적인 구구단 형식이다
		
		//수 su가 고정된 상태에서 단 dan이 증가하는 형태로 구성된다.
		for(int su=2 ; su<=9 ; su++)
		{
			for(int dan=2; dan<=9; dan++)//5를 바꾸면 구구단 5단(x5)까지만 하게 됨
			{
				System.out.printf("%2d *%2d=%3d ", dan, su, (dan*su));		
			}
			System.out.println();
		}
		
		
		
		

	}

}
