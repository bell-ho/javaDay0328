package ex03;

public class ChildClass {
	
	public String name;
	public int age;
	
	
	public void info() {
		System.out.println("===info호출됨===");
		System.out.println(name);
		System.out.println(age);
		System.out.println("===info호출끝===");
	}
	
	
	public ChildClass(String n, int a) {
		// TODO 자동 생성된 생성자 스텁
		name = n;
		age = a;
		System.out.println("차일드클래스 생성자");
	}
	private void my() {
		System.out.println("비밀메소드");
	}
}
