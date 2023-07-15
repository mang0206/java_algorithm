package java_algorithm.ClassStudy;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void show(){
        System.out.println("(" + this.x + "," + this.y + ")에서 크기가 " + this.width + "X" + this.height + "인 사각형");
    }

    public int square(){
        return this.width * this.height;
    }

    public boolean contains(Rectangle r) {
        if(this.x < r.x & this.x + this.width > r.x + r.width & this.y < r.y & this.y + this.height > r.y + r.height)
            return true;
        else
            return false;
    }
}
