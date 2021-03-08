import java.util.LinkedList;

public class MyPushPopOpr {
    public static void main(String a[]) {
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Initial list: " + arrl);
        arrl.push("Zero");
        System.out.println("After push: " + arrl);
        arrl.pop();
        System.out.println("After pop: " + arrl);
    }
}
