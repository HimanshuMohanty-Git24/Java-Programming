package Lab9;

import java.util.Scanner;

class Q2_BankDeposite {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[10];
        String name[] = new String[10];
        int bal[] = new int[10];
        int i, j, temp, temp1, id1, bal1;
        String name1;
        for (i = 0; i < 10; i++) {
            System.out.print("Enter ID: ");
            id[i] = sc.nextInt();
            System.out.print("Enter Name: ");
            name[i] = sc.next();
            System.out.print("Enter Balance: ");
            bal[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (bal[i] > bal[j]) {
                    temp = bal[i];
                    bal[i] = bal[j];
                    bal[j] = temp;
                    temp1 = id[i];
                    id[i] = id[j];
                    id[j] = temp1;
                    name1 = name[i];
                    name[i] = name[j];
                    name[j] = name1;
                }
            }
        }
        System.out.println("ID\tName\t\tBalance");
        for (i = 0; i < 10; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t\t" + bal[i]);
        }
        System.out.print("Enter ID of customer to be searched: ");
        id1 = sc.nextInt();
        for (i = 0; i < 10; i++) {
            if (id1 == id[i]) {
                System.out.println("ID\tName\t\tBalance");
                System.out.println(id[i] + "\t" + name[i] + "\t\t" + bal[i]);
                System.out.print("Enter amount to be withdrawn: ");
                bal1 = sc.nextInt();
                bal[i] = bal[i] - bal1;
                System.out.println("ID\tName\t\tBalance");
                System.out.println(id[i] + "\t" + name[i] + "\t\t" + bal[i]);
            }
        }
    }

}
