package basic02;

import java.util.Random;

public class QucikSort {
    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        sort(array, 0, array.length -1);
        return array;
    }
   private void sort(int[] array, int left, int right){
        if(left>=right){
            return;
        }
        int pivot = left + new Random().nextInt(right-left+1);
        swap(array, pivot, right);
        int i = left;
        int j = right -1;
        while(i<=j){
            if(array[i] < array[right]){
                i++;
            }else {
                swap(array, i, j);
                j--;
            }
        }
        swap(array,i,right);
        sort(array, left, i-1);
        sort(array,i+1, right);
   }
   private void swap(int[] array, int a, int b){
        int tmp =array[a];
        array[a] = array[b];
        array[b] = tmp;
   }
}
