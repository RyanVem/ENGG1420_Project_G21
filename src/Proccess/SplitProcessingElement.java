/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ryanv
 */
public class SplitProcessingElement {
   
    public ArrayList<String> SplitProcessingElement(ArrayList<String> inputList, int lines){
        ArrayList<String> outputList = new ArrayList<String>();
        
        for (String entry : inputList) {
            Path path = Paths.get(entry);

            if (Files.isDirectory(path)) {
                // Ignore directories
                continue;
            }
        }
            
        return outputList;
    }
    
}