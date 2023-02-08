import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    // run-time complexity = O(n Log n)
    // space complexity    = O(n)
    Quick q = new Quick();
    MergeSort m = new MergeSort();
    
    
    int[] array = {10, 50, 1, 0, 40, 15, 64};
        
    m.mergeSort(array);
        
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+ " ");
    }

    q.quicksort(array, 0, array.length - 1);
 
    
     System.out.println("\n"+Arrays.toString(array));
    }

	
}
