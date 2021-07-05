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
public class Country {
    String Name;
    String Code;
    Integer population;

    public Country(String Name, String Code, Integer Population) {
        this.Name = Name;
        this.Code = Code;
        this.population = Population;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public int getPopulation() {
        return population;
    }
    

    @Override
    public String toString() {
        return Name+" "+Code;
    }
    
    
}
