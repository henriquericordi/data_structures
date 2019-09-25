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
    static No raiz;

    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreBinaria ab = new ArvoreBinaria();
        int vet[] = {20, 14, 45, 10, 18, 32, 50, 2, 12, 16, 19, 17, 37, 47, 70};
        for (int i = 0; i < vet.length; i++) {
            ab.insere(new No(vet[i]));
        }
        ab.imprimeArvore(raiz);
    }

    public void insere(No n) {
        if (raiz == null) {
            raiz = n;
        } else {
            No aux = raiz;
            No paiN = null;
            //navega na arvore ate enconrtrar o nó pai de n
            while (paiN == null) {
                if (n.getValor() > aux.getValor()) {
                    if (aux.getFilhoDir() != null) {
                        aux = aux.getFilhoDir();
                    } else {
                        paiN = aux;
                        n.setPai(paiN);
                        paiN.setFilhoDir(n);
                    }
                } else {
                    if (aux.getFilhoEsq() != null) {
                        aux = aux.getFilhoEsq();
                    } else {
                        paiN = aux;
                        n.setPai(paiN);
                        paiN.setFilhoEsq(n);
                    }
                }
            }
        }
    }//insere

    //Pre ordem
    public void imprimeArvore(No aux) {
        if (aux == null) {
            return;
        }
        System.out.println(aux.toString());
        imprimeArvore(aux.getFilhoEsq());
        imprimeArvore(aux.getFilhoDir());
    }

    public No busca(int val) {
        No aux = raiz;
        if (aux.getValor() == val) {
            return aux;
        } else {
            while (aux != null) {
                if (val > aux.getValor()) {
                    aux = aux.getFilhoDir();
                } else if ( val < aux.getValor()) {
                    aux = aux.getFilhoEsq();
                } else { //localizou
                    return aux;
                }
            }
        }
        return aux;
    }

    public No remove(int val) {
        No r = busca(val);
        if (r.getFilhoDir() == null && r.getFilhoEsq() == null && r != raiz) {
            //se nao possui filhos
            No paiR = r.getPai();
            if (r.getValor() > paiR.getValor()) {
                paiR.setFilhoDir(null);
            } else {
                paiR.setFilhoEsq(null);
            }
        } else if ((r.getFilhoDir() == null || r.getFilhoEsq() == null) && r != raiz) {
            //possui pelo menos 1 filho...
            No filER = r.getFilhoEsq();
            No filDR = r.getFilhoDir();
            No paiR = r.getPai();
            No minDir = min(filDR);
        }
        return r;
    }//remove
    
    public No min(No raiz){
        No aux = raiz;
        while (aux!=null) {            
            if (aux.getFilhoEsq()==null) {
                return aux;
            } else {
                aux = aux.getFilhoEsq();
            }
        }
        return aux;        
    }
}
