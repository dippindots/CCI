/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1.pkg1;

/**
 *
 * @author gaofeizhao
 */
public class isunique {
    boolean isUnique( String str){
        for (int i = 1; i < str.length(); i++){
            for (int j = 0; j < i; j++){
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
}
