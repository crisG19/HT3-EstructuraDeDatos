public class Main {
    public static void main(String[] args) {

    // run-time complexity = O(n Log n)
    // space complexity    = O(n)
    
    MergeSort m = new MergeSort();
    
    Integer[] array = {10, 50, 1, 0, 40, 15, 64};
        
    m.mergeSort(array);
        
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+ " ");
    }
    }

	
}
