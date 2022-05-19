package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {

    public static void main(String[] args) {
        A();
    }

    static void A() {
        B();
    }

    static void B() {
        C();
        D();
    }

    static void C() {
    }

    static void D() {
        throw new RuntimeException();
    }

}
