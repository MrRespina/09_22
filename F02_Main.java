package Practice;

public class F02_Main {
	
	public static void testNum(int b) {
		
		int a = 123;
		System.out.println("test 함수 내부");
		System.out.println(b);
		System.out.println(a+b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		testNum(c);
		testNum(30);

	}

}
