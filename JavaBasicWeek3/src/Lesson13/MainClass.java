package Lesson13;

public class MainClass {
	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name="����";
		child1.gender="����";
		child1.age=20;
		child1.getInfo();//ȣ���
		//�Ķ���� ������ Ÿ�� �߿�!
		child1.setInfo("����","����",20);
		child1.getInfo();
//		child1.mySecrete();-->����.
	}
	
		
}
