package ex02;

public class Ex01 { // 실행할 메인클래스의 이름은 상관없다 하지만 메인메소드안에서의 인스턴스는 사용할 클래스로 생성자를 만들어줘야 한다

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car car = new Car(); //<===메인 메소드에서 인스턴스를 생성 하는순간 일반클래스 안에있는 생성자가 호출됨 생성자는 여러개를 만들수 있다
		car.color = "red";
		car.speed= 1000;
		car.info();
		
		Car car2 = new Car();
		car2.color = "blue";
//		car2.speed = 10000;
		car2.info();
		
		Car car3 = new Car("yellow",9999);
		car3.info();
		car3.color="green으로 색바꿈";
		car3.info();
	}
}

class Car { // <==클래스이름
	
	public String color; // <==멤버변수(속성)
	public int speed = 0; //디폴트가 0이됨
	
	public Car() { // <==생성자 : 생성자는 클래스이름과 동일한 메소드를 말함 반환형이없음 생성할때 필요한 기능을 넣으면됨
		System.out.println("자동차를 생성1");
	}

	public Car(String a,int b) {	//<==매개변수를 전달하여 코딩을 줄임
		System.out.println("자동차를 생성2");
		color=a;
		speed=b;
	}
	
	public void run() { // <==메서드(기능)
		System.out.println("run");
	}

	public void stop() { // <==메서드(기능)
		System.out.println("stop");
	}
	public void info() { //<==인포메소드 (기능)
		System.out.println(color);
		System.out.println(speed);
	}
}
