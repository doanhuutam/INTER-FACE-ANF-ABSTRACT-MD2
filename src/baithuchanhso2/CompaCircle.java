package baithuchanhso2;

import java.util.Comparator;

public class CompaCircle implements Comparator<Cicrle> {


    @Override
    public int compare(Cicrle o1, Cicrle o2) {
        if (o1.getRadius()>o2.getRadius())
            return 1;
        else if (o1.getRadius()<o2.getRadius())
            return -1;
        else
            return 0;
    }
}

