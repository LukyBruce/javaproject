public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);
        for(int s: arr){
            System.out.print(s + " ");
        }
    }


    //quick sort
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }


    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }
}
