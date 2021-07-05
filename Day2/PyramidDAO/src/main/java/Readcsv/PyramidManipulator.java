/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Readcsv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rohanda
 */
public class PyramidManipulator {
    List<Pyramid> pyramid_list;

    public PyramidManipulator (List<Pyramid> pyramid_list){
        this.pyramid_list = pyramid_list;
    }
    public void HeightSorter(){
        Comparable pymcom =new PyramidComparator();
        Collections.sort(this.pyramid_list);
        for(Pyramid str: this.pyramid_list){
			System.out.println(str);
	   }
    }
    public  Map<String, Integer> PyramidMapper(){
        Map<String, Integer> pyramid_num = new HashMap<>(); 
        for (Pyramid p : pyramid_list){
            if (pyramid_num.containsKey(p.site)) pyramid_num.put(p.site, pyramid_num.get(p.site) + 1);
            else { pyramid_num.put(p.site,1);}
        }
                 return pyramid_num;

    }
    
}
