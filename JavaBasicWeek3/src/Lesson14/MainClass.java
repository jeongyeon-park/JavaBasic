package Lesson14;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1=new ObjectClass();
		ObjectClass obj2=new ObjectClass();
		ObjectClass obj3=new ObjectClass();
		
		System.out.println("obj1: "+ obj1);
		System.out.println("obj2: "+ obj2);
		System.out.println("obj3: "+ obj3);
		//똑같은 객체를 생성했지만 다 다른곳에 있다. 
		
		obj1.getInfo();
		//obj1=null; //레퍼런스 끊김.->GC가 메모리 회수
		//obj1.getInfo();//널포인트 익셉션.
		
		obj2.getInfo();
	}
}
