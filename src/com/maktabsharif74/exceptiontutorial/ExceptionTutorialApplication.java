package com.maktabsharif74.exceptiontutorial;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTutorialApplication {
    public static void main(String[] args) {

        try {
            a();
        } catch (SQLException | IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("exception");
        }

    }

    static void a() throws SQLException, IOException, InterruptedException {

    }

}
