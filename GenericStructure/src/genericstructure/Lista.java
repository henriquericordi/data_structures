/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstructure;

/**
 *
 * @author cc45966446830
 */
public class Lista<T> {

    No<T> primeiro = null;
    No<T> ultimo = null;

    public void insere(No<T> n) {
        if (primeiro == null) {//lista vazia            
            primeiro = n;
            ultimo = n;
        } else {
            ultimo.proximo = n;
            n.anterior = ultimo;
            ultimo = n;
        }
    }

    public No busca(String b, T obj) {
        No aux = this.primeiro;
        while (aux.proximo != null) {            
            if (aux.t.toString().contains(b)) {
                return aux;
            }
            aux = aux.proximo;
        }
        return null;
    }

    public void remove(String r, T obj) {
        No<T> rem = busca(r, obj);
        if (primeiro == ultimo && rem != null) {
            primeiro = null;
            ultimo = null;
        } else if (rem == primeiro) {
            No prox = rem.proximo;
            prox.anterior = null;
            primeiro = prox;
            rem.proximo = null;
        } else if (rem == ultimo) {
            No ant = rem.anterior;
            ant.proximo = null;
            ultimo = ant;
            rem.anterior = null;
        } else if (rem != null) {
            No ant = rem.anterior;
            No prox = rem.proximo;

            ant.proximo = rem.proximo;
            rem.proximo = null;

            prox.anterior = rem.anterior;
            rem.anterior = null;
        } else {
            System.out.println("Lista Vazia");
        }
    }

    public void limpaLista() {
        primeiro = null;
        ultimo = null;
    }

    public void imprimeLista() {
        No aux = primeiro;
        while (aux != null) {
            Produto p = aux.produto;
            System.out.println(aux + " -> " + p.toString()
                    + "Ant: " + aux.anterior
                    + "Prox: " + aux.proximo);
            aux = aux.proximo;
        }
    }
}
