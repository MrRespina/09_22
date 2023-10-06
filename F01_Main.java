package Practice;

public class F01_Main {

	//	JDK : JVM, Library API, Development kit 포함 Software Package
	//	JRE : JVM, Library API 포함 Software Package
	//	JVM : Java Virtual Machine. OS환경에 맞추어 실행할 수 있는 Java - OS 사이의 중계자 
	//	Write Once Run Anywhere
	
	public static void myPresent() {
		
		System.out.println("==============");
		System.out.println("이름 : 지병천");
		System.out.println("나이 : 28");
		System.out.println("사는곳 : 서울 강서");
		System.out.println("생일 : 0222");
		System.out.println("==============");
		
	}
	
	public static void numCalc(int a,int b) {
		
		int sum = a+b;
		int min = a-b;
		int mul = a*b;
		double div = (double)a/b;
		System.out.println("a + b = "+sum);
		System.out.println("a - b = "+min);
		System.out.println("a * b = "+mul);
		System.out.printf("a / b = %.3f",div);
		
	}
	
	
	public static void waitWeekend() {
		
		System.out.println("===");
		System.out.println("피곤해");
		System.out.println("===");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		waitWeekend();
		myPresent();
		numCalc(11,3);
		
	}
	
	

}
