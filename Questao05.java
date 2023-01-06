import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);


        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        for (int i = 0; i < 3; i++) {
            int numero = s.nextInt();
            if(numero >= primeiro){
                terceiro = segundo;
                segundo = primeiro;
                primeiro = numero;
            }else if(numero >= segundo ){
                terceiro = segundo;
                segundo = numero;
            }else if(numero >= terceiro){
                terceiro = numero;
            }    
        }
        s.close();

        System.out.println(terceiro);
        System.out.println(segundo);
        System.out.println(primeiro);
    }
}
