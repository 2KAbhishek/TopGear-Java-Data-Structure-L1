import java.util.Arrays;
import java.util.Vector;

public class MyVectorArrayCopy {
    public static void main(String args[]) {
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector: " + vct);

        String[] arr = new String[vct.size()];
        int i = 0;
        for (String s : vct) {
            arr[i++] = s;
        }

        System.out.println("Copied array: " + Arrays.asList(arr));
    }
}
