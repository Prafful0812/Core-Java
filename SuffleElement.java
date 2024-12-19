package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleElement {
    public static void main(String[] args) {
        List<String> m = new ArrayList<String>();
        m.add("A");
        m.add("B");
        m.add("F");
        m.add("E");
        m.add("C");
        m.add("D");
        m.add("H");
        m.add("G");

        System.out.println("Given Element:- " + m);
        Collections.shuffle(m);
        System.out.println("After Sorting:- " + m);

    }
}
