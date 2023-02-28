/* 2. Write a Java program to illustrate dynamic method dispatch. */
package Lab8;

class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Q2_Polymorphism {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}