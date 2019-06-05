/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

/**
 *
 * @author CC45966446830
 */
public class FilaDuplamenteEncadeada {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lista l = new Lista();
        Produto p1 = new Produto(1,"Cadeira");
        Produto p2 = new Produto(2,"Mesa");
        Produto p3 = new Produto(3,"Geladeira");
        Produto p4 = new Produto(4,"Fogão");  
        
        l.insere(new No(p1));
        l.imprimeLista();
        l.insere(new No(p2));
        l.imprimeLista();
        l.insere(new No(p3));
        l.imprimeLista();
        l.insere(new No(p4));
        l.imprimeLista();
        
    }
    
}
