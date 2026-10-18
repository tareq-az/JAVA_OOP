package allPracticeCode;
import java.util.Scanner;

public class arrayinput {
    static void main(Stringpractice args[]) {

        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       for(int i=0; i<n; i++){
           System.out.println(arr[i]);
       }

    }
}
