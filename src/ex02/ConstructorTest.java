package ex02;
//TV라는 객체를 만들고 생성자도 써보자 생성자에 매개변수없기 만들기 매개변수 있기 만들기
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
		System.out.println("삼성티비를 집에 들였습니다");
	}
	
	public void info() {
		System.out.println("색깔 :"+color);
		System.out.println("가격 :"+price);
	}
	public void start() {
		System.out.println("tv를 켭니다");
	}
	public void stop() {
		System.out.println("tv를 끕니다");
	}
	
}
class LgTv{
	public String color;
	public int price;
	
	public LgTv(String c,int p) { //<==매개변수를 타고 들어오고 변수c에 있던게 멤버변수color로 담겨짐 
							 	  //그리고 info를 타고와서 print 로 뿌려짐 이과정이 없으면 빈값으로 나옴
 		color = c;
		price = p;
		System.out.println("LgTV를 들였습니다");
	}
	public void info() {
		System.out.println("색깔 :"+color);
		System.out.println("가격 :"+price);
	}
	public void start() {
		System.out.println("tv를 켭니다");
	}
	public void stop() {
		System.out.println("tv를 끕니다");
	}
}

class AppleTv{
	
	public String color;
	public int price;
	
	public AppleTv(String c,int p){
		color = c;
		price = p;
		System.out.println("애플티비를 생성");
	}
	public void info() {
		System.out.println(color);
		System.out.println(price);
	}
}