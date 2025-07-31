package utils;

import exceptions.InvalidAgeException;
import exceptions.InvalidSizeException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

    public InputHelper(){} // this is utils

    public static void validateNonEmptyString(String input, String inputName){
        if(input == null || input.trim().isEmpty()){
            throw new InputMismatchException(inputName+" não pode ser um campo vazio");
        }
    }

    public static double validatePositiveDouble(Scanner scanner, String inputName){
        try {
            System.out.println(inputName+"?");
            double answer = scanner.nextDouble();
            if( answer<= 0){
                throw new InvalidSizeException(inputName+" não pode ser 0 nem negativo.");
            }
            return answer;
            
        } catch (InputMismatchException e) {
            throw new InvalidSizeException(inputName+" com valor invalido, digite um numero valido, exemplo: 4; 5.65");
        }
    }

    public static int validateInt(Scanner scanner, String inputName){
        try {
            System.out.println(inputName);
            int answer = scanner.nextInt();
            scanner.nextLine();
            return answer;
            
        } catch (InputMismatchException e) {
            throw new InvalidSizeException(inputName+" com valor invalido, digite um numero valido, exemplo: 4; 5.65");
        }
    }

    public static void validateAge(int input){
        try {
            if(input<=0 || input>150){
                throw new InvalidAgeException("idade não pode ser 0 nem negativa.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidAgeException("entrada invalida. digite um numero inteiro.");
        }
    }

    public static void validateIfValueIsBetween(int value, int firstNumber, int secondNumber){
        try {
            if(firstNumber<secondNumber){
                if(value<firstNumber || firstNumber>secondNumber){
                    throw new IllegalArgumentException("number given should be between "+ firstNumber+" and "+ secondNumber);
                }
            } else{
                throw new IllegalArgumentException("programmer should know that firstNumber should be lower than second");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("it should be an integer. exemple: 3,6,87");
        }
        
    }
}
