class Str1 {
    public static void main(String args[]) {
        String s1 = "Ram";
        String s2 = new String("Square");
        String s3 = "Ram";
        String s4 = "ram kumar";
        /* Concatenating strings */
        s1.concat("Kumar");
        System.out.println("After concatenation" + "  " + s1);

        /* Appending strings */
        StringBuffer sb = new StringBuffer("Ram");// We cannot directly assign values to stringbuffer
        sb.append(" Kumar");
        System.out.println("After concatenation" + "  " + sb);

        /* Comparing Strings */
        System.out.println("After comparing s1 and s3");
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s4));

        /* Finding index of given word */
        String s5 = "Java is a programming language.It is";
        String s6 = "is";
        System.out.println("The index of is" + " " + s5.indexOf(s6));
        System.out.println("The index of is" + " " + s5.indexOf(s6, 6));
        System.out.println("The index of is" + " " + s5.lastIndexOf(s6));
        System.out.println("The index of is" + " " + s5.lastIndexOf(s6, 33));

        /* Substring */
        System.out.println("Substring is" + " " + s5.substring(3, 17));

        /* Finding length of the string */
        int len = s5.length();
        System.out.println("Length of the string s5 is" + len);

        /* Starts with and end with */
        System.out.println(s5.startsWith("Java"));
        System.out.println(s5.endsWith("Java"));

        /* Reversing the strings */
        System.out.println("Reverse of Ram Kumar is " + sb.reverse());

        /* Converting StringBuilder to String */
        StringBuilder sb1 = new StringBuilder("Jyoti Jha");
        String s7 = sb1.toString();
        System.out.println("After inserting JJ" + " " + sb1.insert(6, "JJ"));

    }
}