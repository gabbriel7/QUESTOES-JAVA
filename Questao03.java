import java.util.Scanner;


public class Questao03 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String nome = s.nextLine();
        double salarioFixo = s.nextDouble();
        double vendarMes = s.nextDouble();
        double salarioFinal = 0;

        s.close();

        salarioFinal = salarioFixo + (vendarMes * 0.15);

        System.out.println(salarioFinal);

    }
}
