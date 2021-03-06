import org.apache.commons.collections4.CollectionUtils;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vladimir_Vysokomorny on 11-Jan-18.
 */
public class MainApp {
    public static void main(String[] args) throws URISyntaxException {
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


//        Map<String, String> map = new HashMap<>();
//        System.out.println("1: " + map.put("1", "aaa"));                        //null
//        System.out.println("2: " + map.putIfAbsent("2", "bbb"));    //null
//        System.out.println("2: " + map.putIfAbsent("2", "BBB"));               //bbb
//        System.out.println("3: " + map.computeIfAbsent("3", v -> "ccc"));   //ccc
//        System.out.println("3: " + map.computeIfAbsent("3", v -> "CCC"));   //ccc
//        System.out.println("4: " + map.computeIfPresent("4", (k, v) -> "ddd"));   //null
//        System.out.println("5: " + map.put("5", "eee"));                               //eee
//        System.out.println("5: " + map.computeIfPresent("5", (k, v) -> "EEE"));   //EEE
//        System.out.println(map);

//    String path = "files/ąż.txt";

        //BAD
//    URL resourceUrl = MainApp.class.getClassLoader().getResource(path);
//    File f = new File(resourceUrl.getFile());
//    System.out.println("fileName: " + f.getName());
//    System.out.println("filePath: " + f.getPath());


        //Good in Linux/Windows, bad in docker runtime Container aem
//    Path p = Paths.get(path);
//    System.out.println("path parent: " + p.getParent().toString());
//    System.out.println("path: " + p.toString());
//    System.out.println("path fileName: " + p.getFileName());

//    Path p = Paths.get(MainApp.class.getClassLoader().getResource(path).toURI());
//    System.out.println("path parent: " + p.getParent().toString());
//    System.out.println("path: " + p.toString());
//    System.out.println("path fileName: " + p.getFileName());

        //GOOD
//    Path p = Paths.get(MainApp.class.getClassLoader().getResource(path).toURI());
//    File f = p.toFile();
//    InputStream is = new FileInputStream(f);
//    String content = IOUtils.toString(is);
//    System.out.println(String.format("The content of file %s: %s is: \n%s", f.getName(), f.getPath(), content));

        //GOOD
//    URL resourceUrl = MainApp.class.getClassLoader().getResource(path);
//    File file = Paths.get(resourceUrl.toURI()).toFile();
//    System.out.println(file.getName());
//    System.out.println(file.getPath());


        //Good for not existing file
//    File f = new File("deed/ść.txt");
//    System.out.println(f.getName());
//    System.out.println(f.getPath());


        //Good
//    InputStream is = MainApp.class.getResourceAsStream(path/*"files/ąż.txt"*/);
//    String content = IOUtils.toString(is);
//    System.out.println(String.format("The content of file: %s is: \n%s", path, content));

        //Good (inside target folder)
//    InputStream is = MainApp.class.getClassLoader().getResourceAsStream(path);
//    String content = IOUtils.toString(is);
//    System.out.println(content);

        //Bad for non UTF-8 file names
//    path = "files/abc.txt";   //uncomment
//    URL resourceUrl = MainApp.class.getClassLoader().getResource(path);
//    File file = new File(resourceUrl.getPath());
//    InputStream is = new FileInputStream(file);
//    String content = IOUtils.toString(is);
//    System.out.println(String.format("The content of file: %s is: \n%s", file.getCanonicalPath(), content));

        //Bad (Can't create a File object)
//    InputStream is = MainApp.class.getClassLoader().getResourceAsStream(path);
//    FileInputStream fis = new FileInputStream(path);
//    File file = new File();


//    Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
//    System.out.println(set);

//    List<String> list = null;
//    for (String s : list) {
//      System.out.println(s);
//
//    }

//    StackTraceElement[] stackTraceElements = Thread.getAllStackTraces().get(Thread.currentThread());
//    //stackTraceElements.length
//    for (int i = 0; i <= 100; i++) {
//      StackTraceElement element = stackTraceElements[i];
//      System.out.println(String.format("%s.%s line %s", element.getClassName(), element.getMethodName(), element.getLineNumber()));
//    }
//    if(stackTraceElements.length > 100) {
//      System.out.println("and more...");
//    }


//    Object o = Optional.ofNullable(null);
//    System.out.println(Objects.isNull(o));

//        String systemName;
//        if (true) {
//            systemName = null;
//        }
//        String email = "test@mail.com";
////        String externalId = systemName != null ? systemName : email;
//
//        String externalId = Optional.ofNullable(systemName).orElse(email);
//        System.out.println(externalId);


        List<String> arr = Arrays.asList("ab", "cd", "ef");
        List<String> arr2 = new ArrayList<>();
        List<String> arr3 = null;

        System.out.println(CollectionUtils.isEmpty(arr));
        System.out.println(CollectionUtils.isEmpty(arr2));
        System.out.println(CollectionUtils.isEmpty(arr3));

        System.out.println(CollectionUtils.isNotEmpty(arr));
        System.out.println(CollectionUtils.isNotEmpty(arr2));
        System.out.println(CollectionUtils.isNotEmpty(arr3));



    }

    //arr = [1,2,3,4,5,6,7,8,9,10] sum = 8
    private static boolean hasPairWithSumForSortedArray(int[] arr, int sum) {
        int min = 0;
        int max = arr.length - 1;
        while (min < max) {
            int s = arr[min] + arr[max];
            if (s == sum) {
                return true;
            } else if (s < sum) {
                min++;
            } else {
                max--;
            }
        }
        return false;
    }

    // arr = [5,1,4,4,2,8,6,4,7,5,6,6,3,2,9] sum = 8
    private static boolean hasPairWithSumForUnsortedArray(int[] arr, int sum) {
        Set<Integer> oldValues = new HashSet<>();
        for (int value : arr) {
            if (oldValues.contains(sum - value)) {
                return true;
            } else {
                oldValues.add(value);
            }
        }
        return false;
    }
}

