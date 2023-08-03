public class InsertionSort {
    public static void main(String args[]){
        int arr[] = {5,3,1,2,6,4,7};

        for(int i=1; i<arr.length; i++){
              int prev = i-1;
              int cur = arr[i];

              while(prev>=0 && arr[prev]>cur){
                  arr[prev+1] = arr[prev];
                  prev--;
              }
              arr[prev+1] = cur;
        }

        System.out.println("Sorted array ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
