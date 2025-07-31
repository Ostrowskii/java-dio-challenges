package challengesB;

// 1. Usuário entra com um número e o programa gera a tabuada de 1 a 10.

// 2. Usuário informa altura e peso; o programa calcula o IMC e exibe a classificação:
//    - ≤ 18,5: Abaixo do peso
//    - 18,6 – 24,9: Peso ideal
//    - 25,0 – 29,9: Levemente acima do peso
//    - 30,0 – 34,9: Obesidade Grau I
//    - 35,0 – 39,9: Obesidade Grau II (Severa)
//    - ≥ 40,0: Obesidade Grau III (Mórbida)

// 3. Usuário informa dois números e escolhe par ou ímpar; o programa imprime os números correspondentes no intervalo, em ordem decrescente.

// 4. Usuário informa um número inicial. Depois, digita outros números até que um deles dividido pelo inicial dê resto diferente de 0. Números menores que o inicial são ignorados.

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.CalculatorHelper;
import utils.InputHelper;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual das atividades você deseja acessar?");
        System.out.println("0 - sair.");
        System.out.println("1 - Usuário entra com um número e o programa gera a tabuada de 1 a 10.");
        System.out.println("2 - Usuário informa altura e peso; o programa calcula o IMC e exibe a classificação.");
        System.out.println("3 - Usuário informa dois números e escolhe par ou ímpar; o programa imprime os números ");
        System.out.println("correspondentes no intervalo, em ordem decrescente.");
        System.out.println("4 - Usuário informa um número inicial. Depois, digita outros números até que um deles ");
        System.out
                .println("dividido pelo inicial dê resto diferente de 0. Números menores que o inicial são ignorados.");

        int answer = scanner.nextInt();
        scanner.nextLine();
        InputHelper.validateIfValueIsBetween(answer, 0, 4);

        switch (answer) {
            case 0:

                break;

            case 1:
                exerciseOneRun(scanner);
                break;

            case 2:
                exerciseTwoRun(scanner);
                break;
            case 3:
                exerciseThreeRun(scanner);
                break;

            case 4:
exerciseFourRun(scanner);
                break;

            default:
                break;
        }

    }

    private static void exerciseOneRun(Scanner scanner) {

        System.out.println("Numero?");
        double tableNumber;
        try {
            tableNumber = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Entrada inválida");
        }

        CalculatorHelper.showTableOf(tableNumber);
    }

    private static void exerciseTwoRun(Scanner scanner) {

        double height = InputHelper.validatePositiveDouble(scanner, "altura (height)");
        double weight = InputHelper.validatePositiveDouble(scanner, "peso (weight)");

        double imc = weight / (height * height);

        if (imc <= 18.5) {
            System.out.println("'Abaixo do peso', com o imc de " + imc);
        } else if (imc <= 24.9) {
            System.out.println("'Peso ideal', com o imc de " + imc);
        } else if (imc <= 29.9) {
            System.out.println("'Levemente acima do peso', com o imc de " + imc);
        } else if (imc <= 34.9) {
            System.out.println("'Obesidade Grau I', com o imc de " + imc);
        } else if (imc <= 39.9) {
            System.out.println("'Obesidade Grau II (Severa)', com o imc de " + imc);
        } else {
            System.out.println("'Obesidade Grau III (Mórbida)', com o imc de " + imc);
        }

    }

    private static void exerciseThreeRun(Scanner scanner){
        int numberOne = InputHelper.validateInt(scanner, "Number One?");
        int numberTwo = InputHelper.validateInt(scanner, "Number Two?");

        System.out.println("1 - Ímpar");
        System.out.println("2 - Par");
        int choice = InputHelper.validateInt(scanner, "Par ou ímpar?");
        InputHelper.validateIfValueIsBetween(choice, 1, 2);

        boolean wantsEven = choice == 2;

        int biggerNumber = Math.max(numberOne, numberTwo);
        int smallerNumber = Math.min(numberOne, numberTwo);

        if (wantsEven && biggerNumber % 2 != 0) biggerNumber--;
        if (!wantsEven && biggerNumber % 2 == 0) biggerNumber--;

        for (int i = biggerNumber; i >= smallerNumber; i -= 2) {
            System.out.println(i + (wantsEven ? " é par" : " é ímpar"));
        }
    }


    // 4. Usuário informa um número inicial. 
    //Depois, digita outros números até que um deles dividido pelo inicial dê resto diferente de 0. 
    //Números menores que o inicial são ignorados.

    private static void exerciseFourRun(Scanner scanner){
        int initialNumber = InputHelper.validateInt(scanner, "Initial Number");
        int numberToBeCompared;
        
        while (numberToBeCompared%initialNumber !=0) {
            
        }
        do{
            numberToBeCompared= InputHelper.validateInt(scanner, "digite um novo numero para verificar se ao dividir o resto é zero.");
            if(numberToBeCompared<initialNumber){
                System.out.println("try a number higher than "+initialNumber);
                break;
            }
            if(numberToBeCompared==0){
                System.out.println("you cannot use 0 in division");
                break;
            }
            

        }while(numberToBeCompared%initialNumber !=0)


    }

}
