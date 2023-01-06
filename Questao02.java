import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        double salario = 0;

        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int horas = s.nextInt();
        double valor = s.nextDouble();

        s.close();

        salario = (valor * horas);
        
        System.out.println("NÚMERO = " + numero);
        System.out.println("SALÁRIO = R$ " + salario);
    }
}
