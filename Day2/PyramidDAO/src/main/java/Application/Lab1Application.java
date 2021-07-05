package Application;
import Readcsv.*;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohanda
 */
public class Lab1Application {
    public static void main(String[] args){
        PyramidCSVInterface pyramidreader = new PyramidCSV();
        List<Pyramid> pyramids = pyramidreader.readPyramidFromCSV("/home/rohanda/Desktop/pyramids.csv");
        PyramidManipulator pyman =new PyramidManipulator(pyramids);
        System.out.println(pyramids.size());
        pyman.HeightSorter();
         Map<String, Integer> pyramid_num = pyman.PyramidMapper();
         pyramid_num.entrySet().forEach(entry -> {
    System.out.println(entry.getKey() + " =" + entry.getValue());
});
        //System.out.println(pyramids);
        //for (Pyramid py : pyramids){
        //System.out.println(py);
        }
    }
    
