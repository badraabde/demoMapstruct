package com.exampleMapstruct.demoMapstruct.model;

public class MyTest {
    public static void main(String[] args) {
        try {
            int x= 2/0;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong.");
        } catch (Exception ee ) {
        System.out.println("Something went wrong.");
    }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
