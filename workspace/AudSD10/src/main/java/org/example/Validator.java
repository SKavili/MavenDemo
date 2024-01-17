package org.example;

public class Validator {
    protected void validate(int age)throws Exception{
        try {
            if (age < 18) {
                throw new ArithmeticException("Not Valid Age");
            } else {
                System.out.println("vote confirmed");
            }
        }catch (Exception e){
            throw new ArithmeticException("Not Valid Age");
        }
    }
}
