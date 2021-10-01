package Hackerrank;

import java.util.*;
public class MigratoryBirds {


    public static int Migratory(int[]arr){

        int maxelement=0;
        int number=0;
        for(int i=0;i<arr.length;i++){

            int count=0;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j])
                    count++;


            }

            if(count>maxelement)
                number=arr[i];
            maxelement=Math.max(count,maxelement);
        }

        return number;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        int result=Migratory(arr);

        System.out.println(result);

    }


}
