package ex01;

import java.util.Scanner;

public class Ex05re {
	public static void main(String[] args) {
		System.out.println("�л������ý���");
		Scanner sc = new Scanner(System.in);
		
//		String []name = new String[5]; 
//		name[0]="����ȣ";
//		name[1]="����ȣ";
//		name[2]="����ȣ";
//		name[3]="����ȣ";
//		name[4]="����ȣ";
		 
		String []name= {"����ȣ","����1","����2","����3","����4"};
		
		System.out.printf("%s �� �������Է��ϼ���",name[0]);
		int a = sc.nextInt();
		System.out.printf("%s �� �������Է��ϼ���",name[1]);
		int b = sc.nextInt();
		System.out.printf("%s �� �������Է��ϼ���",name[2]);
		int c = sc.nextInt();
		System.out.printf("%s �� �������Է��ϼ���",name[3]);
		int d = sc.nextInt();
		System.out.printf("%s �� �������Է��ϼ���",name[4]);
		int e = sc.nextInt();
		
		System.out.printf("%s�� ������"+a+"�Դϴ�",name[0]);
		System.out.println();
		System.out.printf("%s�� ������"+b+"�Դϴ�",name[1]);
		System.out.println();
		System.out.printf("%s�� ������"+c+"�Դϴ�",name[2]);
		System.out.println();
		System.out.printf("%s�� ������"+d+"�Դϴ�",name[3]);
		System.out.println();
		System.out.printf("%s�� ������"+e+"�Դϴ�",name[4]);
	}
}
