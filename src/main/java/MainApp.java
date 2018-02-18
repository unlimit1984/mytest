import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * Created by Vladimir_Vysokomorny on 11-Jan-18.
 */
public class MainApp {
    public static void main(String[] args) {
//        System.out.println(Kata.getMiddle("1"));
//        System.out.println(Vowels.getCount("asdfghjklooO"));


        HashMap<MyKey, String> map = new HashMap<>();

        MyKey myKey = new MyKey(1);
        System.out.println(myKey.hashCode());
        map.put(myKey, "MyValue");

        myKey.setI(5);

        map.forEach((myKey1, s) -> System.out.println("Key:"+ myKey1 +",Value:"+s));

        System.out.println(myKey.hashCode());

        System.out.println(map.get(myKey));

        MyKeyChild myKeyChild = new MyKeyChild(5);

        System.out.println(myKeyChild.equals(myKey));

    }
}
