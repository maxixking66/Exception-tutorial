package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {
    public static void main(String[] args) {

        try {
            a();
        } catch (ChildException e) {
            System.out.println(e.getClass().getSimpleName());
        }

    }

    static void a() throws ParentException,
            ChildException, GrandSonException {
        throw new GrandSonException();
    }

}

class ParentException extends RuntimeException {

}


class ChildException extends ParentException {

}

class BrotherException extends ParentException {

}

class GrandSonException extends ChildException {

}
