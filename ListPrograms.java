package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrograms {
    public static void main(String[] args) {

        List<String> List1 = new ArrayList<String>();
        List1.add("Red");
        List1.add("Yellow");
        List1.add("Black");
        List1.add("Orange");
        List1.add("Green");
        List1.add("Purple");
        List1.add("Blue");

        ArrayList<String> List2 = new ArrayList<String>(9);
        List2.add("10");
        List2.add("50");
        List2.add("20");
        List2.add("60");
        List2.add("30");
        List2.add("70");
        List2.add("40");
        System.out.println(" ");

        //Write a Java program to create an array list, add some colors (strings) and print out the collection.
        System.out.println("Colour List:- " + List1);
        System.out.println("======================");

        //Write a Java program to iterate through all elements in an array list.
        System.out.println("Iterate Elements");
        for (String element : List1) {
            System.out.print(" " +element);
        }
        System.out.println(" ");
        System.out.println("======================");

        //Write a Java program to insert an element into the array list at the first position.
        List1.add(7, "Rainbow");
        System.out.println("After Insert Element:- " + List1);
        System.out.println("======================");

        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        String element = List1.get(3);
        System.out.println("Retrive Element form Array List:- " + element);
        System.out.println("======================");

        //Write a Java program to update an array element by the given element.
        List1.set(4,"Colour");
        System.out.println("After Update Element:- " + List1);
        System.out.println("======================");

        //Write a Java program to remove the third element from an array list.
        List1.remove(3);
        System.out.println("After Remove 3rd Element:- " +List1);
        System.out.println("======================");

        //Write a Java program to search for an element in an array list.
        if(List1.contains("Colour")){
            System.out.println("Element Found:- Colour");
        }else{
            System.out.println("Element not found");
        }
        System.out.println("======================");

        //Write a Java program to sort a given array list.
        System.out.println("Given Element:- "+List2);
        Collections.sort(List2);
        System.out.println("After Sorting:- "+List2);
        System.out.println("======================");

        //Write a Java program to copy one array list into another.
//        System.out.println("List1 :- "+ List1);
//        System.out.println("List2 :- "+ List2);
//        Collections.copy(List1,List2);
//        System.out.println("After Copy:- ");
//        System.out.println("List1 :- "+ List1);
//        System.out.println("List2 :- "+ List2);
//        System.out.println("======================");

        //Write a Java program to shuffle elements in an array list.
        System.out.println("Given Element:- " + List2);
        Collections.shuffle(List2);
        System.out.println("After Suffle:- " + List2);
        System.out.println("======================");

        //Write a Java program to reverse elements in an array list.
        System.out.println("Given Element:- " + List2);
        Collections.reverse(List2);
        System.out.println("After Reverse:- " + List2);
        System.out.println("======================");

        //Write a Java program to extract a portion of an array list.
        System.out.println(List1);
        System.out.println("After Extract:- "+ List1.subList(2,3));
        System.out.println("======================");

        //Write a Java program to compare two array lists.
        System.out.println("After Compare Two List");
        System.out.println(List1.equals(List2));
        System.out.println("======================");

        //Write a Java program that swaps two elements in an array list.
        System.out.println("Before Swapping:- " +List2);
        Collections.swap(List2,2,3);
        System.out.println("After Swapping:- "+List2);
        System.out.println();
        System.out.println("======================");

       //Write a Java program to join two array lists.
       ArrayList<String> join = new ArrayList<String>();
       join.addAll(List1);
       join.addAll(List2);
       System.out.println("After Joining:- " + join );
       System.out.println("======================");


       
        //Write a Java program to clone an array list to another array list.


        //Write a Java program to empty an array list.
//        System.out.println("Given Element: " + List1);
//        List1.removeAll(List1);
//        System.out.println("Array remove all elements "+List1);
//        System.out.println("======================");

        //Write a Java program to test whether an array list is empty or not.
        System.out.println("List1:- "+List1);
        System.out.println("List2:- "+List2);
        System.out.println("Checking the above array list is empty "+List1.isEmpty());
        System.out.println("Checking the above array list is empty "+List2.isEmpty());
        System.out.println("======================");

        //Write a Java program for trimming the capacity of an array list.
        System.out.println("Original array list: " + List2);
        System.out.println("Let trim to size the above array: ");
        List2.trimToSize();
        System.out.println(List2);
        System.out.println("======================");

        //Write a Java program to increase an array list size.
        System.out.println("Original array list: " + List2);
        //Increase capacity
        List2.ensureCapacity(6);
        List2.add("WhiteYellow");
        List2.add("BlueGreen");
        List2.add("RedPink");
        System.out.println("New array list: " + List2);
        System.out.println("======================");

        //Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println("Original array list: " + List1);
        String Replacecolor = "PurpleRed";
        List1.set(1,Replacecolor);
        int num=List1.size();
        System.out.println("Replace second element with 'PurpleRed'.");
        for(int i=0;i<num;i++)
            System.out.println(List1.get(i));
        System.out.println("======================");

        //Write a Java program to print all the elements of an ArrayList using the elements' position.
        System.out.println("Original array list: " + List2);
        System.out.println("Print using index of an element: ");
        int PosElement = List2.size();
        for (int index = 5; index < PosElement; index++)
            System.out.println(List2.get(index));
    }
}
