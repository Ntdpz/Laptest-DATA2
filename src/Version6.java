public class Version6 {

    public void quickSort(int[] dt){
        qSort(dt,0,dt.length-1);
    }

    private void qSort(int[] dt, int low, int high) {
        int split = partition(dt, low, high);
        if (
                low < split
        ){
            qSort(dt, low, split); // left subarray
        }
        if (
                high > split + 1
        ){
            qSort(dt, split + 1, high);   // right subarray
        }
    }

    private int partition(int[] dt, int low, int high) {
        int pivot = dt[(low + high)/2];
        int i = low - 1;  // index going left to right
        int j = high + 1;   // index going right to left
        while (true) {
            do {
                i++;
            } while (                    dt[i]      <      pivot);
            do {
                j--;
            } while (dt[j] > pivot);
            if (
                    i < j
            ){
                swap(dt, i, j);
            }else{
                return j; // dt[j] = end of left array
            }
        }
    }
    public void swap(int[] dt, int i, int j) {
        int temp = dt[i];
        dt[i] = dt[j];
        dt[j] = temp;
    }

    public void binarySearch(int[] dt, int search) {
        int low = 0;
        int mid = 0;
        int high =
                dt.length - 1
                ;
        do {
            mid = (
                    low + high
            ) / 2;
            // if found
            if (
                    search == dt[mid]
            ) {
                break; // or any statement that can break the loop
            } else if (search < dt[mid]) {
                high = mid - 1;
            } else {

                low = mid + 1
                ;
            }
        } while (                low <= high        );

        if (
                low > high
        ) { // or if(search!=data[mid])
            System.out.println(search + " is not found");
        } else {
            System.out.println("Found " + search + " at position " + mid);
        }
    }

    //displaying method
    public void print(int[] dt){
        for (int ai:dt){
            System.out.printf("%s ",ai);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // array of data
        int[] data = { 5, 3, 9, 1, 6, 2 };
        Version6 test = new Version6();

        System.out.println("============== Original Data ==================");
        test.print(data);
        System.out.println("============== Quick Sorting ==================");
        test.quickSort(data);
        System.out.println("After Sorted --> ");
        test.print(data);
        System.out.println("============== Binary Searching ===================");
        test.binarySearch(data,5);
        test.binarySearch(data,8);

    }
}