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
public class Produto {
    int id;
    String nome;
    Produto prod;

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + '}';
    }

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }   

    public Produto(Produto p) {
        prod = p;
    }           
}
