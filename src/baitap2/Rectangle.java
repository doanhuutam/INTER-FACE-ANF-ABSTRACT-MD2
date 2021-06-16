package baitap2;

public class Rectangle implements Colorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void howtoColor() {
        System.out.println("du ca 4 mau");
    }
}
class Test{
    public static void main(String[] args) {
        Rectangle[]hcn=new Rectangle[3];
        hcn[0]=new Rectangle(100);
        hcn[1]=new Rectangle();
        hcn[2]=new Rectangle(21,2);
        for (Rectangle ahihi:hcn
             ) {
            System.out.println("dien tich hcn"+ahihi.getArea());
            ahihi.howtoColor();
        }
    }
}
