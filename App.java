/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package criandoVariaveis;

public class App {
 
    public static void main(String[] args) {
        
        /*Podemos criar a variável e só depois atribuir valor
        ex.: int idade; 
             idade = 33
          ou criar a variavel ja com atributo como a seguir.
        */
        int idade = 33; //inteiro
        float pi = 3.14159f; //real no portugol é mais preciso que double 
        double grau = 25.5d; //real mais simples menos preciso
        char sexo = 'M'; // armazena apenas um caracere ou letra
        byte pontos = 10; //variavel numerica inteira
        boolean cadastro = true; //tipo lógico armazena verdadeiro ou falso
        
        String nome = "Thiago Oliveira";
                
        System.out.print(nome + "\n" + idade + "\n" + pi + "\n" + grau + "\n" + sexo
        + "\n" + pontos + "\n" + cadastro);
     
}}
