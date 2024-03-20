import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // Max of candies
        int max = candies[0];
        for(int i=1; i< candies.length; i++) {
            if(max<candies[i]) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<Boolean>();
        for(int i=0; i < candies.length; i++) {
            result.add(max <= candies[i]+extraCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> result = new KidsWithTheGreatestNumberOfCandies1431().kidsWithCandies(candies, extraCandies);
        for(boolean r: result) {
            System.out.print(r);
            System.out.print(" ");
        }
    }
}
