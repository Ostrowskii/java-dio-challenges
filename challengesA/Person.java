/* 
Escreva um código que receba o nome e o ano de nascimento de 
alguém e imprima na tela a seguinte 
mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

package challengesA;

public class Person {
    

    private String name;
    private int age; 

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }


    

}
