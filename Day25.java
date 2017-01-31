/*Running time and complexity
Mika Smith
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25{

    public static void main(String[] args) {
        /* Enter your code here. */
        Boolean prime= true; 
        int test; 
        
        Scanner scan = new Scanner(System.in);
        int numCase= scan.nextInt();
        for(int n = 0; n < numCase; n++){
            prime = true;
            test = scan.nextInt();
            for(int i = 2; i< test; i++){
                if(test%i == 0){
                    prime = false;
                }
            }
            if(prime==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
    
        }
        scan.close();
    }
}
