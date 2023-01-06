import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);


        int maiorNumero = 0;
        int menorNumero = -1;

        for (int i = 0; i < 3; i++){
            int numero = s.nextInt();
            if (numero > maiorNumero){
                maiorNumero = numero;
            }else if(numero < menorNumero || menorNumero == -1){
                menorNumero = numero;
            }
        }
        s.close();

        System.out.println("MAIOR = " + maiorNumero);
        System.out.println("MENOR = " + menorNumero);

    }
}
