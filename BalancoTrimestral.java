public class BalancoTrimestral {
    public static void main(String[] args) {
        
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = gastosTrimestre / 3;

        System.out.println("O total dos gastos trimestrais é de: R$ " + gastosTrimestre + ",00");
        System.out.println("Valor da média mensal = R$ " + mediaMensal + "0");   
    }
}
