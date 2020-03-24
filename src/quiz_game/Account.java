package quiz_game;

class AccountSetup {
	String name;
	String accountNum;
	int balance; 
	
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금");
	}
	void withdraw(int money) {
		if(balance>=money) {
			balance -= money;
			System.out.println("계좌에서 "+ money + "원이 출금됨");
		}
		else {
			System.out.println("잔액이부족합니다");
		}
	}
	void showAccount () {
		System.out.println("계좌주: "+ name);
		System.out.println("계좌번호:"+ accountNum);
		System.out.println("잔고 "+balance);
	}
	void init(String n, String a, int b) {
		name = n;
		accountNum=a;
		balance = b;
	}	
}	
public class Account {

	public static void main(String[] args) {
		AccountSetup account = new AccountSetup();
		account.init("자바맨", "123-456", 10000);
		account.deposit(15000);
		account.withdraw(30000);
		account.showAccount();				
	}

}

/*
가. 속성으로 예금주,계좌번호,잔액을 갖는다.
  예금주는 String,계좌번호 String,잔액은 int로 정의하여라
나. 메소드로 인출 및 입금 메소드를 갖는다.
   인출 메소드는 인자로 인출할 금액을 받고 잔액이 부족시에는
   “잔액이 부족합니다”라는 메시지를 잔액이 충분할때는 인출한 금액을 출력하는 
   메소드이다
   입금 메소드는 인자로 입금할 금액을 받고 입금액을 잔액에 더하고
   입금한 금액을 출력하는 메소드이다
다. toString()메소드를 오버라이딩하여 계좌정보 즉 얘금주,계좌번호,잔액을
  출력하는 메소드를 정의하여라
  예]예금주:자바맨,계좌번호:123-456,잔액:1000원
*/
