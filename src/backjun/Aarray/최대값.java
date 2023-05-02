package backjun.Aarray;

import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        for(int i=0; i<9; i++)
            arr[i] = sc.nextInt();
        
        sc.close();

        int _max = 0, idx = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > _max){
                _max = arr[i];
                idx = i;
            }
        }

        System.out.println(_max);
        System.out.println(idx+1);

    }
}
