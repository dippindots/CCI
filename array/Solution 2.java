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
public class Solution {
    String replaceSpaces(char[] str, int truelength){
        String stradd = "%20";
        String result = "";
        for (int i = 0; i < truelength; i++){
            if (str[i] != ' '){
                result = result + String.valueOf(str[i]);
            }
            else
            {
                result = result + "%20";
            }
        }
        return result;
    }
}
