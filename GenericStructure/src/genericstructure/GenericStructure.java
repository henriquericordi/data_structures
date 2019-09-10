/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstructure;

import java.util.ArrayList;

/**
 *
 * @author cc45966446830
 */
public class GenericStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Liquidificador"));

        imprime(lista);
    }

    public static void imprime(ArrayList<Produto> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).toString());
        }
    }

}
