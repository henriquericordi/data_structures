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
public class No<T> {
    No<T> anterior;
    No<T> proximo;
    T t; 

    public No(T obj) {
        t = obj;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public T getT() {
        return t;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public void setT(T t) {
        this.t = t;
    }    
}
