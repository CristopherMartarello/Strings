
package lista_exercicios_07;

import java.util.Scanner;


public class ex_03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String palavraDigitada = "";
        char[] vetorPalavra;
        String palavraCase = "";
        int contVogais = 0;
        
        System.out.print("Digite uma palara: ");
        palavraDigitada = input.nextLine();
        palavraCase = palavraDigitada.toUpperCase();
        
        vetorPalavra = palavraCase.toCharArray();
        
        for(int i = 0; i < palavraDigitada.length(); i++){
            if(vetorPalavra[i] == 'A' || vetorPalavra[i] == 'E' || vetorPalavra[i] == 'I' || vetorPalavra[i] == 'O' || vetorPalavra[i] == 'U'){
                contVogais++;
            }
        }
        
        
        System.out.println("======================");
        System.out.println("Número de caracteres na palavra: " + palavraDigitada.length());
        System.out.println("Número de vogais na palavra: " + contVogais);
        System.out.println("Palavra em caixa alta: " + palavraCase);
    }
    
}
