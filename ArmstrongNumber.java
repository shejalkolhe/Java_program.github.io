 import java.util.Scanner;  
import java.lang.Math;  
public class ArmstrongNumber
{  
    // function to check if the number is an Armstrong or not  
    static boolean isArmstrong(int num)   
    {   
        int temp, digits=0, last=0, sum=0;   
        temp = num; 
        for(; temp > 0; temp = temp/10)
        {
            digits++;
        }
        temp = num;   
        for(; temp > 0; temp = temp/10) 
        {   
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
        }  
        if(num == sum)   
            return true;      
        else 
            return false;
    }   
    //driver code  
    public static void main(String args[])     
    {     
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        n = sc.nextInt();  
        if ( isArmstrong(n) ) 
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }   
}
[11:25 PM, 4/2/2024] Shrutika Badode: import java.io.*;
import java.util.*;

class GFG {

    // Function to find the missing number
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        // Function call
        findMissing(arr, n);
    }
}