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

    /***
     * 思路:
     * 数组包含了0 到 n 所有的数 其中少了一个 创建一个n+1的数组 包含缺少的那个数
     * 第一个数组中 将数字放到第二个数组的对应索引的地方
     * index  value
     * 0       0
     * 1        1
     * 2        2
     * 3        3
     * 4        0
     * 5        5
     * 6        6
     *第二个数组中对应的值就像这样 只要查看索引和值不一样的那个数据 其索引便是确实的数字
     * 这套算法中需要对第一个数组循环一遍 执行n-1次
     * 对第二个数组循环一遍 最坏结果 执行n次
     * 一共 2n-1 时间复杂度为O(n)
     */
}
