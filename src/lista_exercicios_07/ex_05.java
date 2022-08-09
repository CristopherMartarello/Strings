
package lista_exercicios_07;

import java.util.Scanner;


public class ex_05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String palavraDigitada = "";
        char[] vetorPalavra;
        int contIguais = 0;
        
        System.out.println("Informe uma palíndromo: ");
        palavraDigitada = input.nextLine().replace(" ", "");
        //palavraDigitada = palavraDigitada.replace("x", "e"); JAVA NÃO CONSEGUE LER CARACTERES ESPECIAIS E COM ACENTO
        
        vetorPalavra = palavraDigitada.toCharArray();
        
        int j = vetorPalavra.length;
        
        for (int i = 0; i < vetorPalavra.length; i++) {
            System.out.println(vetorPalavra[i] + " -> " + vetorPalavra[j-1]);
            if (vetorPalavra[i] == vetorPalavra[j-1]) {
                contIguais++;
            }
            j--;
        }
        
        if (contIguais == vetorPalavra.length){
            System.out.println("É PALÍNDROMO");
        }else{
            System.out.println("NÃO É PALÍNDROMO");
        }
        
        
    }
    
}
