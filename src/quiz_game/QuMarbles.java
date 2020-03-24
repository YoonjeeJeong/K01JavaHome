package quiz_game;
/* 구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
초기화는 다음과 같이 진행한다.
◆어린이1의 보유갯수 : 구슬 20개
◆어린이2의 보유갯수 : 구슬 15개
게임은 다음과 같이 진행한다.
◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
# 어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다. 
<게임 전 구슬의 보유 개수>
어린이1 : 보유 구슬의 개수 20
어린이2 : 보유 구슬의 개수 15

게임 후 구슬의 보유 개수
어린이1 : 보유 구슬의 개수 16
어린이2 : 보유 구슬의 개수 19  */

class ChildBeads{
	int beadCount;
	
	public ChildBeads(int bead) {
		beadCount = bead;
	}
	public void showProperty() {
		System.out.println("보유구슬의 갯수"+beadCount);
	}
	public void winBead(ChildBeads child, int bc) {
		this.beadCount += bc;
		child.beadCount -= bc;
	}
}

public class QuMarbles {

	public static void main(String[] args) {

		ChildBeads child1 = new ChildBeads(20);
		ChildBeads child2 = new ChildBeads(15);
		
		child1.winBead(child2, 5);
		child2.winBead(child1, 9);
		
		System.out.println("게임후 구슬의 보유 갯수"+child1.beadCount);
		System.out.println("게임후 구슬의 보유 갯수"+child2.beadCount);
	}

}
