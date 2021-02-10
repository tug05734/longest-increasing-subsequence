/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.longestincreasingsubsequence;

import java.util.ArrayList;

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
        SequenceGenerator sg = new SequenceGenerator(10);
        sg.generateSequence();
        System.out.println(sg.getArrayList());
        SubsequenceFinder sf = new SubsequenceFinder(sg.getArrayList());
        sf.clearLists();
        sf.findSubsequence();
        System.out.println(sf.getSubsequenceList()); 
    }
    
}
