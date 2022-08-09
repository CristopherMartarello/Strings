
package lista_exercicios_07;

import java.util.Scanner;


public class ex_04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String numero = "";
        char [] vetorNumero;
        
        System.out.print("Digite um número: ");
        numero = input.nextLine();
        
        vetorNumero = numero.toCharArray();
        
        for (int i = 0; i < vetorNumero.length; i++) {
            switch (vetorNumero[i]) {
                case '1': System.out.println("UM");
                    break;
                case '2': System.out.println("DOIS");
                    break;
                case '3': System.out.println("TRÊS");
                    break;
                case '4': System.out.println("QUATRO");
                    break;
                case '5': System.out.println("CINCO");
                    break;
                case '6': System.out.println("SEIS");
                    break;
                case '7': System.out.println("SETE");
                    break;
                case '8': System.out.println("OITO");
                    break;
                case '9': System.out.println("NOVE");
                    break;
                case '0': System.out.println("ZERO");
                    break;
                default: System.out.println("ERRO!");
                    
            }
            
        }
        
        
    }
    
}
