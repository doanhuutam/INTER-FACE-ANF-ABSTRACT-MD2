package baithuchanhso2;

import java.util.Arrays;

public class ComparableCR extends Cicrle implements Comparable<ComparableCR> {
    public ComparableCR() {
    }

    public ComparableCR(double radius, String color, boolean felsse) {
        super(radius, color, felsse);
    }

    public ComparableCR(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCR o) {
            if (this.getRadius() > o.getRadius()) return 1;
            else if (this.getRadius() < o.getRadius()) return -1;
            else return 1;
    }
}

class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCR[] circles = new ComparableCR[3];
        circles[0] = new ComparableCR(3.6);
        circles[1] = new ComparableCR();
        circles[2] = new ComparableCR(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCR circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCR circle : circles) {
            System.out.println(circle);
        }
    }
}

