
class TwoSums {
    public int[] check(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}



public class check {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        TwoSums x = new TwoSums();

        int[] res= x.check(nums, target);
        System.out.println(res[0]+" " +res[1]);

    }
}