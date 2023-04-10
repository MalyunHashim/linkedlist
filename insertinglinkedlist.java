package linkedlist;

import java.util.LinkedList;

public class insertinglinkedlist {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<String>();
        languages.add("c");
        languages.add("C++");
        languages.add("HTML");
        languages. add("JAVASCRIPT");
        languages.add("PYTHON");
        languages.add("CSS");
        languages.add("SQL");
        languages. add("PHP");
        languages.add("BOOTSTRAP");
        languages.add("JAVA");
        System.out.println("this is the list before inserting\n" +languages);

        languages.add(5,"postgres");

        System.out.println("this is the list after inserting  index 5\n"+languages );
    }
}
