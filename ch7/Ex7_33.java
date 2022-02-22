package youtube;

public class Ex7_33 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		//group의 타입은 Unit[], group[0]group[1]group[2]의 타입은 Unit
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {/*현재 위치에서 정지*/}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x="+x+", y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다.*/}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
	}
	void changeMode() {/*공격모드를 변환한다.*/}
}

class DropShip extends Unit {
	void move(int x, int y) {
		System.out.println("DropShip[x="+x+", y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다.*/}
}