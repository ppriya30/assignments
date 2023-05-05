package com.gradedproject2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import static com.gradedproject2.Sky.no_floor;
import static com.gradedproject2.Sky.sortlist;

public class Sky2 {
    //Collections.sort(sortlist,Collections.reverseOrder());//sort the elements
    void construction(List<Integer>slist,List<Integer>floors){
        Sky ob= new Sky();
        List<Integer>construct_list= new LinkedList<>();
        int i=1;
        //for(int i=1;i<=slist.size();i++)
        while (i<=slist.size()){
            //System.out.println("Day 1 :");
            int big=slist.get(i);//big no. from sorted list
            for(int j=1;j<=floors.size();j++){
                //System.out.println("OOOO");
                if(construct_list.isEmpty()==true || construct_list.isEmpty()==false){
                    //System.out.println("&&");
                    try{
                        if(big==floors.get(j)){
                            //System.out.println("**");
                            construct_list.add(floors.get(j));
                            Collections.sort(construct_list,Collections.reverseOrder());
                            break;
                        }
                        else{
                            construct_list.add(floors.get(j));
                        }

                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Index out of bound");
                    }

                }

            }
            i++;
            System.out.println("construction list"+construct_list);
            for(int k=0;k< construct_list.size();k++){
                if(slist.get(i)==construct_list.get(k)){
                    System.out.println("Day "+(i+1));
                    System.out.print(construct_list+" _ ");
                    i++;

                }
                else {
                    construct_list.removeAll(construct_list);
                }
            }


        }

    }

}
