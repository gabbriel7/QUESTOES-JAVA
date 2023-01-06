package exercicios1;
import java.util.Scanner;

import javafx.scene.input.InputEvent;


public class Questao14 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();


        int numeroImpar = 0;

        for (int i = input; i <= input + 12; i++) {
            
            if (i % 2 == 0) {
                
            }else{

                numeroImpar = i;
                System.out.println(numeroImpar);
            }
        }
    }
}