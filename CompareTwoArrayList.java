package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
    public static void main(String[] args) {

    List<String> abc = new ArrayList<String>();
    abc.add("What ");
    abc.add("is");
    abc.add("your");
    abc.add("Name");

    List<String> abc1 = new ArrayList<String>();
    abc1.add("What ");
    abc1.add("is");
    abc1.add("your");
    abc1.add("FullName");

    System.out.println(abc);
    System.out.println(abc1);
    System.out.println("After Compare Two List");
    System.out.println(abc.equals(abc1));
}
}