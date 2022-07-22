package sort;

import com.alibaba.fastjson.JSON;

/**
 * @author : Woods
 * @ClassName : bubbleSort
 * @date : 2022/3/29  3:31 下午
 * @Version ：1.0
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arraysA = new int[]{1,2,4,3,5,6,7};
        int[] arraysB = new int[]{89,67,69,4,10,6,7};
        int[] mySort = mySort(arraysB);
        int[] mySortA = mySort(arraysA);
        System.out.println(JSON.toJSONString(mySort));
        System.out.println(JSON.toJSONString(mySortA));
    }

    /**
     * 依次两两比较, 小的(或者大的)往后放, 直到比较完
     * 优化的方案是可以在比较的里面加一个flag, 是否交换过的标志,如果没交换过,则证明已经有序,不用再进行比较
     * @param arrays 需要排序的数组
     * @return 排序后的数组
     */
    static int[] mySort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                //开始两两比较
                if (arrays[j] > arrays[j+1]) {
                    //先把i位置暂存一下
                    int temp = arrays[j];
                    //把j+1位置的元素赋给j位置
                    arrays[j] = arrays[j+1];
                    //再把原j位置的元素赋给j+1
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }

}
