package Lesson12;

public class Lesson12Bicycle {
	
	public String color;
	public int price;
	
	public Lesson12Bicycle() {
		System.out.println("Bicycle Constructor~1");
	}//기본 생성자=디폴트 생성자. 생성자 여러개여도 됨
	public Lesson12Bicycle(String c, int p) {
		System.out.println("Bicycle Constructor~2");
		color=c;
		price=p; //클래스 호출 하여 객체를 만드려고 하는 곳에서 생성할 때 값을 줌.
	}
	public void info() {
		System.out.println("--info()--");
		System.out.println("color : "+ color);
		System.out.println("price : "+ price);
		
	}
}
