import java.util.*;
class runner {
   public static int[] takeInput() {
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int arr[] = new int[size];
      for (int i = 0; i < size; i++) {
         arr[i] = s.nextInt();
      }
      return arr;
   }
   public static void main(String[] args) {
      int[] input = takeInput();
      solution.printSubsets(input);
   }
}
class solution {
   public static void printSubsets(int input[]) {
      // Write your code here
      int output[] = new int[0];
      helper(input, 0, output);
   }
   public static void helper(int input[], int index, int output[]) {
      if (index == input.length) {
         for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
         }
         System.out.println();
        return;
      }
      helper(input, index + 1, output);
      int smallAns[] = new int[output.length + 1];
      int i = 0;
      for (i=0 ; i < output.length; i++) {
         smallAns[i] = output[i];
      }
      smallAns[i]=input[index];
      helper(input, index + 1, smallAns);

   }
}


//ARRAYLISTMETHOD
// import java.util.*;

// class c {
//     public static void printSubsets(int[] input, int index, ArrayList<Integer> output) {
//         if (index == input.length) {
//             System.out.println(output);
//             return;
//         }
//         printSubsets(input, index + 1, output);
//         output.add(input[index]);
//         printSubsets(input, index + 1, output);
//         output.remove(output.size() - 1);
//     }

//     public static void printSubsets(int[] input) {
//         printSubsets(input, 0, new ArrayList<>());
//     }

//     public static void main(String[] args) {
//         printSubsets(new int[] { 11, 12, 13 });
//     }
// }