package java_algorithm.ClassStudy;

public class Rectangle_main {
    public static void main(String[] args){
        Rectangle r =  new Rectangle(2,2,8,7);
        Rectangle s =  new Rectangle(5,5,6,6);
        Rectangle t =  new Rectangle(1,1,10,10);

        r.show();

        System.out.println(s.square());
        if(t.contains(r)) System.out.println("t r 포함");
        if(t.contains(s)) System.out.println("t s 포함");

    }
    
}
