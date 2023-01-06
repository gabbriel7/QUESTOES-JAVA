import java.util.Scanner;


public class Questao39 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int numero = s.nextInt();
        int valor = 0;

        s.close();

        for (int i = 1; i <= 10; i++) {
            
            valor = numero * i;
            System.out.println(numero + " X " + i + " = " + valor);

        }
    }
}
