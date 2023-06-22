/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

/**
 *
 * @author Aluno
 */
public class LexMark implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("--- IMPRESSORA LEXMAR ---");
        System.out.println("Preprando tonner.");
        System.out.println("Imprimindo...");
    }
    
    
}
