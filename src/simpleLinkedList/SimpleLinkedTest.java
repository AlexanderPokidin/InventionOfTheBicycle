package simpleLinkedList;

public class SimpleLinkedTest {

    public static void main(String[] args) {

        stringTest();

        intTest();
    }

    private static void stringTest() {
        SimpleLinkedList<String> stringList = new SimpleLinkedList<>();
        stringList.addLast("First");
        stringList.addLast("Second");
        stringList.addLast("Third");
        stringList.addFirst("New first");
        System.out.println(stringList.size());

        System.out.println();
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.getElementByIndex(i));

        }
    }

    private static void intTest() {
        SimpleLinkedList<Integer> intList = new SimpleLinkedList<>();

        for (int i = 0; i < 50; i++) {
            intList.addLast(i);
            intList.addFirst(i);
        }

        System.out.println("---------------------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.print(intList.getElementByIndex(i));
            System.out.print(" ");
        }
    }
}
