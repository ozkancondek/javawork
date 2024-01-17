package oopInheritance;

public class SingleInheritance {
    public int count;
    public int price;
    public int output;

    void calculate() {
        output = count * price;

    }

    void yourBill() {
        System.out.println("You will pay " + output);
    }

    public SingleInheritance(int count, int price) {
        this.price = price;
        this.count = count;
    }

};

class SingleInheritanceChild extends SingleInheritance {
    public SingleInheritanceChild(int price, int count) {
        super(price, count);
    }

    public static void main(String[] args) {
        SingleInheritanceChild myObj = new SingleInheritanceChild(34, 4);
        myObj.yourBill();
    }
}