package test0822;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// 샘플 인터페이스를 구현해서 호랑이가 4발로 뛰어다닌다 라고 출력하세요
		Tiger t = new Tiger();
		t.move();
		ArrayListTest a = new ArrayListTest();
		//어레이리스트는 자바가 제공하는 컬렉션 프레임워크 클래스 빈상자와 같다
		//배열의 특성을 가지고 있어서 속도가 빠른게 장점이고 자동으로 번호표가 부여된다.
		//데이터 조회시 열람시 사용을 많이한다. 입출력이 수정 삽입 삭제가 빈번하 데이터는 효과가 별로 없다.
		ArrayList<String> dd = a.test();
		
		System.out.println(dd);
		String name = dd.get(1);
		System.out.println(name);
		

	}
	public static int a() throws Exception {
		throw new Exception();
	}
	
	

}
