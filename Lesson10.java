package basic;

import java.util.Scanner;
//10-2 for¹®
public class Lesson10 {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int InputNum = scanner.nextInt();
		for(int i=0;i<10;i++) {
			System.out.printf("%d * %d = %d\n", InputNum,i,InputNum*i);
		}
	}
}
