package day06;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		System.out.println("Game Start");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = r.nextInt(10);
		
		System.out.println("���� �Է��Ͻÿ�.");
		
		while(true) {
			try {
				String n1 = sc.next();
				int num = 0;
				if(n1.equals("����")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				num = Integer.parseInt(n1);
				if(num < 0 || num >9) {
					System.out.println("0 ~ 9 ������ ���� �Է��Ͻÿ�.");
					continue;
				}else if(num > n) {
					System.out.println("�Է��� ���ڰ� ���������� Ů�ϴ�.");
					continue;
				}else if(num < n) {
					System.out.println("�Է��� ���ڰ� ���������� �۽��ϴ�.");
					continue;
				}else {
					System.out.println("�����Դϴ�.");
					sc.close();
					return;
				}
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				continue;
			}
			
		}

	}

}
