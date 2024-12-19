package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to iterate through all elements in an array list.
public class Iterate {
    public static void main(String[] args) {

        List<String> abc = new ArrayList<String>();

        abc.add("ABC");
        abc.add("DEF");
        abc.add("GHI");
        abc.add("JKL");
        abc.add("MNO");
        abc.add("PQR");

        for (String element : abc) {
            System.out.println(element);
        }
    }
}
