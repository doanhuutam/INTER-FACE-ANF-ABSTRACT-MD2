package baitapthuchanh;


public abstract class Animal implements Edible {
    public abstract String makeSound();
}
class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "Tiger guuuuuu!";
    }

    @Override
    public String howtoeat() {
        return "thui no len";
    }
}
class Chicken extends Animal{
    @Override
    public String makeSound() {
        return "chicken cucucuc";
    }

    @Override
    public String howtoeat() {
        return "chicken quay no len";
    }
}

