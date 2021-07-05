/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Readcsv;

import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.List;
import  java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rohanda
 */
//try catch is a must?
public class PyramidCSV implements PyramidCSVInterface {
   public List<Pyramid> readPyramidFromCSV(String Filename){
      List<Pyramid> pyramid_list = new ArrayList<Pyramid>();
       try {
           FileReader fr = new FileReader(Filename);
           BufferedReader br = new BufferedReader(fr);
           String line;
           
          try {
                         br.readLine();
             line = br.readLine();
              System.out.println(line);
              do{
              String[] splitted_line;
              if (line != null){
                  splitted_line = line.split(",");
                  Pyramid pm = createPyramid(splitted_line);
                  pyramid_list.add(pm);
                  
              }
              line = br.readLine();

              
          }while(line!=null);
          
      
       
           br.close();
           fr.close(); //is it a must?
          } catch (IOException ex) {
              Logger.getLogger(PyramidCSV.class.getName()).log(Level.SEVERE, null, ex);
          }
      
      
       } catch (FileNotFoundException ex) {
           Logger.getLogger(PyramidCSV.class.getName()).log(Level.SEVERE, null, ex);
       }
      return pyramid_list;
   
   }
    public Pyramid createPyramid(String[] metdata){
        double height = 0;
        if (!metdata[7].equals("")){ //why not null ?
            height = Double.parseDouble(metdata[7]); // is it ok ?
    }
            Pyramid pyrm = new Pyramid(metdata[4], height,metdata[0],metdata[2]);
            return pyrm;
       }


}
