/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.io.*;

/**
 *
 * @author rohanda
 */
//Questions
// write with an new line after?
//what is filewriter
public class ConsoleReader {
    public static void main(String[] args) throws IOException{
        InputStreamReader re = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(re);
        FileWriter fw = new FileWriter("file.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String name = "";
        while (!name.equals("stop")){
            System.out.println("Enter data:");
            bw.write("Enter data\n");
            name = br.readLine();
            System.out.println("Data is:"+name);

            bw.write(name);
            bw.write("\ndata is "+name);
            bw.write("\n");
            
            
        }
   
        br.close();
        bw.close();
        
        }
       
    }
    

