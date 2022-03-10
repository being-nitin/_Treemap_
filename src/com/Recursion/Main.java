package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Treemap implementation.
        /*
        It is same as tree only the difference is ,now the kwy value pair will be
        sorted in this.
         */
        Map <String,Integer> tmp = new TreeMap<>();
        tmp.put("nitin",20);
        tmp.put("nitish",21);
        tmp.put("alok",23);
        tmp.put("ravit",24);


        // to remove a particular key value pair
        tmp.remove("nitish");
        System.out.println(tmp);

    }
}
