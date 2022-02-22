package youtube;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) 
			return false;
		else
			return this.id == ((Person)obj).id;
		
	}	
	Person(long id){
		this.id=id;
	}
}
public class Ex9_1 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
	}
}
