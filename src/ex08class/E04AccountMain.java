package ex08class;

class Account {
	//멤버변수
	String name;
	String accountNumber;
	int balance;
	
	//멤버메소드
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금됩");
	}
	void withdraw(int money) {
		//출금을 위해 잔고와 출금요청금액을 비교
		if(balance>=money) {
			//잔고가 충분한 경우 출금처리
			balance -= money;
			System.out.println("계좌에서 "+ money + "원이 출금됨");
		}
		else {
			//잔고가 부족한 경우 불능처리
			System.out.println("잔고부족으로 출금불능");
		}
	}
	void showAccount () {
		System.out.println("계좌주: "+ name);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔고 "+balance);
	}
	//초기화 메소드
	void init(String n, String a, int b) {
		name = n;
		accountNumber=a;
		balance = b;
	}	
}
public class E04AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		account.init("장동건", "111-21-8888", 1000);//원래 잔고 1천원
		account.deposit(9000);//원래 잔고+9000원
		account.withdraw(5000);//5000원 출금
		account.showAccount();//잔고 5천우너
///////////2번째 통장 개설
		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
	}//

}//
