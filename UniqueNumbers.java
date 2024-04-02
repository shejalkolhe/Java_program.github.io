import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 3, 4};
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nUnique Numbers:");
        printUniqueNumbers(array);
    }
    
    // Function to print unique numbers in an array
    public static void printUniqueNumbers(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }
    
    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}