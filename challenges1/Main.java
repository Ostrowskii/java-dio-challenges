package challenges1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual dos exercícios da primeira seção você deseja ver?");
        System.out.println("0 - leave");
        System.out.println("1 - Age");
        System.out.println("2 - Square size");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Age Diference");

        int answer = scanner.nextInt();
        scanner.nextLine();
        

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
                System.out.println("no");
                throw new AssertionError();
        }


        scanner.close();

    }
    

    //Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
    public static void exerciseOneRun(Scanner scanner){

        challenges1.Person user = new challenges1.Person();

        System.out.println("Nome?");
        String name = scanner.nextLine();
        //exception
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        user.setName(name);
        
        System.out.println("Idade?");
        int age;

        try{
            age = scanner.nextInt();
            if(age <= 0 || age> 150){
                throw new InvalidAgeException("Idade inválida. Deve estar entre 1 e 130");
            }
        }catch(InputMismatchException e){
            throw new InvalidAgeException("Entrada inválida. Digite um número inteiro");

        }
        
        user.setAge(age);
        System.out.println("Olá "+user.getName()+" você tem "+user.getAge()+" anos");

    }

    //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    public static void exerciseTwoRun(Scanner scanner){

        challenges1.Square square = new challenges1.Square();

        System.out.println("Altura?");
        double height;
        try {
            height = scanner.nextDouble();
            if(height<=0){
                throw new InvalidSizeException("tamanho não pode ser 0 nem negativo.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidSizeException("valor invalido, digite um numero valido, exemplo: 4; 5.65");
        }
        square.setHeight(height);

        System.out.println("Tamanho do seu quadrado é .: "+square.getArea());

    }

    //Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
    public static void exerciseThreeRun(Scanner scanner){

        challenges1.Rectangle rectangle = new challenges1.Rectangle();
        

        //altura
        System.out.println("Altura?");
        double height;
        try {
            height = scanner.nextDouble();
            if(height<=0){
                throw new InvalidSizeException("tamanho não pode ser 0 nem negativo.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidSizeException("valor invalido, digite um numero valido, exemplo: 4; 5.65");
        }
        rectangle.setHeight(height);
        
        
        //largura
        System.out.println("Largura?");
        double length;

            try{
                length = scanner.nextDouble();
                if(length<=0){
                    throw new InvalidSizeException("tamanho não pode ser 0 nem negativo.");
                }
            }catch(InputMismatchException e ){
                throw new InvalidSizeException("valor invalido, digite um numero valido, exemplo: 4; 5.65");
            }
        rectangle.setLength(length);

        
        //menssagem final
        System.out.println("Tamanho do seu quadrado é .: "+rectangle.getArea());
    }


    //Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
    public static void exerciseFourRun(Scanner scanner){
        Person ricardo = new Person();
        Person pedro = new Person();


        System.out.println("Qual a idade da primeira pessoa a ser comparada?");
        int firstAge;

        try {
            firstAge = scanner.nextInt();
            scanner.nextLine();
            if(firstAge<=0){
                throw new InvalidAgeException("idade não pode ser 0 nem negativa.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidAgeException("entrada invalida. digite um numero inteiro.");
        }

        ricardo.setAge(firstAge);




        
        System.out.println("Qual a idade da segunda pessoa a ser comparada?");
        int secondAge;

        try {
            secondAge = scanner.nextInt();
            scanner.nextLine();
            if(secondAge<=0){
                throw new InvalidAgeException("idade não pode ser 0 nem negativa.");
            }
        } catch (InputMismatchException e) {
            throw new InvalidAgeException("entrada invalida. digite um numero inteiro.");
        }
        pedro.setAge(secondAge);

        int ageDiff = AgeHelper.calculateAgeDiff(ricardo.getAge(), pedro.getAge());
        System.out.println("a diferença das idades "+ricardo.getAge()+" e "+pedro.getAge()+ " é "+ageDiff);

    }

}