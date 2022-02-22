package youtube;

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car=fe;		// car = (Car)fe; 에서 형변환 생략
//		car.water();	// 에러. Car 타입의 참조변수인 car로는 water() 사용 불가
		
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입. 형변환 생략 불가
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