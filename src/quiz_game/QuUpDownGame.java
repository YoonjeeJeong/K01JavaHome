package quiz_game;

import java.util.Scanner;

class Game {
	Scanner scan = new Scanner(System.in);
	
	void randomGame() {
		int myNumber;
		int randomNumber = (int)(Math.random()*100)+1;
		int i =1;
		
		while (i<=7) {
			System.out.println(i+"번째 라운드");
			System.out.println("번호를 입력하시오(1~100)");
			
			myNumber = scan.nextInt();
			
			if(myNumber<1 || myNumber>100) {
				System.out.println("올바른 수가 아닙니다");
				continue;
			}
			if(myNumber==randomNumber) {
				System.out.println("성공했어요");
				break;
			}
			else {
				
				if(myNumber>randomNumber) {
				System.out.println("Up");
				}
				else {
					System.out.println("Down");
				}
			}
			i++;
		}
		restart();
		
	}
	void restart() {
		int ask;
		System.out.println("다시 하기겠습니까? 1.재시작 0. 종료");
		ask = scan.nextInt();
		
		if(!(ask==0 || ask==1)) {
			System.out.println("제대로 입력하세요");
			restart();
		}
		else {
			if(ask==1) {
				randomGame();
			}
		}		
	}
}
public class QuUpDownGame {

	public static void main(String[] args) {
		Game game = new Game();
		game.randomGame();
	}
}
