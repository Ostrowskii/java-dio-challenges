package challenges1;

import java.util.Scanner;


public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual dos exercícios da primeira seção você deseja ver?");
        System.out.println("0 - leave");
        System.out.println("1 - Back");
        System.out.println("2 - Age");
        System.out.println("3 - Square size");
        System.out.println("4 - Rectangle");
        System.out.println("5 - Age Diference");

        int answer = scanner.nextInt();
        scanner.nextLine();
        

        switch (answer) {
            case 2: 
                exerciseOneRun(scanner);
                break;
            case 3:
                exerciseTwoRun(scanner);
                break;
            case 4:
                exerciseThreeRun(scanner);
                break;
            default:
                System.out.println("no");
                throw new AssertionError();
        }


        scanner.close();

    }


    public static void exerciseOneRun(Scanner scanner){

        challenges1.Person user = new challenges1.Person();

        System.out.println("Nome?");
        String answerName = scanner.nextLine();
        user.setName(answerName);
        
        System.out.println("Idade?");
        int answerAge = scanner.nextInt();
        user.setAge(answerAge);

        System.out.println("Olá "+user.getName()+" você tem "+user.getAge()+" anos");

    }


    public static void exerciseTwoRun(Scanner scanner){

        challenges1.Square square = new challenges1.Square();

        System.out.println("Altura?");
        double height = scanner.nextDouble();
        square.setHeight(height);

        System.out.println("Tamanho do seu quadrado é .: "+square.getArea());

    }


    public static void exerciseThreeRun(Scanner scanner){

    challenges1.Rectangle rectangle = new challenges1.Rectangle();

    System.out.println("Altura?");
    double height = scanner.nextDouble();
    rectangle.setHeight(height);
    
    System.out.println("Largura?");
    double length = scanner.nextDouble();
    rectangle.setLength(length);

    System.out.println("Tamanho do seu quadrado é .: "+rectangle.getArea());

    }
}