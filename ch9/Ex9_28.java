package youtube;

public class Ex9_28 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println("i = "+Integer.parseInt("100"));	// ,10ÀÌ »ı·«µÊ
		System.out.println("i = "+Integer.parseInt("100",10));
		System.out.println("i = "+Integer.parseInt("100",2));
		System.out.println("i = "+Integer.parseInt("FF",16));
	}
}
