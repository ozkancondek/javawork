//defining without static

public class BankAccount {
    private static String accountNumber;
    private static  double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
  public static void main(String args[]) {
 BankAccount account1 = new BankAccount("12345", 1000.0);
BankAccount account2 = new BankAccount("67890", 2000.0);

System.out.println(account1.balance);  // 2000.0
System.out.println(account2.balance);  // 2000.0
 
  }
}


//with static
public class BankAccount {
    private  String accountNumber;
    private   double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
  public static void main(String args[]) {
 BankAccount account1 = new BankAccount("12345", 1000.0);
BankAccount account2 = new BankAccount("67890", 2000.0);

System.out.println(account1.balance);  // 1000.0
System.out.println(account2.balance);  // 2000.0
 
  }
}

/*
Bu durumda ne olur?

    İlk nesne (account1) oluşturulduğunda, accountNumber ve balance static olduğundan, sınıf seviyesindeki değişkenler "12345" ve 1000.0 değerleriyle başlatılır.
    İkinci nesne (account2) oluşturulduğunda ise, aynı static değişkenler bu kez "67890" ve 2000.0 ile güncellenir.

Sonuç olarak:

    account1.balance ve account2.balance değerleri aynı olacaktır (2000.0), çünkü balance static olarak tanımlandığı için sınıf seviyesindedir ve her iki nesne de aynı balance değerini paylaşmaktadır.

Özetle:

    Static ile tanımlarsan: Tüm nesneler aynı accountNumber ve balance değerini paylaşır. Bir nesne bu değişkenleri değiştirdiğinde, diğer nesneler de aynı değişikliği görür.
    Static olmadan tanımlarsan: Her nesne kendi bağımsız accountNumber ve balance değerine sahip olur. Bir nesnede yapılan değişiklik diğer nesneleri etkilemez.*/
