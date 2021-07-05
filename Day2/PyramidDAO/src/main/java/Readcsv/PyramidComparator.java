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
public class PyramidComparator implements Comparable<Pyramid> {
    Pyramid pyrm1;
     public int compareTo(Pyramid pyrm2) {
         if (this.pyrm1.height < pyrm2.height) return -1;
         if (this.pyrm1.height > pyrm2.height) return 1 ;
         return 0;
         
    }
}
