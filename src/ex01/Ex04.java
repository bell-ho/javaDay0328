package ex01;

public class Ex04 { //배열공부
	public static void main(String[] args) {
		int []arr  = new int[5]; //배열 선언 단계 5개만든다는 뜻
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		arr[5]=1; <==오류나는이유 배열은 5개를 선언했는데 5까지하면 6개가됨
		
//		int []arr2 = new int[3];
//		arr2[0]=10;
//		arr2[1]=20;
//		arr2[2]=30;
		int[]arr2 = {10,20,30}; // <=== 한번에 선언해준것 위에 있는것과 같음
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}
