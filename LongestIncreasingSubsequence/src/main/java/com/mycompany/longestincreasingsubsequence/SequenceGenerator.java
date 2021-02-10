/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Rajat
 */
public class SequenceGenerator {
    
    private int n;
    private ArrayList<Integer> arrayList = new ArrayList<>();
    
   public SequenceGenerator(int n){
       this.n = n;
   }
   
   public ArrayList<Integer> generateSequence(){
        arrayList.clear();
        for (int i = 0; i < n; i++) {
            arrayList.add(ThreadLocalRandom.current().nextInt(0,  100));
        }
       return this.arrayList;
   }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
