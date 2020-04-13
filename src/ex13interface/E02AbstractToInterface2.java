package ex13interface;
/* 추상 클래스를 interface로 변경하기:
 	- abstract class => interface	
 	- 메소드의 경우 public abstract를 제거
 	- 멤버상수인 경우 public static final을 제거  */

//프로젝트 전체에서 기준이 될 수 있는 추상클래스 정의
interface PersonalNumberStoragesInter {
	void addPersonalInfo(String juminNum,
			String name);
	String searchPersonalInfo(String juminNum);
}
//사람의 정보를 저장할 용도의VO클래스. 혹은 VO클래스라고도 한다.
class PersonalInfoVO {
	//멤버변수
	private String name;
	private String juminNum;
	//생성자
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	public String getName() {
		return name;
	}
	public String getJuminNum() {
		return juminNum;
	}	
}
/*클래스가 클래스를 상속받을때 => extends 사용
 클래스가 인터페이스를 상속받을때 => implements 사용
 인터페이스가 인터페이스를 상속받을때 =>  extends 사용 
 >>>extends는 '상속'이라 표현하고, implements는 '구현'이라 표현했다.	*/
class PersonalNumberStorageImpl implements PersonalNumberStoragesInter {
	//멤버변수
	PersonalInfoVO[] personalArr;//정보저장용 객체배열
	int numOfPerInfo;//입력정보 카운트용 변수
	
	//생성자
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;		
	}
	/* 전달받은 인자를 통해 PersonalInfoVO객체를 생성후 객체배열에
	 저장한다 */
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] =
				new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}
	/*주민번호를 인자로 전달받아 객체배열에 저장된 정보를 검색한 후
	일치하는 경우에만 이름을 반환한다. */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0 ; i<numOfPerInfo ; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
			{
		//getter를 통해 이름 반환
			return personalArr[i].getName();
		}
	}
	return null; // 검색결과가 없는경우 null반환
	}
}
public class E02AbstractToInterface2 {
	public static void main(String[] args) {
		
		PersonalNumberStoragesInter storage =
				new PersonalNumberStorageImpl(10);		
		//정보저장
		storage.addPersonalInfo("9201234-2222222", "김광수");
		storage.addPersonalInfo("9201234-2222333", "김정수");		
		//검색
		System.out.println(storage.searchPersonalInfo("9201234-2222222"));
		System.out.println(storage.searchPersonalInfo("9201234-2222333"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}
