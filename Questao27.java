import java.util.Scanner;


public class Questao27 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double media = 0;
        double media2 = 0;

        for (int i = 0; i < 4; i++) {
            int medicao = s.nextInt();

            if(medicao < 110){
                System.out.println(medicao + " NORMAL");
                media = media + medicao;
            }else if(medicao >= 110 && medicao <= 125){
                System.out.println(medicao + " ALTERADA");
                media = media + medicao;
            }else if(medicao > 125){
                System.out.println(medicao + " MUITO ALTO");
                media = media + medicao;
            }

        }

        s.close();

        media2 = media / 4;

        System.out.println("MÉDIA DAS LEITURAS = " + media2);

    }
}
