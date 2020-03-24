package quiz_game;
/*
 1부터 1000까지 숫자중 2의 배수 이거나 5의 배수인 숫자의 합을 구하는 
   소스코드와 결과화면 스크린 샷을 제출하시오
    [요구사항] 
   가. 단, 2와 5의 공배수인 경우 제외
   나, while문 버전과  for문 버전으로 두가지 소스코드를 작성하시오
 */
public class Question2_1 {

	public static void main(String[] args) {
	
		int sum=0;
		int i=1;
		do {
			if(i%2==0 || i%5==0) {
				if(i%(2*5)!=0) {
					sum +=i;
			}
					
		}
			i++;
		}
		while(i<=1000);
		System.out.println("결과: "+sum);
	}

}
