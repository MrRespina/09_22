package Practice;

import java.util.Scanner;

public class F05_Main {

	public static void homeRequest() {

		System.out.println("돈 줄테니 슈퍼에서 라면이랑 참치캔 사고 남는 돈은 가져오렴.");

	}

	public static int takeMoney() {

		Scanner s = new Scanner(System.in);
		System.out.print("받은 돈 : ");
		int money = s.nextInt();
		System.out.println(money + "원을 받았다.");
		s.close();
		return money;

	}

	public static void payMoney(int m) {

		System.out.println("★예상");
		System.out.println("라면 = 1500원");
		System.out.println("참치캔 = 1000원");
		int sum = m - 1500 - 1000;
		System.out.println("남은 돈 = "+sum+"원?");

	}
	
	public static int pay(int m) {
		
		System.out.println("★슈퍼마켓에 도착");
		System.out.println("라면 = 1500원");
		System.out.println("참치캔 = 1000원");
		int sum = m - 1500 - 1000;
		System.out.println("계산 완료");
		System.out.println("남은 돈 = "+sum+"원");
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		homeRequest();
		int money = takeMoney();
		payMoney(money);
		int sum = pay(money);
		System.out.println("심부름 이후 돌려드린 돈 = "+sum+"원");

	}

}
