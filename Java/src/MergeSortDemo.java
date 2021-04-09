import java.util.Random;
public class MergeSortDemo {


    public static void main(String[] args) {
        Random random = new Random();
        int upperBound = 101;

        int size = 5;
        GenericItemType[] list = new GenericItemType[size];
        int index = 0;
        for(int i = 0; i < size; i++){
            list[i] = new IntegerDataType(random.nextInt(upperBound));
        }

        mergeSort(list, 0, list.length - 1);

        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();




    }

    public static void merge(GenericItemType[] arr,  int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        GenericItemType[] A = new GenericItemType[n1];
        GenericItemType[] B = new GenericItemType[n2];

        for(int i = 0; i < n1; i++)
            A[i] = arr[left + 1];
        for(int j = 0; j < n2; j++)
            B[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;

        int k = left;
        while(i < n1 && j < n2){
            if(A[i].isLess(B[j]) || A[i].isEqual(B[j])){
                arr[k] = A[i];
                i++;
            } else{
                arr[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = A[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = B[j];
            j++;
            k++;
        }


    }

    public static void mergeSort(GenericItemType[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }


    }


    // Customer Iterator for Generic Array
    public static void iterator_initialize(GenericItemType[] A, int index){
        index = 0;
    }
    public static boolean iterator_hasNext(GenericItemType[] A, int index){
        return index <= A.length - 1;
    }
    public static GenericItemType iterator_getNext(GenericItemType[] A, int index){
        return A[index++];
    }




}





