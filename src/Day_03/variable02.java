package Day_03;

public class variable02 {

	public static void main(String[] args) {
		// 특수문자 사용 불가능 테스트
		// int age! =10 ;
		int $age$ = 10; 
		
		// 공백사용 불가능
		//int user age = 20;
		int userAge = 20;
		
		// 숫자로 시작 불가능
		//int 1age = 30;
		
		//한글은 에러가 안나지만 사용하지 않는다./
		// 이유는 간단하다 한글자당 비트를 얼마나 먹는지 보면 알게 될것이다. 
		//int 한글 = 100;
		
		// 실습1 주어진 값과 자료형을 가지고 선언과 동시에 초기화 하기
		// 오늘날짜 26(int)
		// 키 150.5 (double)
		// 몸무게 20.22 (float)
		// 대면 비대면 여부 true
		// 성별 F/M (char gender)
		
		
		int day = 26;
		double height = 150.5;
		float kg = 20.22f;
		String station = "노원역";
		boolean interview = true; //C언어와 다르게 1로 작성하면 문제가 발생.
		//int tf = 1;
		//System.out.println((boolean)tf);
		//System.out.print((int)interview); 강제 캐스팅으로도 안됨. 왤까. 같은 0과 1일텐데
		
		char gender = '남';
		
		day -= 4;
		
		System.out.println("김재형님의 인적사항");
		System.out.println("날짜는:"+day+"일"+" 키는"+height+"cm"+" 무게는"+kg+"kg"+
							" 지하철역은:"+station+" 대면여부는"+interview+" 성별"+gender);
		
		
		
	}

}
