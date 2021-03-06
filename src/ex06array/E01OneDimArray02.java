package ex06array;

import java.util.Random;

public class E01OneDimArray02 
{

	public static void main(String[] args) 
	{
		
		//난수생성방법1
		double rndNumber = Math.random();//랜덤한 숫자가 나온다. 매번 바뀐다.
		System.out.println("생성된난수[실수]:"+ rndNumber);//doule이라서 소수점 나옴
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된난수[]:"+ intNumber);
		
		//난수생성방법2
		Random random = new Random();
		System.out.println("생성된난수:"+ random.nextInt());
		System.out.println("===============================");
		//구간 계산법:
		// (45%45) + 1 = 0+1 (45/45는 남는 것이 없다)
		// (19%10) + 1 = 9+1 (9가 남으므로)
		
		System.out.println("1-45사이의 난수생성:"
				+((int)((Math.random()*100) % 45)+1));//45이상의 수는 안 나옴
		System.out.println("====================");
		/*
		로또번호처럼 1~45사이의 난수를 생성하는 방법:
		1. 0.xxxx형태의 난수를 정수로 변경하기 위해 100을 
		곱한 후 int형으로 형변환한다
		2. 45로 % 연산하여 나머지를 구한다. 이때 결과는
		0~44가 된다. 
		3. 2번의 결과에 +1 한다. 결과적으로 1~45 사이의 난수를 생성할 수 있게 된다
		 */
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int [6];
		for(int i=0 ; i<lottoNum.length ; i++) 
		{
		lottoNum[i] = (int)((Math.random()*100)%45) + 1;
		}
		for(int i=0 ; i<lottoNum.length ; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
		
	}

}
