/*
 * Write a program to use a class Account with the following specifications:
 */
package Lab7;

import java.util.Scanner;

class Account {
    int acno;
    float balance;

    Account() {
        acno = 0;
        balance = 0;
    }

    Account(int a, int b) {
        acno = a;
        balance = b;
    }

    void withdraw(int w) {
        balance = balance - w;
    }

    void deposit(int d) {
        balance = balance + d;
    }

}

class Calculate extends Account {
    int r, t;
    float si, amt;

    Calculate() {
        r = 0;
        t = 0;
        si = 0;
        amt = 0;
    }

    void accept(int x, int y) {
        r = x;
        t = y;
        amt = 0;
    }

    void compute() {
        si = (balance * r * t) / 100;
        amt = amt + si;
    }

    void Display() {
        System.out.println("Account number:" + acno);
        System.out.println("Account Balance:" + balance);
        System.out.println("Account Interest:" + si);
        System.out.println("Account ammount:" + amt);
    }
}

class Q4_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        int acno = sc.nextInt();
        System.out.println("Enter the account balance:");
        int balance = sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r = sc.nextInt();
        System.out.println("Enter the time:");
        int t = sc.nextInt();
        Calculate c = new Calculate();
        c.acno = acno;
        c.balance = balance;
        c.accept(r, t);
        c.compute();
        c.Display();
        System.out.println("Enter the amount you want to withdraw:");
        int w = sc.nextInt();
        c.withdraw(w);
        c.Display();
        System.out.println("Enter the amount you want to Deposit:");
        int d = sc.nextInt();
        c.deposit(d);
        c.Display();
        sc.close();
    }
}
