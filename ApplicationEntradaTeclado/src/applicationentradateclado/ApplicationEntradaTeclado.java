package applicationentradateclado;
import java.util.Scanner;
public class ApplicationEntradaTeclado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        double peso;
       System.out.println("Qual é o seu nome?");
       nome = ler.nextLine();
       System.out.println("Qual é a seu idade?");
       idade = ler.nextInt();
       System.out.println("Qual é a sua altura?");
       altura = ler.nextDouble();
       System.out.println("Qual é a seu peso?");
       peso = ler.nextDouble();
       
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Idade: " + peso);
       
        ler.close();
    }
    
}
