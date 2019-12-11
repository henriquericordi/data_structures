/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author henriquericordi
 */
public class Run {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, String> pt = new HashMap<>();
        HashMap<String, String> en = new HashMap<>();

        BufferedReader ptReader = new BufferedReader(new FileReader("portugues.txt"));
        BufferedReader enReader = new BufferedReader(new FileReader("ingles.txt"));

        ptReader.lines().forEach((t) -> {
            String[] split = t.split("[.][ ]");
            if (!pt.containsValue(split[1])){
                pt.put(split[0], split[1]);
            }
        });

        enReader.lines().forEach((t) -> {
            String[] split = t.split("[.][ ]");
            if (!en.containsValue(split[1])){
                en.put(split[0], split[1]);
            }
        });

        Scanner s = new Scanner(System.in);  
        System.out.print("Insira a palavra: ");
        String palavra = s.nextLine();
        System.out.print("\n0 - pt->en\n1 - en->pt\n\nInsira opção: ");
        int op = s.nextInt();       
        if (op == 0) {            
            pt.forEach((t, u) -> {
                if (u.equals(palavra)) {                    
                    System.out.println("\nTradução: " + en.get(t));
                }
            });
        } else {
            en.forEach((t, u) -> {
                if (u.equals(palavra)) {
                    System.out.println("\nTradução: " + pt.get(t));
                }
            });
        }
    }
}
