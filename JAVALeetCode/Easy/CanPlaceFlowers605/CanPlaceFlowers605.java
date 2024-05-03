package JAVALeetCode.Easy.CanPlaceFlowers605;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerBed, int n) {
        int n_temp = 0;
        if ((flowerBed.length==1 && flowerBed[0] == 0)
        || (flowerBed.length>=2 && flowerBed[0] == 0 && flowerBed[1] == 0)){
            n_temp++;
            flowerBed[0]=1;
        }
        for(int i = 0; i < flowerBed.length - 2 ; i ++) {
            boolean flag = true;
            for(int j = i; j < i+3; j++) {
                if (flowerBed[j] != 0) {
                    flag = false;
                    i=j;
                    break;
                }
            }
            if (flag) {
                n_temp++;
                flowerBed[i+1] = 1;
                i++;
            }
        }
        if (flowerBed.length>2 && flowerBed[flowerBed.length-1] == 0 && flowerBed[flowerBed.length-2] == 0) {
            n_temp++;
            flowerBed[flowerBed.length-1]=1;
        }

        return n<=n_temp;
    }

    public static void main(String[] args) {
        int[] flowerBed1 = { 1, 0, 0, 0, 1 };
        System.out.println(new CanPlaceFlowers605().canPlaceFlowers(flowerBed1, 1)); // true
        int[] flowerBed2 = { 0, 0, 1, 0, 0 };
        System.out.println(new CanPlaceFlowers605().canPlaceFlowers(flowerBed2, 3)); // false
    }
}
