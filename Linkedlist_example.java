import java.util.LinkedList;

public class Linkedlist_example {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        list.add(2, "Angular");
        list.addFirst("HTML");
        list.addLast("React");

        System.out.println(list);

        list.remove();
        list.remove(2);
        list.remove("C++");

        list.set(1, "NodeJS");

        System.out.println(list);

        System.out.println(list.contains("Java"));
        System.out.println("Size: " + list.size());

        for (String lang : list) {
            System.out.println(lang);
        }

        list.clear();
        System.out.println(list);
    }
}
