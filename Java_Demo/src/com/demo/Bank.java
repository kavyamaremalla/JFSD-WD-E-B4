package com.demo;
/* Run time Polymorphism */
public class Bank {
    float getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    float getRateOfInterest(){
        return 8.4f;
    }
}

class ICICI extends Bank{

    @Override
    float getRateOfInterest(){
        return 8.9f;
    }
}

class AXIS extends Bank{

    @Override
    float getRateOfInterest(){
        return 9.7f;
    }
}

class TestRunTimePolymorphism{
    public static void main(String[] args) {
        Bank bank = new Bank();

        Bank sbiBank = new SBI();

        Bank iciciBank = new ICICI();

//        SBI sbi = new SBI();
//        System.out.println(sbi.onlyChildMethod());

        Bank axisBank = new AXIS();

        System.out.println(bank.getRateOfInterest());

        System.out.println(sbiBank.getRateOfInterest());
        System.out.println(iciciBank.getRateOfInterest());
        System.out.println(axisBank.getRateOfInterest());
    }
}