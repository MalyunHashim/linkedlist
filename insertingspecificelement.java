package linkedlist;

import java.util.LinkedList;

public class insertingspecificelement {
    public static void main(String[] args) {
        LinkedList<String> languages= new LinkedList<String>();
        languages.add("java");
        languages.add("phl");
        languages.add("c++");
        languages.add("c");
        languages.add("javascript");
        System.out.println("before inserting\n"+languages);
        languages.add(0,"java");
        languages .add(4, "c++");
        System.out.println("after inserting first and last index \n" + languages);

    }
}
