package basic02;
//time complexity: O(n)
//space complexity: O(1)
public class rainBowthreeWay {
    public int[] rainbowSort(int[] array ){
        int i = 0;
        int j = 0;
        int k = array.length -1;
        while(j<=k){
            if(array[j] == -1){
                swap(array,j,i);
                i++;
                j++;
            }else if(array[i] == 0){
                j++;
            }else{
               swap(array,j,k);
               k--;
            }
        }
        return array;
    }

    private void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
