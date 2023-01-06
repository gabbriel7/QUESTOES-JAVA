package exercicios1;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int valorDias = s.nextInt();
        int numeroAnos = 0;
        int numeroMes = 0;
        int numeroDias = 0;

        while(valorDias != 0){
            if(valorDias >= 365){

                valorDias = valorDias - 365;
                numeroAnos++;

            }else if(valorDias >= 30){

                valorDias = valorDias - 30;
                numeroMes++;

            }else if(valorDias >= 1){

                valorDias = valorDias - 1;
                numeroDias++;

            }
        }
        System.out.println(numeroAnos + " Ano (s)");
        System.out.println(numeroMes + " Mês (es)");
        System.out.println(numeroDias + " Dia (s)");
    }
}
