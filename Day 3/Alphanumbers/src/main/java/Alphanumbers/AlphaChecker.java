/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alphanumbers;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 *
 * @author rohanda
 */
public class AlphaChecker {
        public boolean check(String m,Predicate<String> a){
        
        return a.test(m);

          
            
        
    }
    
    
}
