import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GetPreviousBeforeMaxTest {

  @Test
  public void testEmptyList() {
    assertThrows(RuntimeException.class, () ->
        GetPreviousBeforeMax.getPreviousBeforeMax(Collections.emptyList()));
  }

  @Test
  public void testOneElement() {
    List<Integer> list = Arrays.asList(5);
    assertEquals(5, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }

  @Test
  public void testTwoDifferentElements() {
    List<Integer> list = Arrays.asList(5, 7);
    assertEquals(5, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }

  @Test
  public void testTwoEqualElements() {
    List<Integer> list = Arrays.asList(5, 5);
    assertEquals(5, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }

  @Test
  public void testDifferentElements() {
    List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
    assertEquals(4, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }

  @Test
  public void testDifferentElements1() {
    List<Integer> list = Arrays.asList(5, 5);
    assertEquals(5, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }

  @Test
  public void testDifferentElements2() {
    List<Integer> list = Arrays.asList(5, 5, 5, 4);
    assertEquals(4, GetPreviousBeforeMax.getPreviousBeforeMax(list));
  }
}