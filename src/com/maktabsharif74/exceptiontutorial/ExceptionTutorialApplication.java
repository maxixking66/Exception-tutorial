package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {

    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
        thirdMethod();
    }

    static void secondMethod() {
        throw new RuntimeException();
    }

    static void thirdMethod() {
        throw new RuntimeException();
    }

}
