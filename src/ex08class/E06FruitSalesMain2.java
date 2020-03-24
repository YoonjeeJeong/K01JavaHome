
package ex08class;

//과일판매자를 추상화한 클래스 
class FruitSeller2 {
	int numOfMango;//판매자의 망고 갯수
	int myMoney;//판매자의 수익
	int mango_price;//망고의 단가 < 상수아닌거로 지정
/*	클래스의 멤버상수로 정의하는 경우 선언과 동시에 초기화 해야 하므로 상수는
 	초기값이 없는 상태로는 사용할 수 없다! */
	
/*	mango_price를 변수로 변경한 이유는 상수는 단 한번만 초기화되는 특성때문에
  	일반적인 멤버메소드내에서는 초기화할 수 없다.
  	멤버메소드는 개발자가 원할 떄 언제든지 호출할 수 있기 때문에 상수의 특성과는 맞지
  	않기 때문이다.
 */
	public void initMembers(int money, int mangoNum, int price) {
		myMoney = money;
		numOfMango = mangoNum;
		mango_price = price;
	}
	public int saleMango(int money) {
		int num = money / mango_price;
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
class FruitBuyer2 {
	int myMoney;//보유한 금액
	int numOfMango;//구매한 망고의 갯수
	
	/*초기화메소드: 
	 멤버변수를 초기화할때 사용한다. 2차버전에서는 생성자대신 사용되고 있으며, 
	 객체 초기화기 여러줄에 걸쳐 코딩해야하는 번거로움을 간편하게 해결할 수 있다. */
	public void initMembers(int _myMoney, int _numOfMango ) {
		myMoney = _myMoney;
		numOfMango = _numOfMango;
	}

	public void buyMango(FruitSeller2 seller, int money) {
		numOfMango += seller.saleMango(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]망고 갯수:"+ numOfMango);
	}
}

public class E06FruitSalesMain2 {
	public static void main(String[] args) {
		/*초기화 메소드의 의해 서로 다른 초기값을 가지는 객체를 생성할 수 있게 된다.
		 아래에서는 판매단가와 재고가 서로 다른 2개의 판매자 객체를 생성한다. */
		
		//판매자1
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0,100,1000);
		
		//판매자2
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0,80,500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자 1, 2에게 각각 5천원을 지불하고 구매
		buyer.buyMango(seller1, 5000);
		buyer.buyMango(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}
	
}
