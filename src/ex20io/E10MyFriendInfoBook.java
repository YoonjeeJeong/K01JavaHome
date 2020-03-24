package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
/*
 연습문제 ] 해당 프로그램은 친구의 정보를 저장하게 된다.
 프로그램 종료시 Friend타입의 객체배열에 저장된 친구의 정보를 파일의 형태로
 저장할 수 있도록 직렬화 하시오.
 -저장될 파일명: friend_info.obj */
class Friend implements Serializable {
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버메소드
	/*
	 멤버변수 전체 정보를 출력하는 메소드  */
	public void showAllData() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호 : "+ phone);
		System.out.println("주소 : "+ addr);	
	}
	public void showBasicInfo() {}
}
//고등학교 친구
class HighFriend extends Friend {
	String nickname;//자식에서 확장한 멤버변수
	public HighFriend(String name, String phone, String addr,
			String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)");
		super.showAllData();
		System.out.println("별명"+ nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구");
		System.out.println("별명: "+ nickname);
		System.out.println("전번: "+ phone);
	}
}
class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr, 
			String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)");
		super.showAllData();
		System.out.println("전공: "+ major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구");
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
	}	
}
public class E10MyFriendInfoBook {
	//프로그램에서의 입력메뉴 출력
	public static void menuShow() {
		System.out.println("*메뉴를 선택하세요*");
		System.out.println("1.고딩친구입력 ");
		System.out.println("2.대딩친구 입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램 종료");
		System.out.println("메뉴선택>>>");
	}
	public static void main(String[] args) {
		//프로그램 전반에 대한 비즈니스로직을 가진 핸들러 객체 생성
		FriendInfoHandler handler = 
				new FriendInfoHandler(100);
		
		while(true) {//메뉴출력을 위한 메소드 호출
			menuShow();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
					
			switch(choice) {
			case 1:case 2: 
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				handler.saveFriendInfo();
				System.out.println("프로그램을 종료합니다~!");
				return;//main 함수의 종료는 프로그램 종료로 이어진다
			}
		}
	}	
}
class FriendInfoHandler {
	//멤버변수
	private Friend[] myFriends;
	private int numOfFriends;//친구정보를 추가할 때마다 +1 증가
	
	//생성자 : 인자로 전달되는 num크기로 객체배열을 생성함
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	public void addFriend(int choice) {
		//사용자로부터 친구정보 입력받을 준비
		Scanner scan = new Scanner(System.in);	
		String iName, iPhone, iAddr, iNickname, iMajor;	
		//공통사항 입력받기
		System.out.println("이름: "); iName = scan.nextLine();
		System.out.println("전화번호: ");iPhone = scan.nextLine();
		System.out.println("주소: ");iAddr = scan.nextLine();
		
		if(choice==1) {
			//고딩친구 입력
			System.out.println("별명: "); iNickname = scan.nextLine();
			HighFriend high = 
					new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice==2) {
			//대딩친구 입력
			System.out.println("전공:"); iMajor = scan.nextLine();
			myFriends[numOfFriends++] =
					new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("친구정보 입력 완료");	
	}//친구정보 전체보기
	public void showAllData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보 출력됨");
		
	}
	//친구정보 간략보기
	public void showSimpleData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showBasicInfo();;
		}
		System.out.println("==간략정보 출력됨");		
	}////end of showSimpleData
	
	
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		
		for(int i=0; i<numOfFriends ; i++) {
			System.out.println("검색중인 이름:"+myFriends[i].name);
			
			//검색할 이름과 객체의 이름이 일치하는 경우 모든정보를 출력함
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllData();
				System.out.println("귀하가 요청하는 정보를 찾았습니다.");
			}
		}
	}
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		/*아래: 배열의 요소중 삭제된 요소의 인덱스 값을 저장할 용도의 변수
		 요소를 삭제한 수 빈자리를 채울때 사용할 예정임*/
		int deleteIndex = -1;
		
		for(int i=0; i<numOfFriends ; i++) {		
			if(deleteName.compareTo(myFriends[i].name)==0) {
				//요소를 삭제하기 위해 참조값을  null로 변경
				myFriends[i] = null;
				//삭제된 요소의 인덱스값 저장
				deleteIndex = i;
				//전체카운트 변수 -1 차감
				numOfFriends--;
		}
	}
		if(deleteIndex == -1) {
			//검색된 데이터가 없는 경우...
			System.out.println("==삭제된 데이터 없음");
		}
		else {
			/*객체배열에서 검색된 요소를 삭제한 후 입력된 위치의
			 바로뒤 요소를 앞으로 하나씩 교환한다  */
			for(int i=deleteIndex ; i<numOfFriends ; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+ deleteIndex + "번)가 삭제됬음");
		}
	}

	public void saveFriendInfo() {	
		try {
			ObjectOutputStream out = new ObjectOutputStream
					(new FileOutputStream("src/ex20io/friend_info.obj"));
			//myFriends개체배열에 저장된 친구의 정보만큼 반복

			for(int i=0 ; i<numOfFriends ; i++) {
				//객체배열의 i번째 요소를 파일로 저장
				out.writeObject(myFriends[i]);
			}
			out.close();
		}
		catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
	}
}

