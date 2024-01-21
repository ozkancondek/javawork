package Arrays;

public class Array_02 {
    public String name;
    public String category;
    public int price;

    public Array_02(String name, String category, int price) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    // and addiing also a method

    public String printMe() {
        return "Product name = " + name + " from price " + " in category " + category;
    }

}
