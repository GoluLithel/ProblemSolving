package JAVALeetCode.Easy.CanPlaceFlowers605;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int n_temp = 0;
        if ((flowerbed.length==1 && flowerbed[0] == 0)
        || (flowerbed.length>=2 && flowerbed[0] == 0 && flowerbed[1] == 0)){
            n_temp++;
            flowerbed[0]=1;
        }
        for(int i = 0; i < flowerbed.length - 2 ; i ++) {
            boolean flag = true;
            for(int j = i; j < i+3; j++) {
                if (flowerbed[j] != 0) {
                    flag = false;
                    i=j;
                    break;
                }
            }
            if (flag) {
                n_temp++;
                flowerbed[i+1] = 1;
                i++;
            }
        }
        if (flowerbed.length>2 && flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) {
            n_temp++;
            flowerbed[flowerbed.length-1]=1;
        }

        return n<=n_temp;
    }

    public static void main(String[] args) {
        int[] flowerbed1 = { 1, 0, 0, 0, 1 };
        System.out.println(new CanPlaceFlowers605().canPlaceFlowers(flowerbed1, 1)); // true
        int[] flowerbed2 = { 0, 0, 1, 0, 0 };
        System.out.println(new CanPlaceFlowers605().canPlaceFlowers(flowerbed2, 3)); // false
    }
}
