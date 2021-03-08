import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyElementCheck {
    public static void main(String args[]) {
        Vector<String> v = new Vector<>();
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Random");
        System.out.println("Vector: " + v);

        ArrayList<String> ar = new ArrayList<>();
        ar.add("First");
        ar.add("Random");
        System.out.println("Has " + ar + " : " + checkElements(v, ar));

        ar.remove(0);
        ar.add(0, "One");
        System.out.println("Has " + ar + " : " + checkElements(v, ar));
    }

    private static boolean checkElements(Vector<String> v, ArrayList<String> ar) {
        for (String s : ar) {
            if (!v.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
