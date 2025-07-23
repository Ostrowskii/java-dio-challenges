/* 
Escreva um código que receba o nome e o ano de nascimento de 
alguém e imprima na tela a seguinte 
mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

package challenges1;

public class Person {
    

    protected String name;
    protected int age; 

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
