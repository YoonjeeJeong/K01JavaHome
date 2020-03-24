package ex06array;

public class E05TwoDimArray01 {
/*  아래와 같이 2차원 배열을 초기화하면 세로크기 3, 가로크기 4호 설정된다.
 	초기화할 요소가 없는 부분은null로 채워지게 된다.
 ※null값: 아무것도 없는 값을 일컫는다. 즉 빈 값. 스페이스와 같은 공백문자와는 다르다!!! */
	public static void main(String[] args) {

		int[][] arr = {
				{1,2,},
				{3,4,5,},
				{6,7,8,9}
		};
		/*
		 참고로 2차원 배열에서 "배열명.length"로 출력하면 세로크기가 반환된다. 
		 */
		System.out.println("배열의 세로크기:"+ arr[0].length);
		System.out.println("배열명이 가진 값 출력:"+ arr);
		//arr[0]하면 0행의 크기가 나온다 ( {1,2}부분)
		
		 /*각 행의 가로크기는 초기화된 상태에 따라 다를 수 있다
		 0행은 2, 2행은 4의 크기를 출력하게 된다.*/
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d행의 크기:%d\n", i, arr[i].length);
			System.out.printf("%d행 출력: %s\n", i, arr[i]);
		}
		System.out.println("배열출력하기");
		System.out.println("arr[0][1]="+ arr[0][1]);
		//System.out.println("arr[0][1]="+ arr[0][3]);//예외발생.3은 null이라서.
		/* ArrayIndexOutOfBoundsException 예외발생. 
		   즉, 배열의 index를 초과했다는 뜻 
		 */
		
	}

}
