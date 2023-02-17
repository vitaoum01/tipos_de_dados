public class EstruturaDeRepeticao { 
    public static void main(String[] args) {
        for (int i=0; i<=300; i++){
            System.out.println(i);
        }

        System.out.println("");
        int soma = 0;
        for (int i=1; i<=1000;i++){
        soma = soma + i;
            System.out.println(soma);

        }
    
        System.out.println("");
        for (int i=0; i<=100;i+=3){
            System.out.println(i);
    }

        System.out.println("");
        int fatResult = 1;
        for (int j=0;j<=10;j++){
            for (int i=j;i>=1;i--){
                if (i == 0){
                    fatResult = 1;
                    break;
                } else{
                    fatResult = j * fatResult;
                }
            }
            
            System.out.println("O fatorial de "+j +" = "+ fatResult);
            fatResult = 1;
        }
}
}
