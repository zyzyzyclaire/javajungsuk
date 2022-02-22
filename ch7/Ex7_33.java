package youtube;

public class Ex7_33 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		//group�� Ÿ���� Unit[], group[0]group[1]group[2]�� Ÿ���� Unit
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {/*���� ��ġ���� ����*/}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x="+x+", y="+y+"]");
	}
	void stimPack() {/*�������� ����Ѵ�.*/}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
	}
	void changeMode() {/*���ݸ�带 ��ȯ�Ѵ�.*/}
}

class DropShip extends Unit {
	void move(int x, int y) {
		System.out.println("DropShip[x="+x+", y="+y+"]");
	}
	void stimPack() {/*�������� ����Ѵ�.*/}
}