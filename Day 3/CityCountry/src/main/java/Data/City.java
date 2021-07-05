/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author rohanda
 */
public class City {
    Integer id;
    String Name;
    Integer population;
    String Country_code;
    

    public City(Integer id,String City, Integer population, String Country_code) {
        
        this.Name = City;
        this.population = population;
        this.Country_code = Country_code;
        this.id = id;
    }
     public int getid() {
        return id;
    }

    public String getCity() {
        return Name;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getCountry_code() {
        return Country_code;
    }
     public void setid(int id) {
        this.id = id;
    }

    public void setCity(String City) {
        this.Name = City;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setCountry_code(String Country_code) {
        this.Country_code = Country_code;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
