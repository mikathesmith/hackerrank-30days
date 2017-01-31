/* Day 26: Nested Logic. 
Given the expected and actual return dates for a library book, create a program that calculates the fine (if any)

   Mika Smith
   Input: The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned. 
The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).

Output: Print a single integer denoting the library fine for the book received as input.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int actday, actmon, actyer, expday, expmon, expyer; 
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in); 
        actday = scan.nextInt();
        actmon= scan.nextInt();
        actyer= scan.nextInt(); 
        expday = scan.nextInt();
        expmon=scan.nextInt();
        expyer = scan.nextInt();
        scan.close();
        
        int dayDif= actday-expday;
        int monDif= actmon-expmon;
        int yearDif = actyer-expyer;
        
        System.out.println(calculateFee(dayDif, monDif, yearDif));
        
    }
    public static int calculateFee(int dayDif, int monDif, int yearDif){
        if(yearDif < 0){ //returned years earlier
            return 0; 
        }else if(yearDif==0){ //returned same year 
            if(monDif<=0){ //within same month or earlier
                if(dayDif<=0){ //on or before day due
                    return 0;
                }
                return dayDif*15; //same month but day due 
            }
            return monDif*500; //month late 
        }
        return 10000; //any years later - default fee
   }
   }