import java.util.Scanner;

class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void helper(int[] input, int startindex, int endindex) {
		if (startindex >= endindex) {
			return;
		}
		int mid = (startindex + endindex) / 2;
		helper(input, startindex, mid);
		helper(input, mid + 1, endindex);
		merge(input, startindex, endindex);

	}

	public static void merge(int[] input, int startindex, int endindex) {
		int mid = (startindex + endindex) / 2;
		int ans[] = new int[endindex-startindex+1];
	
		int i = startindex;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= endindex) {
			if (input[i] < input[j]) {
				ans[k] = input[i];
				i++;
				k++;
				
				
			} else {
				ans[k] = input[j];
			
				j++;
				k++;
			}
		}
		   while(i<=mid){
			   ans[k]=input[i];
			   i++;
			   k++;
		   }
		   while(j<=endindex){
			   ans[k]=input[j];
			   j++;
			   k++;
		   }

		   for (int k2 = 0; k2 < ans.length; k2++) {
			   input[startindex+k2]=ans[k2];
		   }

	}

	public static void mergeSort(int[] input) {
		// Write your code here
	helper(input, 0, input.length-1);
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
}