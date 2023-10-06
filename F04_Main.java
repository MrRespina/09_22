package Practice;

// overloading(function은 같고 parameter는 다르게.)
// overriding(상속받은 function을 구현화or확장)

public class F04_Main {

	public static void printMenu() {

		System.out.println("오늘 점심은 돈까스");

	}

	public static void printMenu(String s) {

		System.out.println("오늘 점심은 " + s);

	}

	public static void printMenu(int i) {

		System.out.println(i+"일 점심은 냉면");

	}
	
	public static void printSum(int a,int b) {
		
		System.out.println("a + b의 값 = "+(a+b));
		
	}

	public static void printSum(double a,double b) {
		
		System.out.println("a + b의 값 = "+(a+b));
		
	}

	public static void main(String[] args) {

		printMenu();
		printMenu("라면");
		printMenu(22);
		printSum(10,3);
		printSum(10.0,4.0);

	}

}
