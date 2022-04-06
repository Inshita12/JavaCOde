class Solution {
    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static void Sort(int arr[]) {
        int i = 0;
        int temp = 0;
        int count = 0;
        int two = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp++;
            } else if (arr[i] == 1) {
                count++;
            } else if (arr[i] == 2) {
                two++;
            }
System.out.println(temp+ " "+count+ " "+two);
        }
        for (int j = 0; j < temp; j++) {
            arr[j] = 0;
            System.out.println(arr[j]);
        }
        for (int k = temp; k < temp+count; k++) {
            arr[k] = 1;
            System.out.println(arr[k]);
        }
        for(int a=temp+count;a<arr.length;a++){
            arr[a]=2;
            System.out.println(arr[a]);
       
        }
        printarr(arr);
    }

    public static void main(String[] args) {
      Sort(new int[] { 0, 1, 2, 0, 2, 0, 1 });
    }
}