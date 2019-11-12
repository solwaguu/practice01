package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int input = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= input; i++) {
			if(i % 2 == 0) {
				// System.out.println(i);
				sum += input;
			} else {
				sum += input;
			}
		}
		
		System.out.println("결과 값 : "+ sum);
		
		scanner.close();
	}

}
