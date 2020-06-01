package Lesson13;

public class MainClass {
	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name="정연";
		child1.gender="여자";
		child1.age=20;
		child1.getInfo();//호출부
		//파라미터 데이터 타입 중요!
		child1.setInfo("혜원","여자",20);
		child1.getInfo();
//		child1.mySecrete();-->오류.
	}
	
		
}
