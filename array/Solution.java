/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array12;

/**
 *
 * @author gaofeizhao
 */
public class Solution {
    boolean checkPermutation(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(str1.length()-i-1)) return false;
        }
        return true;
    }
}


//official solution

/*
String sort(String s){
char[] content= s.toCharArray();
java.util.Arrays.sort(content);
    return new String(content);
}
boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
    return false;
}
*/