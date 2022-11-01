package TestZoho;

import java.util.*;

public class Oct_31_2 {
    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the size of Array");
//        int size=input.nextInt();
//        int arr[]=new int[size];
//        int result[]=new int[size];
//        System.out.println("Enter the Array Elements");
//        for(int  i=0;i<size;i++){
//            arr[i]=input.nextInt();
//        }
//
        int arr[]={-1,-1,1,2,-1,-1};
        //-4 -1 -1 0 1 2
        Arrays.sort(arr);
        Set<List<Integer>> result=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();


            int sum=0;
            int i=0,j=1,k=2;
            while(j<arr.length-1 && k<=arr.length && i<arr.length ){
                sum=arr[i]+arr[j]+arr[k];
                if(sum==0)
                    result.add(List.of(arr[i],arr[j],arr[k]));
                if(j==arr.length-2){
                    i++;
                    j=i+1;
                    k=j+1;
                    continue;

                }
                if(k==arr.length-1) {
                 j++;
                 k--;
                }
                k++;
            }

        System.out.println(result);
    }
}
