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
public class SubsequenceFinder {
    private ArrayList<Integer> arrayList = new ArrayList();
    private ArrayList<Integer> subsequenceList = new ArrayList();
    private ArrayList<Integer> tempList = new ArrayList();
    
    public SubsequenceFinder(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }
    
    public ArrayList<Integer> findSubsequence(){
        System.out.println(this.arrayList);
        for(int i = 0; i < arrayList.size()-1; i++){
            if( arrayList.get(i) < arrayList.get(i+1)){
                tempList.add(arrayList.get(i));
                if(i == arrayList.size() - 2){
                    tempList.add(arrayList.get(i+1));
                    if(tempList.size()>subsequenceList.size()){
                        subsequenceList = (ArrayList)tempList.clone();
                        tempList.clear();
                    }
                }
            }else{
                tempList.add(arrayList.get(i));
                if(i == arrayList.size() - 2 && arrayList.get(i) < arrayList.get(i+1)){
                    tempList.add(arrayList.get(i+1));
                }
                if(tempList.size()>subsequenceList.size()){
                    subsequenceList = (ArrayList)tempList.clone();
                    tempList.clear();
                }
                
            }
        } 
        return subsequenceList;
    }
    public ArrayList<Integer> getSubsequenceList() {
        return subsequenceList;
    } 
    
    public void clearLists(){
        //arrayList.clear();
        subsequenceList.clear();
        tempList.clear(); 
    } 
}
