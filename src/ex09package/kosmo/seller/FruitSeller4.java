package ex09package.kosmo.seller;

public class FruitSeller4 {
		int numOfMango;//판매자의 망고 갯수
		int myMoney;//판매자의 수익
		final int MANGO_PRICE;//망고의 단가 다시 상수로 선언함.

		/*	상수는 값의 변경이 불가능 하고 단 한번만 초기화되기 때문에
		일반적인 멤버메소드에서는 초기화할 수 없다. 단, 생성자메소드에서는 초기화 가능. 
		마음대로 호출 불가하고, 객체생성시 단 한번만 호출되는 특성이 동일하기 때문에
		한번이상 초기화 되지 않음이 보장되기 때문. */
		public FruitSeller4(int money, int mangoNum, int price) {
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

