package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSecondNum {
	public static void main(String[] args) {
		int num[]=new int [3];
		Scanner scanner = new Scanner(System.in);
		num[0]=scanner.nextInt();
		num[1]=scanner.nextInt();
		num[2]=scanner.nextInt();
		
		Arrays.sort(num);//���ڸ� ������������ �������ִ� �޼ҵ� 
        System.out.println(num[1]);
			
	}
}
