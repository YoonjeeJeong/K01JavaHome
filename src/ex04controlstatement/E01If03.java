package ex04controlstatement;

public class E01If03 {
/*
 if문
 	 형식3]
 	 	if(조건1){
 	 	실행문1;
 	 	}
 	 	else if(조건2){
 	 	실행문2;
 	 	}
 	 	else {
 	 	위 조건이 거짓일 때 실행할 문장;
 	 	}
 	 	※else문에는 조건식이 들어갈 수 없다!
 */
	public static void main(String[] args) {

	/*
	 시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
	 프로그램을 작성하시오. 90점 이상은 A,...60미만은 f로 판단하여 출력합니다. 	
	 */
		
		int k=99, e=70, m=0;
		double avg = (k+e+m) / 3.0;
		System.out.println("평균점수는(그대로):"+ avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n", avg);
		/*
		 if~else 구문을 구성할 때는 조건의 구간을 어떻게 서정하느냐에
		 따라 전혀 다른 결과가 나올 수 있으니 주의!
		 아래 문장은 높은 점수라 할지라도 60이상의 조건에 만족함으로인해
		 D학점을 출력했다. 
		 */
		
//		System.out.println("잘못된 조건식의if문");
//		if(avg>=60) {
//			System.out.println("d");
//		}
//		else if(avg>=70) {
//			System.out.println("c");
//		}
//		else if(avg>=80) {
//			System.out.println("b");
//	}
//		else if(avg>=90) {
//			System.out.println("a");
//		}
//		else {
//				System.out.println("사람이여?");
//			}
		
		System.out.println("잘못된 조건식의if문");
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");//마지막인 else에는 조건식이 없다
		}
		
	}

}
