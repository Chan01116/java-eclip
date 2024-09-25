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
		
		//제너릭을 통한 객체 타입생성
		ArrayList<BoardVo> alist = new ArrayList<BoardVo>();
		
		BoardVo bv = new BoardVo(); //BoardVo 객체를 생성한다
		
		bv.setSubjet("게시판 제목입니다.");
		bv.setContents("게시판 내용입니다.");
		bv.setBidx(1);
		
		BoardVo bv2 = new BoardVo(); // BoardVo 객체 두번째 생성
		
		bv2.setSubjet("게시판 두번째 제목입니다.");
		bv2.setContents("게시판 두번째 내용입니다.");
		bv2.setBidx(2);
		
		alist.add(bv);
		alist.add(bv2);
		
		
		
		System.out.println("alist에 담긴것은?"+alist);
		
		System.out.println("alist에 담긴두번째 객체가 가지고 있는 제목은?"+alist.get(1).getSubjet());
		
		String aa = "안녕";
		String bb = "하세요";
		String cc = aa+bb;
		
		System.out.println("cc값은 뭘까요"+cc); //연결하는 것이 아닌 새로운 객체를 만듬
		
		// Buffer Builder
		

	}
	public static int a() throws Exception {
		throw new Exception();
	}
	
	

}
