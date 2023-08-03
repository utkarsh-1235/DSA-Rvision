public class MergeSort {
    public static void mergeSort(int arr[], int low, int end){
        
        if(low>=end){
            return;
        }
            int mid = low+(end-low)/2;
                 mergeSort(arr,low,mid);
                 mergeSort(arr,mid+1,end);
                 merge(arr,low,mid,end);
        
    }
    public static void merge(int arr[], int low, int mid, int end){
          int temp[] = new int[end-low+1];
          int i=low;
          int j=mid+1;
          int k=0;

          while(i<=mid && j<=end){
                 if(arr[i]<arr[j]){
                    temp[k] = arr[i];
                    i++;
                 }
                 else{
                    temp[k] = arr[j];
                    j++;
                 }
                 k++;
          }

          while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
          }
          while(j<=end){
            temp[k] = arr[j] ; 
            j++;
            k++;
          }
          
          for(i=low,k=0 ; k<temp.length;i++,k++ ){
                arr[i] = temp[k]; 
          }
      
          
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of elements");
        // int n = sc.nextInt();

        // int arr[] = new int[n+1];
        // System.out.println("Enter the elements in an array");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {5,3,1,2,6,4,7};
        int n = arr.length;

        mergeSort(arr, 0, n-1);

        System.out.println("Array must be sorted");
          for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
          }
    }
}
