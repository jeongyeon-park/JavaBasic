package Lesson14;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1=new ObjectClass();
		ObjectClass obj2=new ObjectClass();
		ObjectClass obj3=new ObjectClass();
		
		System.out.println("obj1: "+ obj1);
		System.out.println("obj2: "+ obj2);
		System.out.println("obj3: "+ obj3);
		//�Ȱ��� ��ü�� ���������� �� �ٸ����� �ִ�. 
		
		obj1.getInfo();
		//obj1=null; //���۷��� ����.->GC�� �޸� ȸ��
		//obj1.getInfo();//������Ʈ �ͼ���.
		
		obj2.getInfo();
	}
}
