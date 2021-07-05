/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.function.BiPredicate;

/**
 *
 * @author rohanda
 */
public class bipredicateimplementation implements BiPredicate<String,String> {
    public boolean test(String s1,String s2){
        boolean ans = s1.length() > s2.length();
        return ans;
        
    }
    
}
