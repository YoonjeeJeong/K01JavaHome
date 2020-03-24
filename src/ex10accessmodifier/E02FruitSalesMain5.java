
package ex10accessmodifier;

//과일판매자를 추상화한 클래스 
class FruitSeller3 {
	int numOfMango;//판매자의 망고 갯수
	int myMoney;//판매자의 수익
	final int MANGO_PRICE;//망고의 단가 다시 상수로 선언함.

	/*	상수는 값의 변경이 불가능 하고 단 한번만 초기화되기 때문에
	일반적인 멤버메소드에서는 초기화할 수 없다. 단, 생성자메소드에서는 초기화 가능. 
	마음대로 호출 불가하고, 객체생성시 단 한번만 호출되는 특성이 동일하기 때문에
	한번이상 초기화 되지 않음이 보장되기 때문. */
	public FruitSeller3(int money, int mangoNum, int price) {
		myMoney = money;
		numOfMango = mangoNum;
		MANGO_PRICE = price;// <- 생성자 내에서는 상수를 초기화할 수 있다.
		
	}
	public int saleMango(int money) {
		int num = money / MANGO_PRICE;
		numOfMango -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은 망고갯수"+ numOfMango);
		System.out.println("[판매자]판매수익"+ myMoney);		
	}
}
//구매자를 표현한 클래스
class FruitBuyer3 {
	int myMoney;//보유한 금액
	int numOfMango;//구매한 망고의 갯수

	public FruitBuyer3(int _myMoney, int _numOfMango ) {
		myMoney = _myMoney;
		numOfMango = _numOfMango;
	}

	public void buyMango(FruitSeller3 seller, int money) {
		numOfMango += seller.saleMango(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]망고 갯수:"+ numOfMango);
	}
}

public class E02FruitSalesMain5 {
	public static void main(String[] args) {
		/*생성자를 통해서 객체 생성과 동시에 초기화되므로 init(초기화메소드)
		 를 호출할 필요가 없어진다. 따라서 객체생성 모드를 한줄로 줄일 수 있다. */
		
		//판매자1
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		
		//판매자2
		FruitSeller3 seller2 = new FruitSeller3(0,80,500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
/*
  		아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한
  		사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
  		즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 도니다.
  		객체지향 언어에서는 이런 논리적 오류를 범하지 않기위해
  		'정보은닉'이라는 개념을 가지고 있다
 */
		
		seller1.myMoney +=1000;//판매자1에게 1천원 지불하고
		seller1.numOfMango -=50;//과일 50개 구매했다
		buyer.numOfMango +=50;
		
		seller2.myMoney += 1000;//판매자2에게 1천원을 지불하고
		seller2.numOfMango -= 70;//70개를 구해하였다
		buyer.numOfMango += 70;//하지만 구매자의  보유금액은 차감되지 않았다.
		
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}
	
}
