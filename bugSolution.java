public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) {
            System.out.println(arr[0]); // Accessing a valid index
        } else {
            System.out.println("Array is empty");
        }
    }
}