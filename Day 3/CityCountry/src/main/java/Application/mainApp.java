/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Data.CSVReader;
import Data.City;
import Data.Country;
import Data.CountryPopulation;
import Data.DataManipulator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author rohanda
 */
public class mainApp {
    public static void main(String[] args){
    CSVReader reader = new CSVReader();
    List<Country> Country_list = reader.CountryRead("/home/rohanda/Desktop/Java and UML/Countries.csv");
    ArrayList<City> City_list = reader.CityRead("/home/rohanda/Desktop/Java and UML/Cities.csv");
    DataManipulator dm = new DataManipulator();
    Map<String, ArrayList<City>> code_city = dm.CityMapper(City_list);
    ArrayList<City> cities = code_city.get(" NLD");
   // System.out.println(code_city);
    //for (City p:cities) System.out.println(p);
    cities.sort((s1,s2)-> {
                if(s1.getPopulation()<  s2.getPopulation()) return -1;
                else if(s1.getPopulation() > s2.getPopulation()) return 1;
                else return 0;
    });
    CountryPopulation cp = new CountryPopulation(Country_list);
    List<Integer> pop_list = cp.getCountryPopulations();
     for (Integer p:pop_list) System.out.println(p);
     Double avg = cp.getAverage(pop_list);
         // for (Integer p:pop_list) System.out.println(p);
System.out.println("Average Population is "+avg);
     Integer max = cp.getMax(pop_list);
System.out.println("Maximum Population is "+max);
Map<String,Optional<City>> city_cunt_max = cp.getMaxcityPerCountry(City_list);
System.out.println(city_cunt_max);
        //for (City p:cities) System.out.println(p.getPopulation());
        
    

     
    
  
    

    
    
}
    
}