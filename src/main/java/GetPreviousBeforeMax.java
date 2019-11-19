import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GetPreviousBeforeMax {

  public static int getPreviousBeforeMax(List<Integer> list) {
    Set<Integer> set = new TreeSet<>(list);
    List<Integer> reversedList = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    if (reversedList.size() == 0) {
      throw new RuntimeException();
    } else if (reversedList.size() == 1) {
      return reversedList.get(0);
    } else {
      return reversedList.get(1);
    }


//    int max;
//    int beforeMax;
//
//    if (list.size() == 0) {
//      return 0;
//    } else if (list.size() == 1) {
//      return list.get(0);
//    } else if (list.size() == 2) {
//      return Math.min(list.get(0), list.get(1));
//    } else {
//      max = beforeMax = list.get(0);
//      Collections.sort(list);
//      Collections.reverse(list);
//
//      for (int e : list) {
//        if (e > max) {
//          if()
//          beforeMax = max;
//          max = e;
//        }
//      }
//      return beforeMax;
//    return 0;
  }
}

