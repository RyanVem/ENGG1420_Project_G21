/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Proccess;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author Ryan V
 */

public class SplitProcessingElement {
    private ArrayList<String> inputList; 
    private int lines;
            
    public SplitProcessingElement(ArrayList<String> inputList, int lines){
        this.inputList = inputList;
        this.lines = lines;
    }
    
    
    public ArrayList<String> FileSeparater() throws IOException{
        ArrayList<String> outputFiles = new ArrayList<String>();
        
        for (String file : inputList) {
            File inputFile = new File(file);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            
            String line;
            int lineNumber = 1;
            int partNumber = 1;
            BufferedWriter writer = new BufferedWriter(new FileWriter(getPartFileName(inputFile, partNumber)));

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();

                if (lineNumber == lines) {
                    writer.close();
                    outputFiles.add(getPartFileName(inputFile, partNumber));
                    partNumber++;
                    writer = new BufferedWriter(new FileWriter(getPartFileName(inputFile, partNumber)));
                    lineNumber = 0;
                }

                lineNumber++;
            }

            writer.close();
            reader.close();
            if (lineNumber > 1) { // Only add file if it has content
            outputFiles.add(getPartFileName(inputFile, partNumber));
            }
        }
        return outputFiles;        
    }
    
    
    private static String getPartFileName(File inputFile, int partNumber) {
        String fileNameWithoutExtension = inputFile.getName().substring(0, inputFile.getName().lastIndexOf('.'));
        String fileExtension = inputFile.getName().substring(inputFile.getName().lastIndexOf('.'));
        return fileNameWithoutExtension + "part" + partNumber + fileExtension;
    }
    
}