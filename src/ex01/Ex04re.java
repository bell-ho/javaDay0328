package ex01;

public class Ex04re {
	public static void main(String[] args) {
			//int형 배열 5개를 선언하여 값을 넣어라
		int[]arr = new int[5]; //new 가 빠지면 안됨
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//한번에 선언해보자
		int[]arr1 = {10,20,30,40,50};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
