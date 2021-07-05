/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author rohanda
 */
public class CountryPopulation {
     List<Country> mycountries ;

    public CountryPopulation(List<Country> mycountries) {
        this.mycountries = mycountries;
    }
     
    public List<Integer> getCountryPopulations(){
        
       List<Integer> pop_list =  mycountries.stream().map(Country::getPopulation).collect(toList());
       return pop_list;
        
    }
    public Double getAverage(List<Integer> pop){
         Double avg = pop.stream().mapToInt((x) -> x).average().getAsDouble();
         return avg;

        
    }
    public Integer getMax(List<Integer> pop){
         Integer max = pop.stream().mapToInt((x) -> x).max().getAsInt();
         return max;

        
    }
    public  Map<String, Optional<City>> getMaxcityPerCountry(List<City> ct){
    Map<String, Optional<City>> result =ct.stream ().collect(Collectors.groupingBy(City::getCountry_code, Collectors.maxBy(comparingInt(City::getPopulation))));
    return result;
}
    
}
