package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {

    public static void main(String[] args) {
        System.out.println(divide(4, 2));
        System.out.println(divide(5, 1));
        System.out.println(divide(6, 0));
    }

    static int divide(int numberToDivide, int numberToDivideBy) {
        if (numberToDivideBy == 0) {
            throw new BadNumberException();
        }
        return numberToDivide / numberToDivideBy;
    }
}

class BadNumberException extends RuntimeException {

}
