package com.atif.java.regex.main;

import com.atif.java.regex.solution.Regex;
import com.atif.java.regex.utils.Utils;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Initializes all the necessary classes of the solution
 */
public class Main {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(new InputStreamReader(System.in));
        Regex regex = new Regex();
        String input = inputScanner.nextLine();
        while(!Utils.shouldExit(input)) {
            regex.matchString(input);
            input = inputScanner.nextLine();
        }
    }
}
