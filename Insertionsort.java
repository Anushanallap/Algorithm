package Algorithm;

public class Insertionsort {
		public static void sort(int arr[])
		{
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}

		/* A utility function to print array of size n*/
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		// Driver method
		public static void main(String args[])
		{
			int arr[] = {2, 11, 13, 5, 6 };

			Insertionsort ob = new Insertionsort();
			sort(arr);

			printArray(arr);
		}
	} 




