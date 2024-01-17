package oopInheritance;

public class Reptiles extends Animals {

    public Reptiles() {
        super("reptiles");

    }

    public static void main(String[] args) {
        Reptiles reptileObject = new Reptiles();
        System.out.println(reptileObject.type);
    }

}
