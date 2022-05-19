package com.maktabsharif74.exceptiontutorial;

import java.util.Scanner;

public class ExceptionTutorialApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("1, 2");
                int number = scanner.nextInt();
                switch (number) {
                    case 1: {
                        a();
                        System.out.println("1");
                        loop = false;
                        break;
                    }
                    case 2: {
                        System.out.println("2");
                        loop = false;
                        break;
                    }
                    default: {
                        b();
                    }
                }
            } catch (BadNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("end");
    }

    static void b() {
        throw new BadNumberException("");
    }

    static int divide(int numberToDivide, int numberToDivideBy) {
        if (numberToDivideBy == 0) {
            throw new BadNumberException("badNumber: / by zero - 0");
        }
        return numberToDivide / numberToDivideBy;
    }

    static void a() {
    }
}

class BadNumberException extends RuntimeException {
    public BadNumberException(String message) {
        super(message);
    }
}
