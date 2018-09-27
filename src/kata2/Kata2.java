/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = {1,1,3,4,2,1,3,5,4,1,2,3,5,4,1};
        int numMasGrande = 10;
        Map<Integer,Integer>histogram = new HashMap<Integer,Integer>();

        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i],histogram.get(data[i])+1);
            } else {
                histogram.put(data[i],1);
            }
        }
        histogram.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }
    
}
