public class Version6main {
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