package ex03;

public class ChildClass {
	
	public String name;
	public int age;
	
	
	public void info() {
		System.out.println("===infoȣ���===");
		System.out.println(name);
		System.out.println(age);
		System.out.println("===infoȣ�ⳡ===");
	}
	
	
	public ChildClass(String n, int a) {
		// TODO �ڵ� ������ ������ ����
		name = n;
		age = a;
		System.out.println("���ϵ�Ŭ���� ������");
	}
	private void my() {
		System.out.println("��и޼ҵ�");
	}
}
