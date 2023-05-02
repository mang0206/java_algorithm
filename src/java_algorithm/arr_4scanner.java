package java_algorithm;
import java.util.Scanner;

public class arr_4scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = sc.next();
		sc.close();
		char c = s.charAt(0);
		char a = 'a';
		int n = (int)c - (int)a;
		for(int i = 0; i <= n; i++) {
			for(int j= 0; j<= n -i; j++) {
				int tmp_c = (int)a + j;
				System.out.print((char)tmp_c);
			}
			System.out.println();
		}
		
	}

}
