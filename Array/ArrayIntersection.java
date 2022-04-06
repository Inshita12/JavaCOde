class Runner {
    public static int duplicate(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr1[i]+" "+arr2[j]);
                System.out.println("********************************");
               
                if (arr1[i] == arr2[j]) {
                    System.out.println("_____________________--- "+arr1[i]);
                    System.out.println("********************************");
                    arr2[j]=-1;
                    break;

                }
                
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        duplicate(new int[] {2,6,8,4,4,3 }, new int[] {2,3,4,0});
    }
}