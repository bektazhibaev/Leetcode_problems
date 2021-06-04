package problemSolving;

public class CanPlaceFlowers_LC_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n){

        int len = flowerbed.length;
        int count = 0;
        int i = 0;

        if(len == 1 && flowerbed[0] == 0 && n >= 0) return true;
        else if(len == 1 && flowerbed[0] == 1 && n >= 1) return false;
        else if(len == 1 && flowerbed[0] == 1 && n == 0) return true;
        else {
            if(flowerbed[0] == 0 && flowerbed[1] == 0 && len > 2){
                count++;
                i++;
                flowerbed[0] = 1;
            }
            for (; i < len-2; i++) {
                if (flowerbed[i] == 0) {
                    if(flowerbed[i+1] == 0 && flowerbed[i+2] == 0) {
                        flowerbed[i+1] = 1;
                        count++;
                        i++;
                    }
                }
            }
            if(flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0){
                count++;
            }
        }

        return count >= n;
    }
}
