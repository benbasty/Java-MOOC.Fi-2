/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author benbasty
 */
public class SaveableDictionary {
    private Map<String,String> dictionnary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionnary = new HashMap<>();
    }
    
    public void add(String words, String translation){
        if(this.dictionnary.containsKey(words)){
            return;
        } 
        this.dictionnary.put(words, translation);
        this.dictionnary.put(translation, words);
    }
    
    public String translate(String word){
        return this.dictionnary.get(word);
    }
    
    public void delete(String word){
        String translation = translate(word);
        this.dictionnary.remove(word);
        this.dictionnary.remove(translation);
        
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    
    public boolean load(){
        try {

            Files.lines(Paths.get(this.file))

                    .map(line -> line.split(":"))

                    .forEach(parts -> {

                        this.dictionnary.put(parts[0], parts[1]);

                        this.dictionnary.put(parts[1], parts[0]);

                    });

            return true;

        } catch (IOException ex) {

            return false;

        }
    
    }
    
    public boolean save(){
        try {

            PrintWriter writer = new PrintWriter(new File(file));

            saveWords(writer);

            writer.close();

        } catch (Exception e) {

            return false;

        }

        return true;
    
    }

    private void saveWords(PrintWriter writer) {
        List<String> allreadySaved = new ArrayList<>();

        this.dictionnary.keySet().stream().forEach(word -> {

            if (allreadySaved.contains(word)) {

                return;

            }

 

            String pari = word + ":" + this.dictionnary.get(word);

            writer.println(pari);

 

            allreadySaved.add(word);

            allreadySaved.add(this.dictionnary.get(word));

        });
    }
    
}
