public class QuickSort {
    public static int partition(int arr[], int start, int end){
            int i = start-1;
            int j;
            int pivot = arr[end];

            for(j=start; j<=end;j++){
                   if(arr[j]<pivot){
                        i++;
                        int temp = arr[j];
                        arr[j] = arr[i] ; 
                        arr[i] = temp;
                   }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[end];
            arr[end] = temp;
//            System.out.println(i+1);
            return i+1;
    }

    public static void QuickSort(int arr[], int start, int end){
        if(start<end){
            
            int pi = partition(arr, start, end);
    
            QuickSort(arr, start, pi-1);
            QuickSort(arr, pi+1, end);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,3,1,2,6,4,7};

        QuickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
        }
    }
}
