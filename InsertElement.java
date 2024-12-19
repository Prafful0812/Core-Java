package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to insert an element into the array list at the first position.
public class InsertElement {
    public static void main(String[] args) {

        List<String> abc = new ArrayList<String>();

        abc.add("A");
        abc.add("B");
        abc.add("C");
        abc.add("D");
        abc.add("E");
        abc.add("F");

        System.out.println("Print the Element:- "+ abc);

        abc.add(0, "Alphabets");
        abc.add(4, " ");

        System.out.println("After Add Element:- " + abc);

    }
}
