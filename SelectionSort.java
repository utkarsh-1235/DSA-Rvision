public class SelectionSort {
    public static void main(String args[]){
        int arr[] = {5,3,1,2,6,4,7};

        for(int i=0;i<arr.length-1;i++){
            int maxIndex = i;
            int max = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){
                       maxIndex = j;
                       max = arr[j];
                }

            }
            int swap = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = swap;
        }

        System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
