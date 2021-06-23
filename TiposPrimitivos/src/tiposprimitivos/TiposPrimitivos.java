/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String nome = teclado.nextLine();
        float nota = new Float(teclado.nextFloat());
        float nota2 = teclado.nextFloat();
        float nota3 = (float) teclado.nextFloat();
        float nota4 = teclado.nextFloat();
        float media = new Float ((nota + nota2 + nota3 + nota4)/4);
        
        System.out.println("Aluno " + nome);
        System.out.printf("A sua nota do primeiro bimestre foi: %.2f\n", nota);
        System.out.printf("A nota do segundo: %.2f\n", nota2);
        System.out.printf("A nota do terceiro bimestre foi: %.2f \n", nota3);
        System.out.printf("A do quarto bimestre foi: %.2f\n", nota4);
        System.out.printf("Sua média %s, foi de: %.2f\n", nome, media);
        
        
        // TODO code application logic here
    }
    
}
