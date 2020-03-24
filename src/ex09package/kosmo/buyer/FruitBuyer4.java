package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;

public class FruitBuyer4 {
	int myMoney;//보유한 금액
	int numOfMango;//구매한 망고의 갯수

	public FruitBuyer4(int _myMoney, int _numOfMango ) {
		myMoney = _myMoney;
		numOfMango = _numOfMango;
	}

	public void buyMango(FruitSeller4 seller, int money) {
		numOfMango += seller.saleMango(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]망고 갯수:"+ numOfMango);
	}
}