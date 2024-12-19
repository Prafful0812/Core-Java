package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from an array list.
public class RemoveElement {

    public static void main(String[] args) {

        List<String> bb = new ArrayList<String>();

        bb.add("1");
        bb.add("2");
        bb.add("256");
        bb.add("3");
        bb.add("4");

        System.out.println("Prnt The Elements:- "+ bb);
        bb.remove(2);
        System.out.println("After Remove 3rd Element:- " +bb);
    }
}
