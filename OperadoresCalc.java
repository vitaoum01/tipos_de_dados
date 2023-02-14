import java.util.Scanner;
public class OperadoresCalc {
    public static void main(String[] calculos) {
        
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        int produto;
        double divisao;
        int subtracao;
        int resto;

        System.out.println("Digite um número:");
        numero1=entrada.nextInt();

        System.out.println("Digite mais um número:");
        numero2=entrada.nextInt();

        soma = numero1+numero2;
        produto = numero1*numero2;
        divisao = numero1/numero2;
        subtracao = numero1-numero2;
        resto = numero1%numero2;

        System.out.println("A soma desses números é " + soma + ".");
        System.out.println("O produto desses números é " + produto + ".");
        System.out.println("A divisão desses números é " + divisao + ".");
        System.out.println("A subtração desses números é " + subtracao + ".");
        System.out.println("O resto desses números é " + resto + ".");
    }

}
