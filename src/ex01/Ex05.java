package ex01;

import java.util.Scanner;

public class Ex05 {
	//�迭�� �̿��� �л����
	public static void main(String[] args) {
		String []name = {"����ȣ","����ȣ2","����ȣ3","����ȣ4"};
		int []score = new int[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ���",name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ���",name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ���",name[3]);
		score[3] = sc.nextInt();
		
		System.out.printf("%s �������� \t%.2f\n", name[0],(double)score[0]);
//		System.out.printf("%s �������� %f\n", name[1],(int)score[1]);
//		System.out.printf("%s �������� %f\n", name[2],(int)score[2]);
//		System.out.printf("%s �������� %f\n", name[3],(int)score[3]);
		sc.close();
	}
}
