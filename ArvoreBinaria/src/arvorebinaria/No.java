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
public class No {
    int valor;
    No filhoEsq;
    No filhoDir;
    No pai;

    @Override
    public String toString() {
        return "No{\n" + "valor = " + valor + "\n}";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(No filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public No getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(No filhoDir) {
        this.filhoDir = filhoDir;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }        
}