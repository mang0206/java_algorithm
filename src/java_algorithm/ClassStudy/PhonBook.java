package java_algorithm.ClassStudy;

import java.util.Scanner;

public class PhonBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = sc.nextInt();
        Phone[] phones = new Phone[n];
        sc.nextLine();
        for(int i=0; i<n;i++){
            System.out.print("이름과 전화번호(빈 칸없이 입력) >>");
            String[] tmp = sc.nextLine().split(" ");
            phones[i] = new Phone(tmp[0], tmp[1]);
        }
        System.out.println("저장되었습니다...");

        String search = "";
        while(search != "그만"){
            System.out.print("검색할 이름>>");
            search = sc.nextLine();

            boolean flag = false;
            for(int i=0;i<n;i++){
                if(search.equals(phones[i].getName())) {
                    System.out.println(phones[i].getName() + "의 번호 " + phones[i].getTel());
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println(search + "가 없습니다.");
        }
        sc.close();
    }    
}
