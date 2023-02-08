public class MergeSort<T> implements Comparable<MergeSort<T>> {
    
    public static void mergeSort(Integer[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		Integer[] leftArray = new Integer[middle];
		Integer[] rightArray = new Integer[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	public void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
            
    	if (leftArray[l].compareTo(rightArray)<-1) {
                array[i] = leftArray[l];
				i++;
				l++;
            }else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
			
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
			while(l < leftSize) {
				array[i] = leftArray[l];
				i++;
				l++;	
		}
			while(r < rightSize) {
				array[i] = rightArray[r];
				i++;
				r++;
		}
	}

	@Override
	public int compareTo(MergeSort o) {
		return 0;
	}

}
