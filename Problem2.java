import java.util.ArrayList;
import java.util.List;

public class Problem2 {


    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }


        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }

        }

        return result;

    }
}

/*
Time complexity : O(n)
Space complexity : O(1)
Problems faced : no
*/
