/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rajat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Enter the desired n length of sequence (n < 100): ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            n = in.nextInt();
            SequenceGenerator sg = new SequenceGenerator(n);
            sg.generateSequence();
            System.out.println("\nSequence generated: " + sg.getArrayList());
            SubsequenceFinder sf = new SubsequenceFinder(sg.getArrayList());
            sf.clearLists();
            sf.findSubsequence();
            System.out.println("Largest increasing subsequence: " + sf.getSubsequenceList());
        } else {
            System.out.println("\nIncorrect entry. Program terminating.");
        }
    } 
}
