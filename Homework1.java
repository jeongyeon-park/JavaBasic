package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요: ");
		Scanner inputNum=new Scanner(System.in);
		int score=inputNum.nextInt();
		
		if(score>=90 && score<=100)
			System.out.println("A");
		else if(score>=80 && score<=89)
			System.out.println("B");
		else if(score>=70 && score<=79)
			System.out.println("C");
		else if(score>=60 && score<=69)
			System.out.println("D");
		else
			System.out.println("F");
		inputNum.close();
	}	
}
