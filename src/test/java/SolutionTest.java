import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countNegativesTest1() {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        int output = 8;
        Assert.assertEquals(output, new Solution().countNegatives(grid));
    }


    @Test
    public void countNegativesTest2() {
        int[][] grid = {
                {3, 2},
                {1, 0}
        };
        int output = 0;
        Assert.assertEquals(output, new Solution().countNegatives(grid));
    }

    @Test
    public void countNegativesTest3() {
        int[][] grid = {
                {5, 1, 0},
                {-5, -5, -5}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().countNegatives(grid));
    }
}
