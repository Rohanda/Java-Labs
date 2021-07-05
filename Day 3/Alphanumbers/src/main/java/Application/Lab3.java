/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Alphanumbers.AlphaChecker;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author rohanda
 */
public class Lab3 {
    public static void main(String[] args){
        AlphaChecker a = new AlphaChecker();
        Predicate<String> b = new Predicate<String>(){
            public boolean test(String m){
            Stream<Character> characterStream = m.chars().mapToObj(c -> (char) c);
            List<Character> result = characterStream.collect(Collectors.toList());
            boolean answer = result.stream().allMatch(Character::isLetter);
            return answer;
        }};
        String m = "THisatestString2";
        boolean answer = a.check(m,b);
        System.out.println("The String: "+ answer);
    }
    
}
