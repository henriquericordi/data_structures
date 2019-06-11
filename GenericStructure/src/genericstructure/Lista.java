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

    No primeiro=null;
    No ultimo=null;
    
    //Metodo para inserção de um elemento na lista
    public void insere(T t){
        No<T> n = new No<>(t);
        if (primeiro==null){
            //LISTA VAZIA...
            primeiro = n;
            ultimo = n;            
        }
        else{
            //Proximo de ultimo aponta para N
            ultimo.proximo = n;
            //Anterior do novo elemento aponta para ultimo
            n.anterior = ultimo;
            //atualiza o ponteiro ultimo
            ultimo = n;            
        }
           
    }
    public No busca (String b){
        No auxiliar = this.primeiro;        
        while(auxiliar != null){ // auxiliar.proximo!=null            
            if(auxiliar.t.toString().contains(b)){
                return auxiliar;
            }
            auxiliar = auxiliar.proximo;
        }
        return null;        
    }
    
    public void remove (String r){
        No rem = busca(r);
        if(primeiro == ultimo && rem!=null){
            //So tem um elemento na lista
            primeiro = null;
            ultimo = null;
        }
        else if(rem == primeiro){
            //caso o elemento a ser removido for o 1o da lista
            No prox = rem.proximo;
            prox.anterior = null;
            primeiro = prox;
            rem.proximo = null;
        }
        else if(rem == ultimo){
            //caso o elemento seja o ultimo da lista
            No ant = rem.anterior;
            ant.proximo = null;
            ultimo = ant;
            rem.anterior = null;
        }
        else if(rem!=null){
            No ant = rem.anterior;
            No prox = rem.proximo;
            
            ant.proximo = rem.proximo; //prox
            rem.proximo = null;
            
            prox.anterior = rem.anterior; //ant
            rem.anterior = null;
        }
        else{
            System.out.println("Elemento nao encontrado");
        }
    }
    
    public void limpaLista(){
        primeiro = null;
        ultimo = null;
    }
    
    public void imprimeLista(){
        No aux = primeiro;
        System.out.println("=====LISTA =====");
        while (aux!=null){            
            System.out.println(" -> "+aux.t.toString());
            aux = aux.proximo;
        }
    }
}
