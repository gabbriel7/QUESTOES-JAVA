import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();
        int notasDe1 = 0;
        int notasDe2 = 0;
        int notasDe5 = 0;
        int notasDe10 = 0;
        int notasDe20 = 0;
        int notasDe50 = 0;
        int notasDe100 = 0;

        s.close();

        while(valor != 0){
            if(valor >= 100){
                valor = valor - 100;
                notasDe100++;
            }else if(valor >= 50){
                valor = valor - 50;
                notasDe50++;
            }else if(valor >= 20){
                valor = valor - 20;
                notasDe20++;
            }else if(valor >= 10){
                valor = valor - 10;
                notasDe10++;
            }else if(valor >= 5){
                valor = valor - 5;
                notasDe5++;
            }else if(valor >= 2){
                valor = valor - 2;
                notasDe2++;
            }else if(valor >= 1){
                valor = valor - 1;
                notasDe1++;
            }
        }
        System.out.println(notasDe100 + " nota(s) de R$ 100,00");
        System.out.println(notasDe50 + " nota(s) de R$ 50,00");
        System.out.println(notasDe20 + " nota(s) de R$ 20,00");
        System.out.println(notasDe10 + " nota(s) de R$ 10,00");
        System.out.println(notasDe5 + " nota(s) de R$ 5,00");
        System.out.println(notasDe2 + " nota(s) de R$ 2,00");
        System.out.println(notasDe1 + " nota(s) de R$ 1,00");

    }
}
