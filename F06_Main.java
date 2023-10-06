package Practice;

import java.util.Scanner;

public class F06_Main {

	public static void random() {

		double r = Math.random();
		int i = ((int) (r * 10)) + 1;
		System.out.println("랜덤 정수 = " + i);

	}

	public static int randomize() {

		double r = Math.random();
		int i = ((int) (r * 10)) + 1;
		return i;

	}

	public static void check(int i) {

		String result = (i % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력된 정수 = " + i);
		System.out.println("홀 짝 확인 결과 = " + result);

	}

	public static int ver(int a, int b) {

		int result = (a > b) ? a : b;
		System.out.println("===== 비교중 =====");
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		random();
		int n = randomize();
		System.out.println("랜덤 정수(저장) = " + n);

		System.out.println("===== 홀 짝 확인 =====");

		System.out.print("정수를 입력해주세요 : ");
		int check = s.nextInt();
		check(check);

		System.out.println("===== 큰 숫자 비교 =====");
		System.out.print("정수를 입력해주세요 : ");
		int a = s.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int b = s.nextInt();

		int result = ver(a, b);
		System.out.println("선택된 수 : " + result);

		s.close();

	}

}
