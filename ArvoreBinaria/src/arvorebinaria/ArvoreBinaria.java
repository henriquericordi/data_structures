/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author CC45966446830
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    No raiz;

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void insere(No n) {
        if (raiz == null) {
            raiz = n;
        } else {
            No aux = raiz;
            No paiN = null;
            //navega na arvore ate encontrar o nó pai de n
            while() {
                if (n.getValor() > aux.getValor()) {
                    if (aux.getFilhoDir() != null) {
                        aux = aux.getFilhoDir();
                    } else {
                        posIns = aux;
                    }
                } else {

                }
            }
        }
    }
}
