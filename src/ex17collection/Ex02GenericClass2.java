package ex17collection;

class Mango {
	int weight;
	public Mango(int w) {
		weight = w;
	}
	public void showInfo( ) {
		System.out.println("망고의 무게는 "+ weight +"g이다");
	}
}
class Papaya {
	int sugar;
	public Papaya(int s) {
		sugar = s;
	}
	public void showInfo() {
		System.out.println("파파야의 당도는 "+ sugar + "이다");
	}
}
class GenericFruitBasket<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}
public class Ex02GenericClass2 {

	public static void main(String[] args) {
		GenericFruitBasket<Mango> mangoBox =
				new GenericFruitBasket<Mango>();
		mangoBox.store(new Mango(500));
		Mango mango = mangoBox.pullOut();
		mango.showInfo();
		
		GenericFruitBasket<Papaya> papayaBox =
				new GenericFruitBasket<Papaya>();
		papayaBox.store(new Papaya(8000));
		Papaya papaya = papayaBox.pullOut();
		papaya.showInfo();
	}

}
