class solution {
    public static String pairstar(String input) {
        if (input.length() == 1) {
            return input;
        }
        if (input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + "*" + pairstar(input.substring(1, input.length()));
        }
        return input.charAt(0) + pairstar(input.substring(1));
    }

    public static void main(String[] args) {
        String input = "aaaa";
        System.out.println(pairstar(input));
    }
}
