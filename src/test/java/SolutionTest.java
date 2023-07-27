import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSortSentence() {
        Solution solution = new Solution();

        String input1 = "hello2 world1";
        String expected1 = "world hello";
        String actual1 = solution.sortSentence(input1);
        assertEquals(expected1, actual1);

        String input2 = "this1 is3 a2 test4";
        String expected2 = "this a is test";
        String actual2 = solution.sortSentence(input2);
        assertEquals(expected2, actual2);

        String input3 = "quick1 brown3 fox2 jumps4";
        String expected3 = "quick fox brown jumps";
        String actual3 = solution.sortSentence(input3);
        assertEquals(expected3, actual3);

        String input4 = "the1 cat2 in3 the4 hat5";
        String expected4 = "the cat in the hat";
        String actual4 = solution.sortSentence(input4);
        assertEquals(expected4, actual4);

        String input5 = "programming2 is1 fun3";
        String expected5 = "is programming fun";
        String actual5 = solution.sortSentence(input5);
        assertEquals(expected5, actual5);

        String input6 = "this1 is2 not3 a4 code5";
        String expected6 = "this is not a code";
        String actual6 = solution.sortSentence(input6);
        assertEquals(expected6, actual6);

        String input7 = "apple1";
        String expected7 = "apple";
        String actual7 = solution.sortSentence(input7);
        assertEquals(expected7, actual7);

        System.out.println("All test cases passed.");
    }
}
