import java.util.Scanner;


public class Questao41 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double altura = s.nextDouble();
        double peso = s.nextDouble();
        double calculoPeso = 0;

        s.close();

        if(altura <= 1.5){
            if(peso > 50){
                calculoPeso = peso - 50;
                System.out.println("Emagreça " + calculoPeso + " kg");
            }else if(peso < 50){
                calculoPeso = 50 - peso;
                System.out.println("Engorde " + calculoPeso + " kg");
            }else{System.out.println("Parabéns peso ideal!");}
        }else if(altura > 1.5 && altura <= 1.9){
            if(peso > 70){
                calculoPeso = peso - 70;
                System.out.println("Emagreça " + calculoPeso + " kg");
            }else if(peso < 70){
                calculoPeso = 70 - peso;
                System.out.println("Engorde " + calculoPeso + " kg");
            }else{System.out.println("Parabéns peso ideal!");}
        }else if(altura > 1.9){
            if(peso > 100){
                calculoPeso = peso - 100;
                System.out.println("Emagreça " + calculoPeso + " kg");
            }else if(peso < 100){
                calculoPeso = 100 - peso;
                System.out.println("Engorde " + calculoPeso + " kg");
            }else{System.out.println("Parabéns peso ideal!");}
        }
    }
}
