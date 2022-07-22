package sort;

import com.alibaba.fastjson.JSON;

/**
 * 选择排序 选择最小的(或者最大的)按照顺序排列
 *
 * @author : Woods
 * @ClassName : selectionSort
 * @date : 2022/3/30  1:55 下午
 * @Version ：1.0
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arraysA = new int[]{1, 2, 4, 3, 5, 6, 7};
        int[] arraysB = new int[]{89, 67, 69, 4, 10, 6, 7};
        int[] mySort = mySelectionSort(arraysB);
        int[] mySortA = mySelectionSort(arraysA);
        System.out.println(JSON.toJSONString(mySort));
        System.out.println(JSON.toJSONString(mySortA));
    }

    static int[] mySelectionSort(int[] arrays) {
        //最后一个元素不用比较, 其他的已经有序, 该元素自然就有序了
        for (int i = 0; i < arrays.length - 1; i++) {
            //记录一轮比较中最大的数的下标
            int maxNumIndex = i;
            //i+1是自己不和自己比较,
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] > arrays[maxNumIndex]) {
                    maxNumIndex = j;
                }
            }
            //把最大的数放到排好的后面
            int temp = arrays[maxNumIndex];
            arrays[maxNumIndex] = arrays[i];
            arrays[i] = temp;
        }
        return arrays;
    }
}
