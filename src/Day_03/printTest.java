package Day_03;

public class printTest
{ public static void main(String[] args)
	{	// int Lday = 7;
		/*
		 * // System.out.println("2022년 12월 26일 입니다."); //
		 * System.out.print("3일차 수업 이구요 \\^^/ \n"); // System.out.print("2번째 시간이에요"); //
		 * // System.out.printf("\n여러분들 남은 %d일 \"파이팅\" 해보아요!!!!\n", Lday); //
		 * System.out.printf("%d , %f \n", 12,3.141592); //
		 * System.out.printf("%f",3.14);
		 */	
		String weahter = "맑음";
		int month = 12;
		int date = 26;
		double max = 1.253;
		double min = -9.55;
		
		// 변수를 이용하여 값을 넣어주기
		System.out.printf("오늘은 %d월 %d일 입니다.\n", month, date);
		System.out.printf("오늘의 날씨는 %s입니다. + ", weahter);
		System.out.println("오늘의 날씨는 "+weahter+"입니다.");
		
		// 직접 값을 넣어주기
		System.out.printf("오늘의 날씨는 %s입니다. \n", "흐림");
		
		//실수
		System.out.printf("오늘의 최저기온은 %f도 입니다. + ",min);
		System.out.printf("최고기온은 %f도 입니다. \n",max);
		//소수점 자리수 정하고 반올림@! 6자리수까지 표현함!
		System.out.printf("최고기온은 %.3f도 입니다.",max);
		
		// 정수
		System.err.printf("\n코카콜라의 가격은 %05d원 입니다.\n", 500);
		// %5d => 5는 자릿수
		// 5칸 중에서 한칸에 넣어준 값이 들어간다.
		System.err.printf("코카콜라의 가격은 %-5d원 입니다. \n",500);
		
		// 문자열 
		String menu = "펩시콜라";
		
		System.out.printf(" %s의 가격은 1000원 입니다.\n",menu);
		//.2작성 후는 문자열에서는 문자열 자르기로 출력된다.
		System.out.printf(" %.2s의 가격은 1000원 입니다.\n",menu);
		System.out.printf("%.3s의 가격은 1000원 입니다. \n","코카콜라");
		
		// 서식문자 실습
		// 원주율 출력 perimeter 의 값을 3.1416
		// printf 활용
		// 변수 사용 값 수정 X
		final double PERIMETER = 3.14169265358979;
		System.out.printf("\n원주율은 %.4f 입니다.",PERIMETER);
		
		// 서식문자 실습 2
		// 아래 코드를 완성해서 오늘은 월요일 입니다. 날씨는 맑음이라고 출력하기
		char dae = '월';
		String Weather = "맑음";
		System.out.printf("\n\n오늘은 %c요일 입니다. 날씨는 %s 입니다.\n",dae,Weather);
		
		
		// 서식문자 실습 3
		// 내 자바 점수는 100점 입니다. 출력 => 왼쪽정렬로 출력
		// 내 평균 점수는 88.155점 입니다. => 소수점 1자리 까지 표현
		
		System.out.printf("\n내 자바 점수는 %-4d점 입니다. \n",100);
		System.out.printf("내 평균 점수는 %-4.1f점 입니다. \n",99.255);
		
	}

}
