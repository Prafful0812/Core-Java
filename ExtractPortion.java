package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {

        List<String> xyz = new ArrayList<String>();
        xyz.add("1");
        xyz.add("2");
        xyz.add("256");
        xyz.add("3");
        xyz.add("4");
        System.out.println("Element:- " +xyz);

        List<String> Abc = xyz.subList(2,4);
        System.out.println("After Extract:- "+ Abc);






    }
}





//
//List<String> sub_List = list_Strings.subList(0, 3);
//  System.out.println("List of first three elements: " + sub_List)