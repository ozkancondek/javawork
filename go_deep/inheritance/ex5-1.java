public class Animal {
    // Alan
    private String name;

    // Yapıcı
    public Animal(String name) {
        this.name = name;
    }

    // Yöntem
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}




public class Dog extends Animal {
    // Yapıcı
    public Dog(String name) {
        // Üst sınıfın yapıcısını çağır
        super(name);
    }

    // Yöntem
    @Override
    public void speak() {
        // Üst sınıfın speak yöntemini çağır
        super.speak(); // Bu, "makes a sound." kısmını çağırır.
        System.out.println("Woof! Woof!");
    }
}




public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.speak();
    }
}
