package youtube;

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car=fe;		// car = (Car)fe; ���� ����ȯ ����
//		car.water();	// ����. Car Ÿ���� ���������� car�δ� water() ��� �Ұ�
		
		fe2 = (FireEngine)car;	// �ڼ�Ÿ�� <- ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}