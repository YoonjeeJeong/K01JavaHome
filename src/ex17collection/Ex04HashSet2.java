package ex17collection;

import java.util.HashSet;
import common.Person;

public class Ex04HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Person> hashSet = new HashSet<Person>();
		Person p1 = new Person("정우성", 30);
		Person p2 = new Person("장동건", 31);
		Person p3 = new Person("정우성", 30);
		//hashCode: Person객체를 비교한다(비교대상의 객체가 Person인지를 확인한다)
		//equals()는 Person객체 안의 내용, 값->("장동건", 31)을 비교한다
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3 객체 저장여부:"+ b);//먼저 온 객체 중에 p3와 같은 것이 있는지 확인을 한다
		
		System.out.println("HashSet에 저장된 객체수: "+ hashSet.size());
	}

}
