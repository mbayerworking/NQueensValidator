/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueensvalidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author morgan
 */
public class NQueensValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(4, 2, 7, 3, 6, 8, 5, 1));
        boolean isNQueens = qCheck(numbers);
        
        System.out.println(isNQueens);

        numbers.clear();
        numbers.addAll(Arrays.asList(5, 3, 1, 4, 2, 8, 6, 3));
        isNQueens = qCheck(numbers);
        
        System.out.println(isNQueens);
        
        numbers.clear();
        numbers.addAll(Arrays.asList(5, 8, 2, 4, 7, 1, 3, 6));
        isNQueens = qCheck(numbers);
        
        System.out.println(isNQueens);
    }


    private static boolean qCheck( List<Integer> numbers) {
        
        for (int j = 0; j < numbers.size(); j++ )
        {
            for( int k = j + 1; k < numbers.size(); k++)
            {
                // checks if row is the same
                // checks if slope of the line is equal to 1
                if (numbers.get(j) == numbers.get(k) || Math.abs(j-k) == Math.abs(numbers.get(j)- numbers.get(k)))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}
