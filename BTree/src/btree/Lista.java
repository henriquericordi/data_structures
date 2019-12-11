/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

import java.util.List;

/**
 *
 * @author henriquericordi
 */
public class Lista {
    private List<Notebook> lista;

    public Lista(List<Notebook> lista) {
        this.lista = lista;
    }

    public List<Notebook> getLista() {
        return lista;
    }

    public void setLista(List<Notebook> lista) {
        this.lista = lista;
    }       
}
