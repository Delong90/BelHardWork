package by.belhard.j24.SelfEducation;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int sum1 = 0;


        for (int i = 0; i<10 ; i++) {sum+=nums[i];System.out.println(nums[i]);}

        for (int x : nums1) {sum+=x;System.out.println(x);}
        String [] arr = new String[]{"a","b","c"};
        for (String x : arr) {
            System.out.println(x);
            if (x=="c") System.out.println(x);
        }

    }

}
