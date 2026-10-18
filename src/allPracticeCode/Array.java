package allPracticeCode;
import java.util.Arrays;
public class Array {
    static void main() {
        //Array declaration
        int[] arr = new int[5];
        //value assign
        arr[0]=1;
        arr[1]=4;
        arr[2]=2;
        arr[3]=5;
        arr[4]=3;
        //sorting
        Arrays.sort(arr);
        /*Arrays.binarySearch(): সর্টেড (Sorted) অ্যারে থেকে বাইনারি সার্চ
        অ্যালগরিদম ব্যবহার করে কোনো এলিমেন্টের ইনডেক্স খুঁজে বের করে।*/

        int target_index=Arrays.binarySearch(arr, 3);
        Arrays.fill(arr, 9); // সব উপাদান 9 হয়ে যাবে -> [9, 9, 9, 9, 9]

        /*Arrays.equals(): দুটি অ্যারের উপাদান ও সাইজ হুবহু
        সমান কি না তা চেক করে (true বা false রিটার্ন করে)। */
        int[] arr2=new int[5];
        Arrays.fill(arr2, 9);
        boolean match = Arrays.equals(arr, arr2);
        int[] originalArr=new int[5];
        int[] newArr = Arrays.copyOf(originalArr, 3); // প্রথম ৩টি উপাদান কপি হবে
    }
}
