import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sample2 {


    public static void main(String[] args) {
      int arr[] = {1,1,1,1,2};
      int largest = arr[0];
      int secondLargest = arr[0];
      for(int i = 0;i < arr.length;i++){
          if(arr[i] > largest){
              secondLargest = largest;
              largest = arr[i];
          }
          else if(arr[i] > secondLargest && arr[i] != largest){
              secondLargest = arr[i];
          }

      }
      if(largest == secondLargest)
          System.out.println("all the elemets are equal");
      else
        System.out.println(secondLargest);
    }


}
