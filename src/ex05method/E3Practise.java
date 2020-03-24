package ex05method;

public class E3Practise 
{
	public static void main(String[] args) 
	{			
//	문제1] 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
//	파일명 : Qu_04_06.java > x 와 y가 같이 증가하는 형태
//	출력]
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *  => 5줄 * 5줄 = 총 25번 반복함
		
		int i = 1;
		while (i<=5) 
		{//5번 반복하기 위해			
			int j = 1;
			while (j<=5)
			{
				//j는 i의 갯수만큼 출력한다.
				if(i>=j) 
				{
					System.out.print("* ");
				}
				j++;//j+1의 개념. 무한루프 방지.	
			}
			System.out.println();//다음줄로 가기 위해서
			i++;//(무한루프 방지용)
		}

	}//메인의 끝

}//클래스의 끝
