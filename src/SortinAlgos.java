import java.util.ArrayList;
import java.util.Arrays;

public class SortinAlgos {
    public static void main(String[] args) {
        int [] arr = {4,7,3,5,2};
//        mergeSort(0,arr.length-1,arr);
      quickSort(arr,0,arr.length-1);
//      bubbleSort(arr);
//      selectionSort(arr);
//      insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {//----------------------quick sort
        if(low>=high)return;

        int pivotIdx = getPivot(arr,low,high);
        quickSort(arr,low,pivotIdx-1);
        quickSort(arr,pivotIdx+1,high);
    }

    private static int getPivot(int[] arr, int low, int high) {//----------------------quick sort
        int i=low;
        int j=high;
        int pivot = arr[low];
        while(i<j){
            while(i<high && arr[i]<=pivot){
                i++;
            }
            while(j>low && arr[j]>pivot){
                j--;
            }
            if(i<j)swap(arr,i,j);
        }
        swap(arr,low,j);
        //hello
        //hiii hello
        return j;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void mergeSort(int low, int high, int[] arr) {//----------------------------megesort
        if(low==high){
            return ;
        }
        int mid=(low+high)/2;
        mergeSort(low,mid,arr);
        mergeSort(mid+1,high,arr);

        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {//----------------------------megesort
        ArrayList<Integer> list = new ArrayList<>();
        int l=low;
        int r=mid+1;
        while(l<=mid && r<=high){
            if(arr[l]<arr[r]){
                list.add(arr[l]);
                l++;
            }else{
                list.add(arr[r]);
                r++;
            }
        }
        while(l<=mid){
            list.add(arr[l]);
            l++;
        }

        while(r<=high){
            list.add(arr[r]);
            r++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }

    private static void insertionSort(int[] arr) {//--------------------------insertion sort
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    private static void selectionSort(int[] arr) {//--------------------------selection sort
        for(int i=0;i<arr.length;i++){
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }

    private static void bubbleSort(int[] arr) {//--------------------------bubble sort
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
