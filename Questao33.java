import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;

        s.close();

        for (int i = 0; i < numero; i++) {
            System.out.println("" + numero1 +" "+ numero2+ " " + numero3 + " PUM");

            numero1 = numero1 + 4;
            numero2 = numero2 + 4;
            numero3 = numero3 + 4;
 
        }
 
    }
}
