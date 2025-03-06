package com.example.github.oo.ex7;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        Account account1 = new Account("Özkan","1234",3507);
        Account account2 = new Account("Cöndek","4545454",898);

        Bank myBank = new Bank();
        myBank.addAccount(account1);
        myBank.addAccount(account2);

        // Retrieve the list of accounts from the bank
        ArrayList<Account> accounts = myBank.getAccounts();

        // Loop through each account in the accounts list
        for (Account account: accounts) {
            // Print the account information for each account
            System.out.println(account.getAccountInfo());
        }
    }
}
