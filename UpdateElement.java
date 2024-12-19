package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to update an array element by the given element.
public class UpdateElement {

    public static void main(String[] args) {
        List<String> aa = new ArrayList<String>();

        aa.add("2");
        aa.add("4");
        aa.add("8");

        aa.add("16");
        aa.add("64");
        aa.add("128");

        System.out.println("Print Element:- " +aa);

        aa.set(4,"32");
        aa.set(5,"64");

        System.out.println("After Update Element:- " + aa);
    }
}


