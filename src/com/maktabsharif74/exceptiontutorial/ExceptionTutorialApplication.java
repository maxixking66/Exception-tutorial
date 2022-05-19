package com.maktabsharif74.exceptiontutorial;

public class ExceptionTutorialApplication {
    public static void main(String[] args) {

        try {
            a();
        } catch (ChildException e) {
            System.out.println("child");
        } catch (BrotherException e) {
            System.out.println("brother");
        } catch (ParentException e) {
            System.out.println("parent");
        }

    }

    static void a() throws ParentException,
            ChildException, GrandSonException {
        throw new BrotherException();
    }

}

class ParentException extends Exception {

}


class ChildException extends ParentException {

}

class BrotherException extends ParentException {

}

class GrandSonException extends ChildException {

}
