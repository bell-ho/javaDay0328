package ex02;
//TV��� ��ü�� ����� �����ڵ� �Ẹ�� �����ڿ� �Ű��������� ����� �Ű����� �ֱ� �����
public class ConstructorTest {
	public static void main(String[] args) {
		SamsungTv stv = new SamsungTv();
		stv.color = "red";
		stv.price = 10000;
		
		stv.info();
		stv.start();
		stv.stop();
		
		LgTv ltv = new LgTv("blue", 5000);
		ltv.info();
		ltv.start();
		ltv.stop();
		
		AppleTv atv = new AppleTv("yellow", 333);
		atv.info();
	}
}
class SamsungTv{
	public String color;
	public int price;
	
	public SamsungTv() {
		System.out.println("�ＺƼ�� ���� �鿴���ϴ�");
	}
	
	public void info() {
		System.out.println("���� :"+color);
		System.out.println("���� :"+price);
	}
	public void start() {
		System.out.println("tv�� �մϴ�");
	}
	public void stop() {
		System.out.println("tv�� ���ϴ�");
	}
	
}
class LgTv{
	public String color;
	public int price;
	
	public LgTv(String c,int p) { //<==�Ű������� Ÿ�� ������ ����c�� �ִ��� �������color�� ����� 
							 	  //�׸��� info�� Ÿ��ͼ� print �� �ѷ��� �̰����� ������ ������ ����
 		color = c;
		price = p;
		System.out.println("LgTV�� �鿴���ϴ�");
	}
	public void info() {
		System.out.println("���� :"+color);
		System.out.println("���� :"+price);
	}
	public void start() {
		System.out.println("tv�� �մϴ�");
	}
	public void stop() {
		System.out.println("tv�� ���ϴ�");
	}
}

class AppleTv{
	
	public String color;
	public int price;
	
	public AppleTv(String c,int p){
		color = c;
		price = p;
		System.out.println("����Ƽ�� ����");
	}
	public void info() {
		System.out.println(color);
		System.out.println(price);
	}
}