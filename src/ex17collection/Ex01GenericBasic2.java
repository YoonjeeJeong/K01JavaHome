package ex17collection;

class Melon {
	int sugar;
	public Melon(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("멜론의 당도:" + sugar);
	}
}
class MelonBox {
	Melon item;
	public void store(Melon item) {
		this.item = item;
	}
	public Melon pullout() {
		return item;
	}
}

class FruitBox1 {
	Object item;
	public FruitBox1(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}
public class Ex01GenericBasic2 {
	
	public static void main(String[] args) {
		MelonBox mBox1 = new MelonBox();
		Melon Melon1 = new Melon(50);
		mBox1.store(Melon1);
		Melon1 = mBox1.pullout();
		Melon1.showInfo();
		
		FruitBox1 frBox = new FruitBox1(new Melon(55));
		Melon melon2 = (Melon)frBox.pullOut();
		melon2.showInfo();
		
		FruitBox1 frBox2 = new FruitBox1(new Melon(70));
		Melon melon3 = (Melon)frBox2.pullOut();
		melon3.showInfo();
		
		
		
	}	
}