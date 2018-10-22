package simpleArrayList;

public class SimpleArrayTest {

    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println();

        strings.update(1, "Update");
        strings.delete(0);
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.size());
    }
}
