package baithuchanhso2;

public class Cicrle {
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

    @Override
    public String toString() {
        return "Cicrle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", felsse=" + felsse +
                '}';
    }
}
