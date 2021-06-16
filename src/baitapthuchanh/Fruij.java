package baitapthuchanh;

public abstract class Fruij implements Edible {

}
class App extends Fruij {
    @Override
    public String howtoeat() {
        return "qua tao co the lam gi do";
    }
}
class Oran extends Fruij {
    @Override
    public String howtoeat() {
        return "mong phet";
    }
}
class Hoaqua {
    public static void main(String[] args) {
        Fruij[] hoaqua = new Fruij[2];
        hoaqua[0]=new App();
        hoaqua[1]=new Oran();
        for (Fruij ahii:hoaqua) {
            System.out.println(ahii.howtoeat());
            
        }
    }
}

