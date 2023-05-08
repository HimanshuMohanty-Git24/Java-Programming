package Basics;

import java.util.*;
import java.lang.*;

class A {
    static {
        System.out.println("1");
    }

    A() {
        System.out.println("2");
    }
}

class B extends A {
    static {
        System.out.println("3");
    }

    B() {
        System.out.println("4");
    }
}

class Bando {
    public static void main(String[] args) {
        new B();
    }
}
