package com.google.day5;

/*
 * A:案例演示
 * 数组获取最值(获取数组中的最大值最小值)
 */
public class Demo09_Array {
    public static void main(String[] args) {
        int[] arr = {-5, -49};
        int max = getMax(arr);
        System.out.println(max);
    }
    /*
	获取数组中最大值
	1,返回值类型int
	2,参数列表int[] arr
	*/

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {            //从数组的第二个元素开始遍历
            if (max < arr[i]) {                            //如果max记录的值小于的数组中的元素
                max = arr[i];                            //max记录住较大的
            }
        }

        return max;
    }
}
