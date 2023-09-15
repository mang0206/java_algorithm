package backjun_dabi.chapter02;
import java.util.Scanner;

public class 가르침 {
    static int n,k;
    static boolean[] visited;
    static String[] word;
    static int cnt;
    static int check_cnt(){
        int tmp_cnt = 0;
        for(String s: word){
            boolean flag = true;
            for(int i=0; i<s.length(); i++){
                if(!visited[s.charAt(i) - 'a']){
                    flag = false;
                    break;
                }
            }
            if(flag)
                tmp_cnt++;
        }
        return tmp_cnt;
    }
    static void dfs(int idx, int deph){
        if(deph == 0){
            cnt = Math.max(cnt, check_cnt());
            return;
        }

        for(int i = idx; i<26; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(idx+1, deph+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); k = sc.nextInt() - 5;
        word = new String[n];

        for(int i=0; i<n;i++)
            word[i] = sc.next().replace("a", "").replace("t", "").replace("n", "").replace("c", "").replace("i", "");
        sc.close();

        visited = new boolean[26];
        visited['a'-'a'] = true;
        visited['n'-'a'] = true;
        visited['t'-'a'] = true;
        visited['c'-'a'] = true;
        visited['i'-'a'] = true;

        if(k<=0)
            System.out.println(0);
        else if(k==26)
            System.out.println(n);
        else{
            cnt = 0;
            dfs(1,0);
            System.out.println(cnt);
        }
    }
    
}
