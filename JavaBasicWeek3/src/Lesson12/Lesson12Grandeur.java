package Lesson12;
//package��? ����.Ŭ������ �����ؼ� ������ �� ����
public class Lesson12Grandeur {
	//������� ����.
	public String color;
	public String gear;
	public int price;
	
	//������ ����.class�̸��� �����ϰ�.Ŭ���� �̸� Ÿ����+��Ʈ�� �����̽�=�ڵ��ϼ�
	public Lesson12Grandeur() {
		System.out.println("Grandeur Constructor");	
	}
	
	//���=c��� �Լ�
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
