package baithuchanhso2;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Cicrle[] cr =new Cicrle[3];
        cr[0]=new Cicrle(4.5,"con cho hang an cut",true);
        cr[1]=new Cicrle();
        cr[2]=new Cicrle(3.4,"hang di bang 4 chan",true);
        System.out.println("ham dc sap xep");
        for (Cicrle ahhih:cr) {
            System.out.println(ahhih);
        }
        Comparator htmoi=new CompaCircle();
        Arrays.sort(cr,htmoi);
        System.out.println("ham sau xep xep la");
        for (Cicrle ahhih:cr) {
            System.out.println(ahhih);
        }
    }
}

