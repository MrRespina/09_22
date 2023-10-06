package Practice;

import java.util.Scanner;

//기능에 따라 함수 제작 후 main을 최대한 줄일 것 .

public class F08_Main {

	static Scanner s = new Scanner(System.in);

	public static double[] getInfo() {

		double[] info = new double[2];

		System.out.print("키를 입력해주세요 : ");
		info[0] = s.nextDouble();
		
		System.out.print("몸무게를 입력해주세요 : ");
		info[1] = s.nextDouble();
		
		return info;

	}

	public static double[] fatCheck(double[] info) {

		double avgWeight = ((info[0] - 100) * 0.9);
		double check = ((info[1] / avgWeight) * 100);

		double[] sInfo = new double[2];
		
		sInfo[0] = avgWeight;
		sInfo[1] = check;
		
		return sInfo;

	}

	public static void print(double[] info, double[] sInfo) {

		System.out.println("===== 비만도 검사 프로그램 =====");
		System.out.println("= 당신의 키 : " + info[0]);
		System.out.println("= 당신의 몸무게 : " + info[1]);
		System.out.println("= 표준 체중 : " + sInfo[0] + "kg");
		System.out.printf("= 비만도 : %.2f%%\n", sInfo[1]);
		String result = ((sInfo[1] >= 120) ? "비만" : "정상");
		System.out.println("= 당신은 비만인가? : " + result);
		System.out.println("==========================");

		s.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] info = getInfo();
		double[] sInfo = fatCheck(info);
		print(info, sInfo);

	}

}
