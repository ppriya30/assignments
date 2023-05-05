package com.gradedproject2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.gradedproject2.Sky2;


public class Sky {
    public static List<Integer> no_floor = new LinkedList<>();//taking floor size in random order
    //List<Integer> copylist = new LinkedList<>();
    public static List<Integer> sortlist ;

    //List<Integer> smalllist;   //new LinkedList<>(floorSizes);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of floor");
        int totalfloor = sc.nextInt();
        for(int i = 0; i<totalfloor;i++) {
            System.out.println("no.of floor " + (i + 1));
            int sizeinpu = sc.nextInt();
            //System.out.println("sorted list");
            no_floor.add(sizeinpu);
        }
        sortlist = new LinkedList<>(no_floor);//sort list declare
        Collections.sort(sortlist,Collections.reverseOrder());//sort the elements
        System.out.println("sorted list"+sortlist);

        Sky2 ob2= new Sky2();
        ob2.construction(sortlist,no_floor);

    }
}
