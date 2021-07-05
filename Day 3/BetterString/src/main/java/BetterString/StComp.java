/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetterString;
import java.util.function.BiPredicate;

/**
 *
 * @author rohanda
 */
public class StComp {
    public static String betterstring(String s1,String s2,BiPredicate<String,String> p){
        boolean ans = p.test(s1, s2);
        if (ans == true) return s1;
        else return s2;
        
    }
    
}
