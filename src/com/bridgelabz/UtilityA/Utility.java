package com.bridgelabz.UtilityA;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Utility {


    /**
     * @param arr
     * @param first
     * @param last
     * @param key
     * @return
     */
    public static int binarySearch(int arr[], int first, int last, int key)
    {  
    	
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        
        return -1;  
    }  
    // Returns index of x if it is present in arr[], 
    // else return -1 
    /**
     * @param arr
     * @param x
     * @return
     */
    public static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        return -1; 
    } 
    /**
     * @param a
     */
    public static void insertion(int a[])
    {
    	int n=a.length;
    	for (int i = 1; i < n; ++i) { 
            int key = a[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
    	 for (int i = 0; i < n; ++i) 
             System.out.print(a[i] + " "); 
    }
    
    /**
     * @param array
     * @param f
     * @return
     */
    public static String[] sort_sub(String array[], int f)
    {
    	String temp="";
    	for(int i=0;i<f;i++){
    	for(int j=i+1;j<f;j++){
    	if(array[i].compareToIgnoreCase(array[j])>0){
    	temp = array[i];
    	array[i]=array[j];
    	array[j]=temp;
    	}
    	}
    	}
    	return array;
    }
    /**
     * @param a
     */
    public static void bubbleS(int a[])
    {
    	int n=a.length;
    	for(int i=0;i<n-1;i++)
    	{
        	for(int j=0;j<n-i-1;j++)
        	{
    		if(a[j]>a[j+1])
    		{
    			int temp =a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
        	}
    	}
    	for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
    }
    public static void bubbleS(String a[])
    {
    
    	String temp;
        System.out.println("Sorted string...");
        for (int j = 0; j < a.length; j++) {
           for (int i = j + 1; i < a.length; i++) {
              // comparing strings
              if (a[i].compareTo(a[j]) < 0) {
                 temp = a[j];
                 a[j] = a[i];
                 a[i] = temp;
              }
           }
           System.out.println(a[j]);
        }
    }
	/**
	 * @param range
	 */
	public static void magicNumber(int range) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int li = 0;
		int hi = range - 1;
		int mi = (li + hi) / 2;

		System.out.println();
		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

		while (li < hi) {
			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = scanner.nextInt();
			if (uservalue == 1) {

				hi = mi;
				mi = (li + hi) / 2;

			} else if (uservalue == 2) {
				li = mi+1;
				mi = (li + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
		scanner.close();
	}
	
    /**
     * @param array
     */
    public static void mergeSort(int[] array)
    {
        if(array == null)
        {
            return;
        }
 
        if(array.length > 1)
        {
            int mid = array.length / 2;
 
            // Split left part
            int[] left = new int[mid];
            System.out.print("Left arr : "+" ");
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];
                System.out.print(left[i]);
            }
             
            // Split right part
            int[] right = new int[array.length - mid];
            System.out.print("Right arr : "+" ");
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];
                System.out.print(right[i-mid]);

            }
            mergeSort(left);
            mergeSort(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    array[k] = left[i];
                    i++;
                }
                else
                {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
    
    /**
     * @param n
     */
    public static void FtoC(int n)
    {
    	int f = (n * 9/5)+32;
    	System.out.println("Far to cel = "+f);
    }
    /**
     * @param n
     */
    public static void CtoF(int n)
    {
    	int c = (n-32)+5/9;
    	System.out.println(" cel to Far = "+c);
    }
    public static double findSquareRootUsingNewtonsMethod(int c)
    {
    	double t, epsilon;
		t = c;
		epsilon=1*(Math.pow(10, -15));
		epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
    }
}
