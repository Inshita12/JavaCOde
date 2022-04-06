import java.util.Scanner;

public class LinearSearch {
public static int search(int input[]){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int i=0;
    for(i=0;i<input.length;i++){
        if(num==input[i]){
           System.out.println("element is at"+i);
        }
    }
    return i;
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

//     public static void print(int input[]) {
//         int size=input.length;
//         for(int i = 0;i<size;i++)
//         {
//             System.out.println(input[i]+" ");
// }
//     }

    public static void main(String[] args) {
        int arr[]= takeInput();
        // print(arr);
        int search = search(arr);
        
    }
    }