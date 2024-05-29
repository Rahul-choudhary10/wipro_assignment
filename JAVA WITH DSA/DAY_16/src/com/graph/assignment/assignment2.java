package com.graph.assignment;

public class assignment2 {

    public static String extractMiddleSubstring(String str1, String str2, int length) {
        String concatenated = str1.concat(str2);
        StringBuilder reversed = new StringBuilder(concatenated).reverse();
        int middleIndex = reversed.length() / 2;
        if (reversed.length() == 0 || length > reversed.length()) {
            return "Invalid input";
        }
        int startIndex = middleIndex - length / 2;
        int endIndex = startIndex + length;
        return reversed.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int length = 3;
        System.out.println(extractMiddleSubstring(str1, str2, length)); 
        System.out.println(extractMiddleSubstring("", "World", 3)); 
        System.out.println(extractMiddleSubstring("Hello", "World", 10)); 
    }
}
