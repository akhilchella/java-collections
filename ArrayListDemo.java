import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args){
        System.out.println("this is ArrayList  Tutorial");
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("akj");
        ar1.add("sde");
        ar1.add("che");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("bpu");
        ar2.add("csalkc");
        ar2.add("sfhd");
        System.out.println(ar2);
        System.out.println("------------");
        System.out.println(ar1);

        ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("hey", "hello", "sir"));
        System.out.println(ar5);
        int i = ar5.lastIndexOf("si");
        System.out.println(i);
    }
}
