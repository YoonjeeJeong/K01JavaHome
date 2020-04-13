package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {
private static final int browse = 0;

	/*검색할 이름을 입력하세요:가길동
오버라이딩 한 equals() 호출됨:가길동
[검색되었습니다]
[삭제후 정보출력]
이름:나길동, 나이:20, 학번:2017
이름:다길동, 나이:30, 학번:2016
이름:마길동, 나이:40, 학번:2015 */
	public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		System.out.print("검색할 이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String search = scan.nextLine();
		int index = -1;//인덱스는 0이상이므로 초기값은 -1로 지정함 
		//2.확장for문으로 컬렉션 전체를 접근
		for(Student student : list) {
			if(search==student.name) {
			list.indexOf(search);
			break;
			}
		}
		System.out.println("검색되었습니다");
		list.remove(index);
		if(browse!=1) {
			System.out.println("결과가 없습니다");
		}
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력

		//4.전체정보 출력
		for(Student student:list) {
			student.showInfo();
		}
	}		
}