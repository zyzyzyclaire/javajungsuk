package youtube;

import java.util.Objects;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE",1);
	}

	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "kind:"+kind+", number:"+number;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Card)) {
			return false;
		} else {
			return this.kind.equals(((Card)obj).kind)
				&& this.number==((Card)obj).number;
		}
	}
	
	//equals()를 오벌아딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
}
public class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));	// true
		
		System.out.println(c1.hashCode());	// -1842861219
		System.out.println(c2.hashCode());	// -1842861219
		
		System.out.println(c1.toString());	// kind:SPADE, number:1
		System.out.println(c2.toString());	// kind:SPADE, number:1
	}
}
