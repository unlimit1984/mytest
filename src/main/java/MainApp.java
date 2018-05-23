import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladimir_Vysokomorny on 11-Jan-18.
 */
public class MainApp {
    public static void main(String[] args) {
//        System.out.println(Kata.getMiddle("1"));
//        System.out.println(Vowels.getCount("asdfghjklooO"));


//        HashMap<MyKey, String> map = new HashMap<>();
//
//        MyKey myKey = new MyKey(1);
//        System.out.println(myKey.hashCode());
//        map.put(myKey, "MyValue");
//        map.put(myKey, "MyValue");
//
//        myKey.setI(5);
//
//        map.forEach((myKey1, s) -> System.out.println("Key:"+ myKey1 +",Value:"+s));
//
//        System.out.println(myKey.hashCode());
//
//        System.out.println(map.get(myKey));
//
//        MyKeyChild myKeyChild = new MyKeyChild(5);
//
//        System.out.println(myKeyChild.equals(myKey));


        Map<String, String> map = new HashMap<>();
        System.out.println("1: " + map.put("1", "aaa"));                        //null
        System.out.println("2: " + map.putIfAbsent("2", "bbb"));    //null
        System.out.println("2: " + map.putIfAbsent("2", "BBB"));               //bbb
        System.out.println("3: " + map.computeIfAbsent("3", v -> "ccc"));   //ccc
        System.out.println("3: " + map.computeIfAbsent("3", v -> "CCC"));   //ccc
        System.out.println("4: " + map.computeIfPresent("4", (k, v) -> "ddd"));   //null
        System.out.println("5: " + map.put("5", "eee"));                               //eee
        System.out.println("5: " + map.computeIfPresent("5", (k, v) -> "EEE"));   //EEE
        System.out.println(map);


    }
}
