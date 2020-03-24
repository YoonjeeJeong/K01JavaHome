package ex09package;

import java.util.Date;

import ex09package.kosmo.util.CommonUtil;

public class PackageMain {

	public static void main(String[] args) {
		/*하나의 클래스안에서 패키지는 다르나 같은 이름의 클래스를
		  사용해야 할 때 
		 방법1: 클래스명 앞에 풀 패키지 경로를 기술한다.
		 방법2: 하나의 클래스는 import하고 다른 하나만 풀 경로를 사용.*/
		Date utilDate = new Date();//import후 사용
		System.out.println("utilDate= "+ utilDate);
		
		java.sql.Date sqlDate =
				new java.sql.Date(utilDate.getTime());//풀 경로 사용
		System.out.println("sqlDate= "+ sqlDate);
		///////////////
		/* ex09package.kosmo.util패키지가
		  생성되지만 이 두개는 서로 다른 패키지로 인식한다.
		  따라서 isNumber()메소드를 호출하기 위해선 해당 패키지를
		  import해야 함 */
		
		String strValue = "987654321";
		/*
		 static으로 선언되면 메소드는 new를 통한 객체생성 없이
		 클래스명 만으로 즉시 호출하는 것이 가능함 
		 */
		boolean isNum = CommonUtil.isNumber(strValue);
		if(isNum==true)
			System.out.println("문자열은 숫자이다");
		else
			System.out.println("숫자가 아니다");
		System.out.println(
				ex09package.kosmo.util.CommonUtil.isNumber("백20"));
		
	}

}
