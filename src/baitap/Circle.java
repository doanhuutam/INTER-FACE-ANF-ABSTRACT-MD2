package baitap;

 class Cicrle implements Resizeable{
    double radius;
    String color;
    boolean felsse;

    public Cicrle() {
    }

    public Cicrle(double radius, String color, boolean felsse) {
        this.radius = radius;
        this.color = color;
        this.felsse = felsse;
    }

    public Cicrle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFelsse() {
        return felsse;
    }

    public void setFelsse(boolean felsse) {
        this.felsse = felsse;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cicrle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", felsse=" + felsse +
                '}';
    }

     @Override
     public void resize(double percent) {
         setRadius(radius*percent);
     }
 }
 class Test {
    public static void main(String[] args) {
        Cicrle[] htron = new Cicrle[3];
        htron[0] = new Cicrle(1);
        htron[1] = new Cicrle(2);
        htron[2] = new Cicrle(3);
        for (Cicrle ahihi : htron) {
            System.out.println("dien tich ban dau " + ahihi.getArea());
            ahihi.resize(Math.random() * 10);
            System.out.println("dien tich moi" + ahihi.getArea());
        }
    }
}
