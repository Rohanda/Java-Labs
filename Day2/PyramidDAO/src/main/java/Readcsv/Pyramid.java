/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Readcsv;

/**
 *
 * @author rohanda
 */
public class Pyramid implements Comparable<Pyramid> {
    String site;
    double height;
    String modern_name;
    String Pharaoh;
    
    public Pyramid(String site, double height, String modern_name, String Pharaoh) {
        this.site = site;
        this.height = height;
        this.modern_name = modern_name;
        this.Pharaoh = Pharaoh;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getPharaoh() {
        return Pharaoh;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    @Override
    public String toString() {
        return "Pyramid{" + modern_name+'}'+"Height is{"+height+"}";
    }
    public int compareTo(Pyramid pyrm2) {
         if (this.height < pyrm2.height) return -1;
         if (this.height > pyrm2.height) return 1 ;
         return 0;
         
    }
    
    
}
