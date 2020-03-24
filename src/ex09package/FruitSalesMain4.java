
package ex09package;

import ex09package.kosmo.buyer.FruitBuyer4;
import ex09package.kosmo.seller.FruitSeller4;

/*
연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 
구분하여 정상 실행되도록 변경하시오.
FruitSeller4 클래스 -> ex09package.kosmo.seller 패키지에 묶는다.
FruitBuyer4 클래스 -> ex09package.kosmo.buyer 패키지에 묶는다.

두 클래스를 적당히 import하여 정상동작할수 있도록 
FruitSalesMain4 클래스를 구성한다.
 */
/* FruitSeller4클래스는 외부 패키지에 정의되어 있으므로 반드시
import해야한다. buyMango()메소드에서 매개변수로 사용되고 있기 때문이다. */


//과일판매자를 추상화한 클래스 

//구매자를 표현한 클래스

public class FruitSalesMain4 {
	public static void main(String[] args) {
		
			//원의 넓이: 클래스 사용을 위해 풀패키지 경로를 사용함.

		
		//판매자1
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		//판매자2
		FruitSeller4 seller2 = new FruitSeller4(0,80,500);
		
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
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
