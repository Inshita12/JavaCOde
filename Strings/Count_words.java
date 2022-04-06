import java.util.*;
class count{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int space=1;

        for(int i=0;i<t.length()-1;i++){
        
            if(t.charAt(i)== ' '){
                space++;
            }
        }
        System.out.print(space);
    }
}