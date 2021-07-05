/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Readcsv;
import java.util.*;
/**
 *
 * @author rohanda
 */
public interface PyramidCSVInterface {

    public List<Pyramid> readPyramidFromCSV(String Filename);
    public Pyramid createPyramid(String[] metdata);
}
