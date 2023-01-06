import java.util.Scanner;


public class Questao42 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double valorAntigo = s.nextDouble();
        double valorNovo = s.nextDouble();
        double porcentagem = 0;

        s.close();

        porcentagem = (((valorNovo * 100)/valorAntigo) - 100);

        System.out.println(porcentagem + "%");
    }
}
