
class Person {
	//멤버변수
	private String name;
	boolean isMarried;
	
	
	//멤버메소드
	public void showInfo() {
		System.out.println("이름"+ name);
		System.out.println("결혼여부"+isMarried);
	}
	//생성자
	public Person(String name, boolean isMarried) {
		super();
		this.name = name;
		this.isMarried = isMarried;
	}
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class gettersetter {

	public static void main(String[] args) {
		Person p1 = new Person("윤지", false);
		//p1.name = "류정";
		p1.setName("류정");
		p1.showInfo();
	}
}
