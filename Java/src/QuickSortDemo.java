
public class QuickSortDemo {

    public static void main(String[] args) {
        GenericItemType[] table = new GenericItemType[]
                {new IntegerDataType(50), new IntegerDataType(57), new IntegerDataType(13),
                new IntegerDataType(21), new IntegerDataType(24), new IntegerDataType(24),
                new IntegerDataType(69), new IntegerDataType(77), new IntegerDataType(10)};

        System.out.println("Contents of table before sort: ");
        printArray(table);
        Qsort(table, 0, 8);
        System.out.println("Contents of table after sort: ");
        printArray(table);



    }

    public static void Qsort(GenericItemType arr[], int start, int finish){
        int left = start;
        int right = finish;
        GenericItemType pivot = arr[(start+finish)/2];

        while(left < right){
            while(arr[left].isLess(pivot)) left++;
            while(arr[right].isGreater(pivot)) right--;
            if(left <= right){
                GenericItemType temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if(start < right) Qsort(arr, start, right);
            if(left < finish) Qsort(arr, left, finish);

        }
    }

    public static void printArray(GenericItemType arr[]){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
