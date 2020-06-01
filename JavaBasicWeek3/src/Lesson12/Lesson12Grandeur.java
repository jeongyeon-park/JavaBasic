package Lesson12;
//package란? 폴더.클래스를 구분해서 관리할 수 있음
public class Lesson12Grandeur {
	//멤버변수 생성.
	public String color;
	public String gear;
	public int price;
	
	//생성자 생성.class이름과 동일하게.클래스 이름 타이핑+컨트롤 스페이스=자동완성
	public Lesson12Grandeur() {
		System.out.println("Grandeur Constructor");	
	}
	
	//기능=c언어 함수
	public void run() {
		System.out.println("---run()---");
	}
	public void stop() {
		System.out.println("---stop()---");
	}
	public void info() {
		System.out.println("--info()--");
		System.out.println("color : "+ color);
		System.out.println("color : "+ gear);
		System.out.println("color : "+ price);
	}
	
	
}
