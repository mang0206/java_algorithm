package java_algorithm;
import java.util.Scanner;

public class arr_4scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
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
