package ex01;

public class Ex04 { //�迭����
	public static void main(String[] args) {
		int []arr  = new int[5]; //�迭 ���� �ܰ� 5������ٴ� ��
		
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
//		arr[5]=1; <==������������ �迭�� 5���� �����ߴµ� 5�����ϸ� 6������
		
//		int []arr2 = new int[3];
//		arr2[0]=10;
//		arr2[1]=20;
//		arr2[2]=30;
		int[]arr2 = {10,20,30}; // <=== �ѹ��� �������ذ� ���� �ִ°Ͱ� ����
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}
