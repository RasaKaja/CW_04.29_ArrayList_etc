package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> origList = new ArrayList<>();

    void addToList(String text){
        System.out.println("Please input the text or 'quit' if you finished: ");
        do {
            text = scanner.nextLine();
            origList.add(text); // ArrayList.add is used to add Item to the ArrayList
            //this.origList.add(text); // ArrayList.add is used to add Item to the ArrayList
        } while (!text.equalsIgnoreCase("quit"));
    }

    void getDistinct(){
        List<String> listUnique = origList.stream().distinct().collect(Collectors.toList());
        listUnique.remove("quit");
        System.out.println("Array List of Unique Values:");

        // iterate through list
        for (String strText : listUnique)
            System.out.println(strText);
    }
}

