package basic;

import java.util.Scanner;

public class Lesson10_2 {
//10-3 while문
//	public static void main(String[] args) {
//		System.out.print("INPUT NUMBER: ");
//		Scanner scanner = new Scanner(System.in);
//		int num=scanner.nextInt();
//		int i=1;
//		while(i<10) {
//			System.out.printf("%d * %d = %d\n",num,i,num*i);
//			i++;
//		}
//	}
//10-4 do-while문 일단 한번 들어감. 그러고 while 조건 안에 들어가면 계속 함. 조건에 맞지않으면 탈출
	
	public static void main(String[] args) {
		int i=10;
		do {
			System.out.println("무조건 한번은 들어감");
			i++;
		} while (i<13);
	}
	
}
