package Lab9;

import java.util.Scanner;

class Q1_StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] studentData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");
            System.out.print("Height (in cm): ");
            studentData[i][0] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            studentData[i][1] = sc.nextDouble();
        }

        double maxHeight = studentData[0][0];
        double minHeight = studentData[0][0];
        int maxHIndex = 0;
        int minHIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (studentData[i][0] > maxHeight) {
                maxHeight = studentData[i][0];
                maxHIndex = i;
            }
            if (studentData[i][0] < minHeight) {
                minHeight = studentData[i][0];
                minHIndex = i;
            }
        }

        double maxWeight = studentData[0][1];
        double minWeight = studentData[0][1];
        int maxWIndex = 0;
        int minWIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (studentData[i][1] > maxWeight) {
                maxWeight = studentData[i][1];
                maxWIndex = i;
            }
            if (studentData[i][1] < minWeight) {
                minWeight = studentData[i][1];
                minWIndex = i;
            }
        }

        System.out.println("Student with highest height: Student " + (maxHIndex + 1));
        System.out.println("Student with lowest height: Student " + (minHIndex + 1));
        System.out.println("Student with highest weight: Student " + (maxWIndex + 1));
        System.out.println("Student with lowest weight: Student " + (minWIndex + 1));

        sc.close();
    }
}
