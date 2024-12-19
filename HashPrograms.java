package CollectionsPrograms;

import java.util.*;

public class HashPrograms {
        public static void main(String[] args) {

            HashSet<String> hass = new HashSet<String>();
            hass.add("Mercidies");
            hass.add("BMW");
            hass.add("Lamborghini");
            hass.add("Bugatti");
            hass.add("Porch");
            hass.add("MG Hector");

            HashSet<String> hass1 = new HashSet<String>();
            hass1.add("100");
            hass1.add("200");
            hass1.add("150");
            hass1.add("300");
            hass1.add("250");
            hass1.add("350");

            //Write a Java program to append the specified element to the end of a hash set.
            System.out.println("The Hash Set: " + hass);
            System.out.println("=====================");

            //Write a Java program to iterate through all elements in a hash list.
            Iterator<String> Ii = hass.iterator();
            while (Ii.hasNext()) {
                System.out.println(Ii.next());
            }
            System.out.println("=====================");


            //Write a Java program to get the number of elements in a hash set.
            System.out.println("Original Hash Set: " + hass);
            System.out.println("Size of the Hash Set: " + hass.size());
            System.out.println("=====================");

            //Write a Java program to empty an hash set.
//            System.out.println("Original Hash Set: " + hass);
//            hass.removeAll(hass);
//            System.out.println("Hash Set after removing all the elements "+hass);
//            System.out.println("=====================");

            //Write a Java program to test if a hash set is empty or not.
            System.out.println("Original Hash Set: " + hass);
            System.out.println("Checking the above array list is empty! "+hass.isEmpty());
            System.out.println("=====================");

            //Write a Java program to clone a hash set to another hash set.
            System.out.println("Original Hash Set: " + hass);
            HashSet <String> newhass = new HashSet <String> ();
            newhass = (HashSet)hass.clone();
            System.out.println("Cloned Hash Set: " + newhass);
            System.out.println("=====================");

            //Write a Java program to convert a hash set to an array.
            System.out.println("Original Hash Set: " + hass);
            String[] array = new String[hass.size()];
            hass.toArray(array);
            System.out.println("Array elements: ");
            for(String element : array){
                System.out.println(element);
            }
            System.out.println("=====================");

            //Write a Java program to convert a hash set to a tree set.
            System.out.println("Original Hash Set: " + hass);
            Set<String> tree = new TreeSet<String>(hass);
            System.out.println("TreeSet elements: ");
            for(String element : tree){
                System.out.println(element);
            }
            System.out.println("=====================");

            //Write a Java program to find numbers less than 7 in a tree set.

            //Write a Java program to compare two hash set.
            HashSet<String> Check = new HashSet<String>();
            for (String element : hass){
                System.out.println(hass1.contains(element) ? "Yes" : "No");
            }








        }

}
