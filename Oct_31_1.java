package TestZoho;

import java.util.Arrays;
import java.util.Scanner;

public class Oct_31_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=input.nextInt();
        int arr[]=new int[size];
        int result[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int  i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            result[i]=product;
        }
        System.out.println(Arrays.toString(result));
    }
}
