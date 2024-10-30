package com.demo;

public class PaymentException extends Exception{

    public PaymentException(String message){
        super(message);
    }
}

class PaymentService {

    public void processPayment(double amount) throws PaymentException{
        if(amount < 0 ){
            throw new PaymentException("Invalid amount, please check : " + amount);
        }else{
            System.out.println("Payment Processed");
        }
    }
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        try {
            paymentService.processPayment(-100);
        } catch (PaymentException e) {
//            System.out.println("Hi");
            System.out.println(e.getMessage());
        }
    }
}