package challengesA;

import java.util.InputMismatchException;

public class InputHelper {

    public InputHelper(){} // this is utils

    public static void validadeNonEmptyString(String input, String inputName){
        if(input == null || input.trim().isEmpty()){
            throw new InputMismatchException(inputName+" não pode ser um campo vazio");
        }
    }

    public static void validadePositiveNumber(double input, String inputName){
        try {
            if( input<= 0){//input == null || 
                throw new InvalidSizeException(inputName+" não pode ser 0 nem negativo.");
            }
            
        } catch (InputMismatchException e) {
            throw new InvalidSizeException(inputName+" com valor invalido, digite um numero valido, exemplo: 4; 5.65");
        }
    }

    public static void validadeAge(int input){
        try {
            if(input<=0 || input>150){
                throw new InvalidAgeException("idade não pode ser 0 nem negativa.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidAgeException("entrada invalida. digite um numero inteiro.");
        }
    }
}
