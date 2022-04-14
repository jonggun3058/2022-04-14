package day06;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		System.out.println("Game Start");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = r.nextInt(10);
		
		System.out.println("값을 입력하시오.");
		
		while(true) {
			try {
				String n1 = sc.next();
				int num = 0;
				if(n1.equals("종료")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				num = Integer.parseInt(n1);
				if(num < 0 || num >9) {
					System.out.println("0 ~ 9 사이의 값을 입력하시오.");
					continue;
				}else if(num > n) {
					System.out.println("입력한 숫자가 지정값보다 큽니다.");
					continue;
				}else if(num < n) {
					System.out.println("입력한 숫자가 지정값보다 작습니다.");
					continue;
				}else {
					System.out.println("정답입니다.");
					sc.close();
					return;
				}
			}catch(Exception e) {
				System.out.println("숫자를 입력하시오.");
				continue;
			}
			
		}

	}

}
