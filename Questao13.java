package exercicios1;

public class Questao13 {
    public static void main(String[] args) {
        
        int numeroPar = 0;

        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                
                numeroPar = i;

                System.out.println(numeroPar);

            }


        }

    }
}