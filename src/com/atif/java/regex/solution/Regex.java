package com.atif.java.regex.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Compares the input with regular expression and prints the result
 */
public class Regex {

    private final Pattern pattern;

    public Regex() {
        //compile pattern to check the sentence that begins with Caps and ends with .
        pattern = Pattern.compile("^[A-Z].*\\.$");
    }

    /**
     * <h3>Checks if the input passed matches the pattern</h3>
     * @param input String input
     * @return true, if string matches the patter. false otherwise
     */
    public boolean isMatching(String input){
        if(input == null){
            return false;
        }
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    /**
     * <h3>Prints the result for string matching</h3>
     * <p>Checks if the input string matches the pattern and print the message</p>
     * @param input String that is to be matched with the pattern.
     */
    public void matchString(String input){
        if(isMatching(input)){
            System.out.println("String ["+input+"] matches the pattern");
        }else{
            System.out.println("String ["+input+"] does not match");
        }
    }
}
