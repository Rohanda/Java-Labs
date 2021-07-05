/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import BetterString.StComp;
import java.util.function.BiPredicate;

/**
 *
 * @author rohanda
 */
public class Application {
    public static void main(String[] args){
        String string1 = "Orange";
        String string2 = "cat";
   
       // BiPredicate<String,String> myob = new bipredicateimplementation();
        
        String res = betterstring(string1,string2,(s1,s2) -> s1.length() > s2.length());
        System.out.println(res+" is better");
    }
      public static String betterstring(String s1,String s2,BiPredicate<String,String> p){
        boolean ans = p.test(s1, s2);
        if (ans == true) return s1;
        else return s2;
        
    }
    
}
