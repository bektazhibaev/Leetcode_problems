package problemSolving;

/**
 * Leetcode - Count Primes #204.
 * NOTE: This solution exceeds the time.
 * Working on a better solution.
 */

public class CountPrimes_LC_204 {

    public int countPrimes(int n) {
        int count = 0;
        if(n == 1 || n == 0){
            return 0;
        }
        for (int i = 2; i < n; i++){
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    if(i == j){
                        count++;
                    }else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
