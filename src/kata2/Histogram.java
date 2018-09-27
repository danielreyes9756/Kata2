/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Usuario
 */
//funcionaba de todas maneras con los tipos genericos
public class Histogram <T>{
    private final String [] data;

    public Histogram(String [] data) {
        this.data = data;
    }
    
    public String [] getData() {
        return data;
    }
    
    public Map<String,Integer> getHistogram() {
        Map<String,Integer> res = new HashMap<>();
        for (String key : data) {
            res.put(key,res.containsKey(key) ? res.get(key)+1 : 1);
        }
        return res;
    }
}
