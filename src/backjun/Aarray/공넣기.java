package backjun.Aarray;

import java.util.Scanner;

public class 공넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<m;i++){
            int s = sc.nextInt(), e = sc.nextInt(), num = sc.nextInt();
            for(int j=s-1; j<e;j++){
                arr[j] = num;
            }
        }
        sc.close();
        
        for (int i : arr)
            System.out.print(i+" ");

    }
}
