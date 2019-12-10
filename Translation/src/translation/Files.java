/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translation;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author henriquericordi
 */
public class Files {
    FileReader ptFile;
    FileReader enFile;
    
    public Files() throws FileNotFoundException {
        this.ptFile = new FileReader("portugues.txt");
        this.enFile = new FileReader("ingles.txt");
    }
    
}
