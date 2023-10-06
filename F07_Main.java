package Practice;

import java.util.Scanner;

// 비만도 구하기 > 함수 버전으로 제작.
// 표준 체중 : ( 키 - 100 ) * 0.9
// 비만도 : ( 몸무게 / 표준체중 ) * 100
// 비만도 >= 120 일시 비만
// 키를 입력받는 함수 , 몸무게를 입력받는 함수 사용 후 메인에서 결과 출력

public class F07_Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static Double getHeight() {
		
		System.out.print("키를 입력해주세요 : ");
		Double height = s.nextDouble();
		return height;
		
	}
	
	public static Double getWeight() {
		
		System.out.print("키를 입력해주세요 : ");
		Double weight = s.nextDouble();
		return weight;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double height = getHeight();
		double weight = getWeight();
		double avgWeight = ((height - 100) * 0.9);
		double fatCheck = ((weight / avgWeight) * 100);

		System.out.println("===== 비만도 검사 프로그램 =====");
		System.out.println("= 당신의 키 : " + height);
		System.out.println("= 당신의 몸무게 : " + weight);
		System.out.println("= 표준 체중 : " + avgWeight + "kg");
		System.out.printf("= 비만도 : %.2f%%\n", fatCheck);
		String result = ((fatCheck >= 120) ? "비만" : "정상");
		System.out.println("= 당신은 비만인가? : " + result);
		System.out.println("==========================");

		s.close();

	}

}
