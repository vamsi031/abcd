public class secondAndThirdMax {
    public static void main(String[] args) {
        int[] arr = {1,4,-54};

        int first = Integer.MIN_VALUE;
        int second = first;
        int third = first;

        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(second<arr[i] && arr[i]!=first){
                third=second;
                second=arr[i];
            }
            else if(third<arr[i] && arr[i]!=second){
                third=arr[i];
            }
        }
        System.out.println(second);
        System.out.println(third);
    }
}
