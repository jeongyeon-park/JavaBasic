package Lesson12;

public class Lesson12Bicycle {
	
	public String color;
	public int price;
	
	public Lesson12Bicycle() {
		System.out.println("Bicycle Constructor~1");
	}//�⺻ ������=����Ʈ ������. ������ ���������� ��
	public Lesson12Bicycle(String c, int p) {
		System.out.println("Bicycle Constructor~2");
		color=c;
		price=p; //Ŭ���� ȣ�� �Ͽ� ��ü�� ������� �ϴ� ������ ������ �� ���� ��.
	}
	public void info() {
		System.out.println("--info()--");
		System.out.println("color : "+ color);
		System.out.println("price : "+ price);
		
	}
}
