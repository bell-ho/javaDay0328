package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x+=10);
		System.out.println(x-=10);
		System.out.println(x*=10);
		System.out.println(x/=10);
		System.out.println(x%=10);
		
		int y=20;
		System.out.println(x>y); //��������
		System.out.println(x<y);
		System.out.println(x==y); //�������� ���Ҷ� ==���
		System.out.println(x!=y);
		
		
//		int x = 1; ������������ �ߺ��� ���ú�����
		x= 1;
		
//		<<����������>>
		System.out.println(++x); //���⼭ 2������ ����������
		
		System.out.println(x++); //���⼭ 2������ ���������� �� �״��x�� �������, 
//									�޸𸮻󿡼��� ����� ������ x�� 2���ǹǷ� �̰͵� x�� ��������
		
		System.out.println(x); //���߿� ��� �Ǳ⶧���� ���⼭�� 3�� ����
	}
}
