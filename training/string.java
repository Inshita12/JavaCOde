package training;

 class string {
	public static String reverse(String str) {
        String ans = "";
        char a[] = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            ans += a[i];
        }
        return ans;
    }
}

class Stringreverse {
    public static void main(String args[]) {
        System.out.println(string.reverse("hello world"));
    }
}
