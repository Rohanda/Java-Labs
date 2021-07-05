/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rohanda
 */
public class DataManipulator {
    public  Map<String, ArrayList<City>> CityMapper(ArrayList<City> city_list){
    Map<String, ArrayList<City> > city_code = new HashMap<>(); 
    for (City c : city_list){
        if (city_code.containsKey(c.Country_code)){
            ArrayList<City> st = city_code.get(c.Country_code);
            st.add(c);
            city_code.put(c.Country_code, st);
        }
        
        else  city_code.put(c.Country_code,new ArrayList<City>());
    }
             return city_code;

}
    
}
