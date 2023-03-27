/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proccess;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ryanv, Jacob
 */
public class ENGG1420_FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ArrayList<String> FileTest = new ArrayList<String>();
        FileTest.add("testfile.txt");
        
        SplitProcessingElement myElement = new SplitProcessingElement(FileTest, 2);
        
        myElement.FileSeparater();
        
    }
    
}
