/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerakiassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eclectics
 */
public class reverseCharacters {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input String:");

// String input
        String Str = myObj.nextLine();
        List<String> splitString = splitToFour(Str);
        System.out.println(splitString);
        String result = reverseCharacter(splitString);
        System.out.println(result);
    }

    public static List<String> splitToFour(String text) {
        // Give the list the right capacity to start with. You could use an array
        // instead if you wanted.
        int n = text.length();
        List<String> newText = new ArrayList<>((n + 4 - 1) / 4);

        for (int i = 0; i < n; i += 4) {
            newText.add(text.substring(i, Math.min(n, i + 4)));
        }
        return newText;
    }

    private static String reverseCharacter(List<String> Str) {
        //String reversed_string = "";
        // reverse Strings
        int n = Str.size();
        List<String> reversedString = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String rev = reverse(Str.get(i));
            reversedString.add(rev);

        }
        StringBuilder builder = new StringBuilder(reversedString.size());
        reversedString.stream().forEach((S) -> {
            builder.append(S);
        });

        return builder.toString();
        //return reversed_string;

    }

    private static String reverse(String rev) {

        List<Character> word = new ArrayList<>(rev.length());
        for (Character c : rev.toCharArray()) {

            word.add(c);

        }
        Collections.reverse(word);
        StringBuilder builder = new StringBuilder(word.size());
        for (Character c : word) {
            builder.append(c);
        }

        return builder.toString();

    }

}
