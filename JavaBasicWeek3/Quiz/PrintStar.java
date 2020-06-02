package Quiz;

import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=i;j!=0;j--) {
				System.out.printf("%s","*");
			}	
			System.out.printf("%s","\n");
		}	
		for(int i=num-1;i!=0;i--) {
			for(int j=i;j!=0;j--) {
				System.out.printf("%s","*");
			}
			System.out.printf("%s","\n");
		}
	}
}
