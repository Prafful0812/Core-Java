package CollectionsPrograms;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetrieveAnElement {
    public static void main(String[] args) {

        List<String> abc = new ArrayList<String>();

        abc.add("My");
        abc.add("is");
        abc.add("Prafful");
        abc.add("Roundale");

        System.out.println("Question are:- " + abc);
        System.out.println("======================");

        abc.add(1,"Name");
        System.out.println("Correct Question are :- " + abc);
        System.out.println("======================");

        String element = abc.get(3);
        System.out.println("Retrive Element form Array List:- " + element);

    }
}

