package sort;

import com.alibaba.fastjson.JSON;

/**
 * 插入排序, 从第二个元素开始和前面的元素比较, 将元素插到合适的位置, 最终形成有序
 * @author : Woods
 * @ClassName : insertionSorting
 * @date : 2022/3/30  3:08 下午
 * @Version ：1.0
 */
public class insertionSorting {
    public static void main(String[] args) {
        int[] arraysA = new int[]{1, 2, 4, 3, 5, 6, 7};
        int[] arraysB = new int[]{89, 67, 69, 4, 10, 6, 7};
        int[] arraysC = new int[]{1000,233,56,1,0,45};
        int[] mySort = myInsertionSorting(arraysC);
        System.out.println(JSON.toJSONString(mySort));
    }
    static int[] myInsertionSorting(int[] arrays) {
        // i = 1 的原因是因为不判断第一个元素, 第一个元素自然有序
        for (int i = 1; i < arrays.length; i++) {
            int insertNum = arrays[i];
            System.out.println("开始处理:"+ arrays[i]);
            //第一步, 向前找到插入的位置
            for (int j = i; j >= 0; j--) {
                System.out.printf("i:%d,j:%d%n",i,j);
                //拿到要进行插入的元素

                //向前比较,如果当前需要插入的元素比左边的大,那么此位置就是正确的位置,执行插入操作
                if (insertNum > arrays[j-1]) {
                    System.out.printf("当前需要插入的元素[%d]比左边的元素[%d]大,把元素[%d]放在元素[%d]右边%n",
                        insertNum, arrays[j-1], insertNum, arrays[j-1]);
                    break;
                } else {
                    System.out.printf("当前需要插入的元素[%d]比左边的元素[%d]小,交换他们的位置%n",
                        insertNum, arrays[j-1]);
                    int temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                    if (j == 1) {
                        break;
                    }
                }
            }
        }
        return arrays;
    }

}
