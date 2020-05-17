package homework;

import java.util.Scanner;

public class HomeWork2 {
	public class Lesson10 {
		public static void main(String[] args) {
			System.out.println("INPUT NUMBER : ");
			Scanner scanner = new Scanner(System.in);
			int InputNum = scanner.nextInt();
			for(int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n", InputNum,i,InputNum*i);
			}
		}
	}
}