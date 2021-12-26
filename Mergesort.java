package Algorithm;

public class Mergesort {
	
	    public int[] mergeSort(int [] array, int First, int Last) {
	        if(Last - First < 1) {
	            return array;
	        }

	        int mid = (Last + First) / 2;
	        mergeSort(array, First, mid);
	        mergeSort(array, mid + 1, Last);

	        return merge(array, First, mid, Last);
	    }

	    public int[] merge(int [] array, int First, int mid, int Last) {

	        int [] Left = new int[mid - First + 1];
	        int [] Right = new int[Last - mid];

	        for(int i = 0; i < mid - First + 1; i++)
	            Left[i] = array[First + i];
	        for(int i = 0; i < Last - mid; i++)
	            Right[i] = array[mid + i + 1];

	        int k = First, i = 0, j = 0;

	        while (i < Left.length && j < Right.length) {
	            if(Left[i] < Right[j])
	                array[k++] = Left[i++];
	            else
	                array[k++] = Right[j++];
	        }

	        while( i < Left.length) {
	            array[k++] = Left[i++];
	        }
	        while( j < Right.length) {
	            array[k++] = Right[j++];
	        }
	        return array;
	    }

	    public void displaySort(int [] array) {
	        for (int i : array) {
	            System.out.print(" " + i);
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Mergesort sort = new Mergesort();
	        int array[] = {30,50,70,55,85,90,75,61};

	        sort.mergeSort(array, 0, array.length - 1);
	        sort.displaySort(array);
	    }
	}


