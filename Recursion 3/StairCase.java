class solution {
    public static int stairCase(int n) {
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);
    }


    public static void main(String[] args) {
        System.out.println(stairCase(4));
    }
}
