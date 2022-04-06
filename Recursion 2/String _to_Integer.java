class tempinsta {
    public static int helper(int n) {
       System.out.println(n*10);
       return 0;
    }
    public static int solution(String ans) {
        if(ans.length()==0){
            return 0;
        }
        char a = ans.charAt(0);
        int b = a - '0';
        return b*(int)Math.pow(10, ans.length()-1)+solution(ans.substring(1, ans.length()));
    }

    public static void main(String[] args) {
        String ans = "4596";
        System.out.println(solution(ans));
    }
}
// class tempinsta {
//     public static int solution(String ans) {
//         if(ans.length()==0){
//             return 0;
//         }
//         char a = ans.charAt(ans.length() - 1);
//         int b = a - '0';
//         return solution(ans.substring(0, ans.length() - 1)) * 10 + b;
//     }

//     public static void main(String[] args) {
//         String ans = "102034";
//         System.out.println(solution(ans));
//     }
// }