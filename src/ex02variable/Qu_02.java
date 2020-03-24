package ex02variable;

/*
 국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)  
 */
public class Qu_02 {

	public static void main(String[] args) {
		
		int kor = 99, eng = 80, math = 96;		
		double avg = (kor+eng+math)/3.0;
		//or double avg = (double)(kor+eng+math)/3 < 소수점 없이 할 경우;
		System.out.println("평균점수(실수형)="+ avg);
		System.out.println("평균점수(정수형)="+ (int)+ avg);//double되는 것 방지
		
		System.out.println("kor + eng + math 의");
		System.out.println("평균은"+ avg); //실수형
		
		int avg2 = (kor+eng+math)/3;
		System.out.printf(kor +"점, " + eng +"점, "+ math +
				",점의 평균점수는 "+ avg2 +" 점입니다");//정수형
	}

}