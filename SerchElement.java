package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class SerchElement {
    public static void main(String[] args) {

        List<String> xyz = new ArrayList<String>();
        xyz.add("1");
        xyz.add("2");
        xyz.add("256");
        xyz.add("3");
        xyz.add("4");

        System.out.println("Element:- " +xyz);

        if(xyz.contains("256")){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }
    }
}