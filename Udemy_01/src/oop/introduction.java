package oop;

public class introduction {
    public String name;
    public String color;

    public static void main(String[] args) {
        introduction myObject = new introduction(); // Created object here
        myObject.Breath(); // i can reach the method inside class

        // create object from class

        introduction animal1;
        animal1 = new introduction();
        animal1.color = "red";
        animal1.name = "felix";

        introduction animal2 = new introduction();

        animal2.name = "charles";
        animal2.color = "blue";

    }

    public void Breath() {
        System.out.println("iam breathing");
    }

}
