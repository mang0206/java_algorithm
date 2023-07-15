package java_algorithm;
import java.util.Scanner;

public class game {
    static String word = "아버지";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int n = sc.nextInt();
        System.out.println();
        Player[] p = new Player[n];
        sc.nextLine();
        for(int i=0; i<n;i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = sc.nextLine();
            p[i] = new Player(name);
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        
        int idx = 0;
        while(true){
            System.out.print(p[idx].getName() + ">>");
            String tmp_word = sc.nextLine();

            int lastidx = word.length();
            if(word.charAt(lastidx-1) == tmp_word.charAt(0)){
                word = tmp_word;
                idx++;
                if(idx == n)
                    idx = 0;
            } else {
                System.out.println(p[idx].getName() + "이 졌습니다.");
                sc.close();
                break;
            }
        }
    }
}
