package com.demo;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

         int data = 50;
         String name = null;
         try {
             System.out.println(data / 1);
             name.length();
         } catch (ArithmeticException e){
             System.out.println("Can't execute due to exception " + e.getMessage());
//             System.exit(3);
         }catch (NullPointerException ex){
             System.out.println(ex.getMessage());
         } finally {
             System.out.println("Execution of this block finished");
         }

         //compilation exception
         try{
             Class.forName("JSDFOWERUORTW");
         }catch (ClassNotFoundException ex){
             System.out.println("Class not found " + ex.getMessage());
         }

         CheckAgeException exception = new CheckAgeException();
         exception.checkAge(6);

        System.out.println(data);




    }
}
