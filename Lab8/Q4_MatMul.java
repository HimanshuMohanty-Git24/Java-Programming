/* 4. Write a program to demonstrate the multiplication of two matrices. */
package Lab8;

import java.util.Scanner;

class Matrix {
    int a[][];
    int r, c;

    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        a = new int[r][c];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix multiply(Matrix m) {
        Matrix m1 = new Matrix(r, m.c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m.c; j++) {
                m1.a[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    m1.a[i][j] += a[i][k] * m.a[k][j];
                }
            }
        }
        return m1;
    }
}

class Q4_MatMul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        Matrix m1 = new Matrix(r1, c1);
        m1.input();
        System.out.println("Enter the number of rows and columns of the second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        Matrix m2 = new Matrix(r2, c2);
        m2.input();
        if (c1 != r2) {
            System.out.println("The matrices cannot be multiplied.");
        } else {
            Matrix m3 = m1.multiply(m2);
            m3.display();
        }
    }
}