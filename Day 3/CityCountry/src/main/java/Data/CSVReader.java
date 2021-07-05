/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rohanda
 */
public class CSVReader {
    public List<Country> CountryRead(String Filename) {
           List<Country> country_list = new ArrayList<Country>();
           FileReader fr;
        try {
            fr = new FileReader(Filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            try {
                   line = br.readLine();
                do{
                String[] splitted_line;
                if (line != null){
                    splitted_line = line.split(",");
                    Country ctry = CreateCountery(splitted_line);
                    country_list.add(ctry);

                }
                line = br.readLine();


        }while(line!=null);
         
           br.close();
           fr.close(); //is it a must?
               } catch (IOException ex) {
                   Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
               }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return country_list;
 
    
}
public ArrayList<City> CityRead(String Filename){
           ArrayList<City> city_list = new ArrayList<City>();
           FileReader fr;
        try {
            fr = new FileReader(Filename);
             BufferedReader br = new BufferedReader(fr);
           String line;
               try {
                   line = br.readLine();
                   do{
            String[] splitted_line;
            if (line != null){
                splitted_line = line.split(",");
                City c = CreateCity(splitted_line);
                city_list.add(c);

            }
            line = br.readLine();


        }while(line!=null);
         
           br.close();
           fr.close(); //is it a must?
               } catch (IOException ex) {
                   Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
               }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }
          
           return city_list;
 
    
}


public Country CreateCountery(String[] metadta){
    Country ctry = new  Country(metadta[1],metadta[0],Integer.parseInt(metadta[3]));
    return ctry;
    
}

public City CreateCity(String[] metadta){
    City c = new  City(Integer.parseInt(metadta[0]),metadta[1],Integer.parseInt(metadta[2]),metadta[3]);
    return c;
    
}
}
