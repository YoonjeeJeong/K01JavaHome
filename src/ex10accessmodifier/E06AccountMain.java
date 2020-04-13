package ex10accessmodifier;

public class E06AccountMain {
		
	public static void main(String[] args) {
		//DAO객체 생성
		AccountDAO cap = new AccountDAO();
		
		//데이터 초기화를 통해 DTO객체 생성
		cap.init("홍길동", "111-21-8888", 1000);//원래 잔고 1천원
		//통장정보 출력
		cap.printAccount();
		//출금처리
		cap.withdraw(20000);
		cap.withdraw(3000);
		//입금
		cap.deposit(10000);//
		//통장정보 출력
		cap.printAccount();
	}//

}//
