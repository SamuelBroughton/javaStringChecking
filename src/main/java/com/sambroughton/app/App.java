package com.sambroughton.app;

/**
 * App for checking the differences in characters 
 * of two Strings
 * 
 * @author sambroughton
 *
 */
public class App {
    
    /**
     * Returns the number of different characters in
     * two strings of equal length 
     * 
     * @param str1 the first of two strings to be compared
     * @param str2 the second of two strings to be compared
     * @return the count of the number of differences in the strings 
     */
    public static int compareStr(String str1, String str2) {
        int count = 0;
        
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Main method
     *
     */
    public static void main(String[] args) {
      String str1 = "kjnfwckjnwq";
      String str2 = "kjnfwckjnwq";
      
      if (str1.length() != str2.length()) {
          System.out.println("Failed: Strings are of different length");
      } else {
          System.out.println(compareStr(str1, str2));
      }

    }
}
