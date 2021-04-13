package problemSolving;

/**
 * Leetcode: 70. Climbing Stairs
 */

public class ClimbingStairs_LC_70 {

    public int climbStairs(int n) {
        var f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        var i = 2;
        while(i <= n) {
            f[i] = f[i -1] + f[i -2];
            i++;
        }
        return f[n];
    }
}
