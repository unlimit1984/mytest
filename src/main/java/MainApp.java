import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Vladimir_Vysokomorny on 11-Jan-18.
 */
public class MainApp {
  public static void main(String[] args) throws IOException {
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

    String path = "files/ąż.txt";

    //Good
//    Path p = Paths.get(path);
//    System.out.println("path parent: " + p.getParent().toString());
//    System.out.println("path: " + p.toString());

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
//    URL url = MainApp.class.getClassLoader().getResource(path);
//    File file = new File(url.getPath());
//    System.out.println("url.getPath(): " + url.getPath());
//    System.out.println("file.getPath(): " + file.getPath());
//    System.out.println("file.getName(): " + file.getName());
//    InputStream is = new FileInputStream(file);
//    String content = IOUtils.toString(is);
//    System.out.println(String.format("The content of file: %s is: \n%s", file.getCanonicalPath(), content));






  }

  private static String getFileName(String cuttedPath){

    return "";
  }
  private static String getFilePath(String cuttedPath){

    return "";
  }
}
