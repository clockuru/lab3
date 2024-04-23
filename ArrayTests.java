import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceOneElem() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test
  public void testReverseInPlaceEmpty() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}
  @Test
  public void testReverseInPlaceOddElems() {
    int[] input1 = { 3, 1, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 1, 3 }, input1);
	}
  @Test
  public void testReverseInPlaceEvenElems() {
    int[] input1 = { 3, 1, 5, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 5, 1, 3 }, input1);
	}


  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedOneElem() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedEvenElems() {
    int[] input1 = { 1, 2, 3, 4 };
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedOddElems() {
    int[] input1 = { 5, 8, 1, 2, 9 };
    assertArrayEquals(new int[]{ 9, 2, 1, 8, 5 }, ArrayExamples.reversed(input1));
  }
}
