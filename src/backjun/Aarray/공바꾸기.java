package backjun.Aarray;

import java.util.Scanner;

public class 공바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int arr[] = new int[n];
        for(int i =0; i<arr.length; i++)
            arr[i]= i+1;
        
        int tmp;
        for(int i=0; i<m;i++){
            int c= sc.nextInt() -1, g=sc.nextInt() - 1;
            tmp = arr[c];
            arr[c] = arr[g];
            arr[g] = tmp;
        }
        for(int i:arr)
            System.out.print(i+" ");
        sc.close();
    }
}
