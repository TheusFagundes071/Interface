/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VideoGame videogame = new VideoGame();
        
        
        
       videogame.ligar();
       
       videogame.jogar(new Xadrez());
       
       videogame.fechar();
       
       videogame.desligar();
        
        
                
        
    }
    
}
