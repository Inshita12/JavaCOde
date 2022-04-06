
import java.util.Scanner;

public class arraysum {

    public static int Sum(int input[]){
        int sum=0;
        for(int i=0;i<input.length;i++){
              sum=sum+input[i];
        }

        return sum;
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[]=new int[size];
        for(int i = 0;i<size;i++)
        {
            input[i]=s.nextInt();        }
            return input;
    }

    public static void print(int input[]) {
        int size=input.length;
        for(int i = 0;i<size;i++)
        {
            System.out.println(input[i]+" ");
}
    }

    public static void main(String[] args) {
        int arr[]= takeInput();
        int sum= Sum(arr);
        System.out.println("Sum is:"+sum);
    }
    }