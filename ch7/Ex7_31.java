package youtube;

abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+" 위치부터 play");}
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class Ex7_31 {
	public static void main(String[] args) {
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();	// 다형성
		ap.play(100);
		ap.stop();
		
	}
}