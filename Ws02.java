package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		System.out.println("Lotto Start");
		
		Scanner sc = new Scanner(System.in);
		//�ζ� ��ȣ ����
		int ar[] = new int[4];
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		//System.out.println(Arrays.toString(ar));
		
		//���� ����
		int as[] = new int[4];
		
		while(true) {
			try {
				System.out.println("Input first number");
				String n1 = sc.next();
				System.out.println("Input second number");
				String n2 = sc.next();
				System.out.println("Input third number");
				String n3 = sc.next();
				System.out.println("Input forth number");
				String n4 = sc.next();
				
				int num1 = Integer.parseInt(n1);
				int num2 = Integer.parseInt(n2);
				int num3 = Integer.parseInt(n3);
				int num4 = Integer.parseInt(n4);
				
				as[0] = num1;
				as[1] = num2;
				as[2] = num3;
				as[3] = num4;
				
				for (int i = 0; i < ar.length; i++) {
					for (int j = 0; j < i; j++) {
						if(as[i] == as[j]) {
							System.out.println("�Է��� �� �� �ߺ��� ���� �ֽ��ϴ�.");;
							continue;
						}
					}
				}
				if(num1 < 1 || num2 < 1 || num3 < 1 || num4 < 1 ||
					num1 > 10 || num2 > 10 || num3 > 10 || num4 > 10) {
					System.out.println("1 ~ 10������ ���� �Է��Ͻÿ�.");
					continue;
				}
			
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				continue;
			}
			break;
			
		
		}
					
		System.out.println("�Է��� ��ȣ��:" + Arrays.toString(as));
		
		int count = 0;
		for (int i = 0; i < as.length; i++) { 
			for (int j = 0; j < i; j++) {
				if(ar[i] == as[j]) {
					count++;
				}
			}
		}
		System.out.println("���� ���ڴ� ");
		
	}

}
