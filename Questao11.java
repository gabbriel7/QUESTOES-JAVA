package exercicios1;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int horaInicial = s.nextInt();
        int horaFinal = s.nextInt();
        int duracaoJogo =0;

        if (horaFinal < horaInicial){

            duracaoJogo = (horaFinal + (24 - horaInicial));
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA (S)");

        }else if( horaFinal == horaInicial){

            System.out.println("O JOGO DUROU 24 HORA (S)");

        }else if(horaInicial < horaFinal){

            duracaoJogo = horaFinal - horaInicial;

            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA (S)");
        }
    }
}
