package lesson4.syntax;

import java.util.TreeSet;

public class DistinctMaximum {

    public static void main(String[] args) {

        Integer [] a = {1, 3, 2, -2, -4, -9};
        System.out.println(thirdMaxValue(a));

        Integer [] b = {1, 8};
        System.out.println(thirdMaxValue(b));

        Integer [] c = {8, 8, 8, 15, 1555, -15, 236, 236, 18};
        System.out.println(thirdMaxValue(c));

        Integer [] d = {0, -18, 22, 22, -22, 1587, 17};
        System.out.println(thirdMaxValue(d));

        Integer [] e = {14, 14};
        System.out.println(thirdMaxValue(e));

        Integer [] f = {10};
        System.out.println(thirdMaxValue(f));

        Integer [] g = {-10, -17, 0, -158, 2};
        System.out.println(thirdMaxValue(g));

        Integer [] h = {588888888, 5252, -555555555, -555555555, 0, 156};
        System.out.println(thirdMaxValue(h));

        Integer [] i = {18, 18, 18, 18, 18};
        System.out.println(thirdMaxValue(i));

        Integer [] j = {0};
        System.out.println(thirdMaxValue(j));
    }

        public static String thirdMaxValue (Integer nums[]) {
            TreeSet<Integer> set = new TreeSet<Integer>();

            for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
            }

            Integer[] nums2 = new Integer[set.size()];
            nums2 = set.toArray(nums2);

            System.out.println(set);
            if (nums2.length == 0) {
                return "Array is empty";
            }
            else if (nums2.length > 2) {
                return String.format("The third distinct maximum is %s", nums2[nums2.length-3]);
            }
            else {
                return String.format("The maximum is: %s", nums2[nums2.length-1]);
            }
        }

 /*     Or the second solution:

        public static int thirdMaxValue(int[] nums) {
        TreeSet<Integer> result = new TreeSet();
        for (int num : nums) {
            result.add(num);
        }
        if (result.size() >= 3) {
            result.pollLast();
            result.pollLast();
        }
        return result.last();
    }*/

}