package Lesson13;

public class ChildClass {
	//가장 먼저 찾는곳. 메인 메소드
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("--ChlidClass constructor--");
	}
	
	public void getInfo() {//선언부
		//정의부
		System.out.println("--getInfo() START--");
		System.out.println("name : "+ name);
		System.out.println("gender : "+ gender);
		System.out.println("age : "+ age);
	}
	
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo() START--");
		
		name=n;
		gender=g;
		age=a;
	}
	
	private void mySecrete() {
		System.out.println("--비밀이야--");
	}
	
}
