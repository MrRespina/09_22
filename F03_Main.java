package Practice;

public class F03_Main {
	

	public static void getNum(int a) {
		
		System.out.println(a);
		a = 20;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		System.out.println("main에 있는 변수 a : "+a);
		getNum(a);

	}

}
