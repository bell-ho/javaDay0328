package ex02;

public class MainClass {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Granduer gr = new Granduer(); //<==������ ȣ��
		gr.color="red";
		gr.speed=30;
		gr.price=300000;
		
		gr.info();
		
		Granduer gr2 = new Granduer();
		gr2.color="blue";
		gr2.speed=40;
		gr2.price=10000;
		
		gr2.info();
	}

}
