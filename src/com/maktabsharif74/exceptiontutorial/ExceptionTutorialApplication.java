package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {

    public static void main(String[] args) {
        try {
//            code
            System.out.println(divide(5, 0));
        } catch (BadNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end!!!");
    }

    static int divide(int numberToDivide, int numberToDivideBy) {
        if (numberToDivideBy == 0) {
            throw new BadNumberException("badNumber: / by zero - 0");
        }
        return numberToDivide / numberToDivideBy;
    }
}

class BadNumberException extends RuntimeException {
    public BadNumberException(String message) {
        super(message);
    }
}
