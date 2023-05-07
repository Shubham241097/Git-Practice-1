public class Sorting{
    
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[]args){

        int arr[] = {3,8,2,6,4,5};
        selectionSort(arr);
    }
}