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
public class Array12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution solution = new Solution();
        String str1 = "1234";
        String str2 = "4321";
        if (solution.checkPermutation(str1, str2))
        {
            System.out.println("Two strings are permutation");
        }
        else
        {
            System.out.println("not permutation");   
        }
    }
    
}
