public class Quick {
    public static void swap (int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    
    public static int partition(int[] array, int start, int end)
    {
        // choose the first one as pivot
        int pivot = array[end];
 
        
        int pIndex = start;
 
     
        for (int i = start; i < end; i++)
        {
            if (array[i] <= pivot)
            {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
 
       
        swap(array, end, pIndex);
 
      
        return pIndex;
    }
 
    // Quick sort
    public static void quicksort(int[] array, int start, int end)
    {
        // Base condition
        if (start >= end) {
            return;
        }
 
        // reorganize
        int pivot = partition(array, start, end);
 
        
        quicksort(array, start, pivot - 1);
 
       
        quicksort(array, pivot + 1, end);
    }
}
