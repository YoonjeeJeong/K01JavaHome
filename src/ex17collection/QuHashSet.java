package ex17collection;
/*중복 제거용 equals()메소드 호출
[최초 전체 정보출력]
Avengers [본명=스티브로져스, 닉네임=캡틴아메리카, 능력=비브라늄 방패]
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
Avengers [본명=토니스타크, 닉네임=아이언맨, 능력=Mark-48 수트]
검색할 이름을 입력하세욤:브루스배너
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
요청하신 정보를 찾았습니다  */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
		
	}
	@Override
	public int hashCode() {
		//객체가 가진 고유한 값(참조값)을 int형으로 반환하는 메소드
		int hc1  = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		System.out.println(hc1 + " " + hc2+ " " +hc3);
		int result = hc1+hc2+hc3;
				
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Avengers avengers = (Avengers)obj;
		if(avengers.name.equals(this.name)&&
				avengers.heroName.equals(this.heroName)) {
			return true;
		}
		else {		
			return false;
		}
	}
}
public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		//이름으로 검색
		Scanner sc= new Scanner(System.in);
		System.out.println("검색할 이름");
		String searchName = sc.nextLine();
		boolean searchflag = false;//검색결과 유무 확인
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers avengers = itr.next();
			if(searchName.equals(avengers.name)) {
				//검색결과가 있다면 플래그를 변경
				searchflag = true;
				//toString()메소드를 오버라이딩 했으므로 객체를 즉시 출력가능
				System.out.println(avengers);
			}
		}
		if(searchflag == true) {
			System.out.println("요청하신 정보를 찾았습니다");
		}
		else {
			System.out.println("해당 영웅은 없어요 ㅜㅜ");
		}
		
		
		
	}
}
