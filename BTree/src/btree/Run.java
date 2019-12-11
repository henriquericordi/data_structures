/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CC45966446830
 */
public class Run {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        BTree<String, Notebook> st = new BTree<>();       
        Gson gson = new Gson();                      
	Notebook[] json = gson.fromJson(new FileReader("notebook_sell.json"), Notebook[].class);
        
        Arrays.asList(json).forEach((t) -> {            
            st.put(t.getTitle(), t);
        });
        
        Scanner s = new Scanner(System.in);
        System.out.print("Insira termo a ser buscado: ");
        String title = s.nextLine();
        Notebook n = st.get(title);
        System.out.println(n);               
    }
}
