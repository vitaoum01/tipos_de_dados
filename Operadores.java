import java.util.Scanner;
public class Operadores {
    public static void main(String[] vitao) {

        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        int numero1;
        int numero2;
        int produto;
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        System.out.println("Digite um número");
        numero1=entrada.nextInt();
        
        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        produto=numero1*numero2;

        System.out.println("O produto desses dois números é: "+ produto +".");
    }
    
}