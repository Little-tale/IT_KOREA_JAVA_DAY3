package Day_03;

public class Variable01 {
	public static void main(String[] args) 
	{
		
		int a; // 리터럴지정하지 않은 변수 a 
		a = 26; //변수 a 에 26이라는 값을 저장했음
		
		for (int i=0 ; i<5 ; ++i) 
			{
			System.out.println(a);
			}
		
		int b = 12;
		System.out.println(b);
		System.out.println(a + b);
		
		long c = 22 ; //리터럴 값이 범위안에 있어 가능
		long z = 100_000_000_000L; // 리터럴 값이 벗어나 L을 필요로 해짐 즉 c는 int로 해석됨
		
		System.out.println(c + "이놈" + z);
		
		
		
		
	}

}
