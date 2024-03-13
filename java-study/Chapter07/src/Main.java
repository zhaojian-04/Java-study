public class Main {
    public static void main(String[] args) {
        //定义一组乱序的数
        int[] arr = {1, 55, 6, 44, 33, 66, 2};
        //长度不减1，是因为要留多一个位置方便插入数(最后一个数也要进行判断)
        for (int i = 0; i < arr.length; i++) {
            //待插入的数
            int temp = arr[i];
            //待插入数的下标
            int index = i - 1;
            //拿arr[i]与arr[i-1]的前面数组比较
            while (index >= 0 && temp < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = temp;
        }
        //输入排序后的数
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }


    }
}
