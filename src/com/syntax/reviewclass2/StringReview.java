package com.syntax.reviewclass2;

public class StringReview {
    public static void main(String[] args) {
        String str = "Today is thursday and it is java Review";

        boolean empty = str.isEmpty();
        System.out.println("my string is empty = " + empty);

        int length = str.length();
        System.out.println("Length of the string is " + length);

        // insted of thursday i want to have monday?

        str = str.replace("thursday", "Monday");
        System.out.println(str);

        // how many words my string has?

        String[] allWords = str.split(" ");
        System.out.println("In my string i have " + allWords.length + " words");

        //print all word 1 by 1
        for (String word : allWords) {
            System.out.println(word + " ");

            // how would you reverse a string?

            String give = "Hello";

            StringBuilder sb = new StringBuilder(give);
            sb.reverse();
            System.out.println(sb);

            // how would you reverse a String without using reverse

            String reverse = "";
            for (int i = give.length() - 1; i >= 0; i--) {
                reverse += give.charAt(i);

            }
            System.out.println(reverse);

            // substring method
            String s = "Today I am happy";
            s = s.substring(6);
            System.out.println(s); // printing I am happy

            s = s.substring(0, 4);
            System.out.println(s);// printing I am
        }

    }
}

