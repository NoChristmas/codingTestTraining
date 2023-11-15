package Programmers.Lv0;

public class Query3 {
    public static void main(String args[]){
        int[] arr = {0,1,2,3,4};
        int[][] queries ={{0,3},{1,2},{1,4}};

        int[] result ={};

        for(int i=0; i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int temp = -1;

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            
            
        }

        for(int i : arr) System.out.print(i+" ");
    }

    
    
}
