package youtube;

abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+" ��ġ���� play");}
	void stop() {System.out.println("����� ����ϴ�.");}
}

public class Ex7_31 {
	public static void main(String[] args) {
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();	// ������
		ap.play(100);
		ap.stop();
		
	}
}