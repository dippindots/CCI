/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array13;

/**
 *
 * @author gaofeizhao
 */
public class Array13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution solution = new Solution();
        String strori = "this is a string";
        char[] str = strori.toCharArray();
        String result = solution.replaceSpaces(str, str.length);
        System.out.println(result);
    }
    
}
