package Lesson12;

public class Lesson12MainClass {
	public static void main(String[] args) {
		
		Lesson12Grandeur mycar1 = new Lesson12Grandeur();
		mycar1.color="blue";
		mycar1.gear="auto";
		mycar1.price=100;//��Ʈ�� �׳� �ֱ�
		
		mycar1.run();
		mycar1.stop();
		mycar1.info();
	
	
		Lesson12Grandeur mycar2 = new Lesson12Grandeur();
		mycar2.color="yellow";
		mycar2.gear="auto";
		mycar2.price=500;//��Ʈ�� �׳� �ֱ�

		mycar2.run();
		mycar2.stop();
		mycar2.info();
		
		Lesson12Bicycle myBicycle=new Lesson12Bicycle();
		myBicycle.color="red";
		myBicycle.price=100;
		
		myBicycle.info();
		Lesson12Bicycle myBicycle2=new Lesson12Bicycle("red",100);
		myBicycle.info();
		
		myBicycle.color="yellow";//�̷��� ȣ���ص� ������ �Ȱ��� ���� ����.
		myBicycle.info();
	}
}
