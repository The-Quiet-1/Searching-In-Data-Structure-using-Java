//package Searching;

import java.util.Scanner;

class binary{
    public int b_search(int n,int[] array,int sn) {
            int start=0;
            int end=(n-1);

            while(start <= end ) {
                int mid = start + (end-start)/2;
            if(sn > array[mid]){
                start=mid+1;
            }
            else if(sn < array[mid]){
                end=mid-1;
            }
            else //start==end;
                return mid;
        }
        return -1;
    }
}
public class binary_Search {
    public static void main(String[] args) {
        int i,n,sn;
        int[] array ;

        Scanner get = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter No of Elements in an Array: ");
        n=get.nextInt();

        array=new int[n];
        System.out.println("Please Enter a Sorted Array Elements.");
        for(i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Elements: ");
            array[i]= get.nextInt();
        }
        System.out.println("---------------------------------------------");
        System.out.print("Elements are:");
        for(i=0;i<n;i++) {
            System.out.print(" "+array[i]);
        }

        // for search the Element.
        System.out.println();
        System.out.println("---------------------------------------------");

        System.out.print("Element You Want to Search: ");
        sn=get.nextInt();

        System.out.println("---------------------------------------------");

        // calling part
        binary obj=new binary();
        int result= obj.b_search(n,array,sn);

        if(result==-1){
            System.out.println("ERROR: Element not Found..");
        }
        else
            System.out.println("Element "+array[result]+ " is present at Array index " + result);
    }
}
