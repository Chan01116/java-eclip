package test0822;

public class Test0919 {	
	
	//클래스의 멤버변수를 생성 전역변수
	String str = null;
	
	//멤버메소드
	public void test() {
		
		
		int a = 0; //지역변수
		
		System.out.println(str);
	}
	Test0919(){
		super();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요");
		C c = new C();
		int g = c.sum();
		System.out.println(g);
		
		D d = new D();
		d.X();

		
		
		
		//객체 생성코드
		//클래스 타입 객체참조 변수 = new 클래스생성자();
		//자바의 다형성의 예 메서드 오버라이딩 : 이름은 같은데 재정의
		//오버로딩
		//업캐스팅
		
		
		
		//클래스 c를 생성해서 1에서 10까지 합을 구하는 메서드를 만들고 그 값을 출력하시오
		//클래스 D를 생성하서 멤버면수 X를 설정하고 X값이 3이고 5보다 작으면 작다라고 출력하고 5보다 크면 크다라고 출력하세요
		
		
		
	

	}



}
