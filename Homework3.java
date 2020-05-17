package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
			int a=1,b=1;
			while(a>0&&b>0) {
				System.out.print("INPUT A :");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
			
				System.out.print("INPUT B :");
				b = scanner.nextInt();
			
				System.out.printf("RESULT: %d",a+b);
			}
		}
	}

