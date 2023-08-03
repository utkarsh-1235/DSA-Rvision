public class BubbleSort{
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of elements in an array");
        // int n = sc.nextInt();

        // int arr[] = new int[n+1];
        // System.out.println("Enter the elements in an array");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }

        int arr[] = {5,3,1,2,6,4,7};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int count = 0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     count = 1;
                }
                
            }
            if(count == 0){
                    break;
                }
        }
System.out.println("Sorted element in an array is");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    }
}