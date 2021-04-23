import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author 陈正龙
 * @date 2021/4/22 10:04
 */
public class 消失的数字 {
    public static void main(String[] args) {
        /***
         * 描述 : 数组nums中包含0 到 n中所有的整数 但是其中缺了一个 请找出这个数字 并且时间复杂度为0(N)
         */
        int[] arr= {3,0,2};
        int lost = getLost(arr);
        System.out.println("lost = " + lost);

    }

    static int getLost(int[] nums) {
        int[]temp=  new int[nums.length+1];
        for (int num : nums) {
            temp[num]=num;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=i){
                return i;
            }
        }
        return -1;
    }
}
