package ex02;

public class Ex01 { // ������ ����Ŭ������ �̸��� ������� ������ ���θ޼ҵ�ȿ����� �ν��Ͻ��� ����� Ŭ������ �����ڸ� �������� �Ѵ�

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Car car = new Car(); //<===���� �޼ҵ忡�� �ν��Ͻ��� ���� �ϴ¼��� �Ϲ�Ŭ���� �ȿ��ִ� �����ڰ� ȣ��� �����ڴ� �������� ����� �ִ�
		car.color = "red";
		car.speed= 1000;
		car.info();
		
		Car car2 = new Car();
		car2.color = "blue";
//		car2.speed = 10000;
		car2.info();
		
		Car car3 = new Car("yellow",9999);
		car3.info();
		car3.color="green���� ���ٲ�";
		car3.info();
	}
}

class Car { // <==Ŭ�����̸�
	
	public String color; // <==�������(�Ӽ�)
	public int speed = 0; //����Ʈ�� 0�̵�
	
	public Car() { // <==������ : �����ڴ� Ŭ�����̸��� ������ �޼ҵ带 ���� ��ȯ���̾��� �����Ҷ� �ʿ��� ����� �������
		System.out.println("�ڵ����� ����1");
	}

	public Car(String a,int b) {	//<==�Ű������� �����Ͽ� �ڵ��� ����
		System.out.println("�ڵ����� ����2");
		color=a;
		speed=b;
	}
	
	public void run() { // <==�޼���(���)
		System.out.println("run");
	}

	public void stop() { // <==�޼���(���)
		System.out.println("stop");
	}
	public void info() { //<==�����޼ҵ� (���)
		System.out.println(color);
		System.out.println(speed);
	}
}
