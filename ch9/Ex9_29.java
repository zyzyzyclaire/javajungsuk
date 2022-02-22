package youtube;

import java.util.ArrayList;

public class Ex9_29 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));	// list에는 객체만 추가 가능
		list.add(100);	// JDK1.5 이전에는 에러
		
//		Integer i = list.get(0);	// list에 저장된 첫번째 객체를 꺼낸다.
//		int i = list.get(0).intValue();	// intValue()로 integer를 int로 변환
		int i = list.get(0);	// intValue()로 Integer를 int로 변환
	}
}
