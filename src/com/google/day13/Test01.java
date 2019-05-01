package com.google.day13;

public class Test01 {
    /**
     * * 需求：把数组中的数据按照指定个格式拼接成一个字符串
     * <p>
     * 举例：
     * int[] arr = {1,2,3};
     * 输出结果：
     * "[1, 2, 3]"
     * <p>
     * 用StringBuffer的功能实现
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        StringBuffer sb = new StringBuffer();                //创建字符串缓冲区对象
        sb.append("[");                                        //将[添加到缓冲区


        //{1,2,3}
        for (int i = 0; i < arr.length; i++) {                //遍历数组
            //sb.append(arr[i] + ", ");						//这样做没有]
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");                //[1, 2, 3]
            } else {
                sb.append(arr[i]).append(", ");                //[1, 2,
            }
        }
        return sb.toString();
    }
}
