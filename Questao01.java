import java.util.Scanner;

public class Questao01{
    public static void main(String[] args) {


        double nota1 = 0;
        double nota2 = 0;
        double notaFinal1 = 0;
        double notaFinal2 = 0;
        double peso1 = 3.5;
        double peso2 = 7.5;
        double media = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota1 = input.nextDouble();       

        if(nota1 <= 10){
            notaFinal1 = (nota1 * peso1);
        }else{
            System.out.println("Nota invalida, Digite outra nota: ");
            nota1 = input.nextDouble();
            notaFinal1 = (nota1 * peso1);
        }
        System.out.println("Digite uma nota: ");
        
        nota2 = input.nextDouble();

        if(nota2 <= 10){
            notaFinal2 = (nota2 * peso2);
        }else{
            System.out.println("Nota invalida, escreva outra nota: ");
            nota2 = input.nextDouble();
            notaFinal2 = (nota2 * peso2);

            
        }

        input.close();

        media = ((notaFinal1 + notaFinal2)/11);
         
        System.out.println("MÉDIA = " + media);

    }
}