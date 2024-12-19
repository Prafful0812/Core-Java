package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayListToOther {
    public static void main(String[] args) {

        List<String> List = new ArrayList<String>();
        List.add("A");
        List.add("B");
        List.add("C");
        List.add("D");
        System.out.println("List :- "+ List);

        List<String> List1 = new ArrayList<String>();
        List1.add("a");
        List1.add("b");
        List1.add("c");
        List1.add("d");
        System.out.println("List1 :- "+List1);
        System.out.println("============================");

        Collections.copy(List1,List);
        System.out.println("After Copy:- ");
        System.out.println("List :- "+ List);
        System.out.println("List1 :- "+List1);
    }
}



