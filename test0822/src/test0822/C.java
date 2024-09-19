package test0822;

public class C {
	public int sum() {
		int value = 0;  // 값을 담을 변수를 초기화 세팅한다.
		
		
		int hap = 0; // 총합을 누적해서 담는 변수
		
		for(int i=1 ;i <=10 ;i++) {
			hap = hap + i;
		}
		value = hap;
		
	return value;
	}

}
