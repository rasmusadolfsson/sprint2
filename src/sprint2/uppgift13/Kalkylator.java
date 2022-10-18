package sprint2.uppgift13;

import java.util.Scanner;

public class Kalkylator {

    protected boolean isTest = false;
    protected String input;

    public void setIsTest(boolean isTest, String input){
        this.isTest = isTest;
        this.input = input;
    }

    public boolean isValid(String input) {
        boolean validChar = false;
        boolean validNum = false;
        int charCounter = 0;
        int minusCounter = 0;
        int operatorLocation = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '*' || input.charAt(i) == '/'){
                charCounter++;
            }
            if (input.charAt(i) == '-'){
                minusCounter++;
            }
        }
        validChar = charCounter == 1 && minusCounter <= 2 || charCounter == 0 && minusCounter <= 3;

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) =='*' || input.charAt(i) == '/'){
                operatorLocation = i;
            }
        }
        try{
            num1 = Integer.parseInt(input.trim().substring(0, operatorLocation).trim());
            num2 = Integer.parseInt(input.trim().substring(operatorLocation+1, input.length()).trim());
            validNum = true;
        }catch (NumberFormatException e){
        }

        return validChar && validNum;
    }

    public int Calculate(String input){
        int num1 = 0;
        int num2 = 0;
        char operator = '+';
        int operatorLocation = 0;

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) =='*' || input.charAt(i) == '/'){
                operatorLocation = i;
                operator = input.trim().charAt(i);
            }
        }
            num1 = Integer.parseInt(input.trim().substring(0, operatorLocation).trim());
            num2 = Integer.parseInt(input.trim().substring(operatorLocation+1, input.length()).trim());


        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }
}
