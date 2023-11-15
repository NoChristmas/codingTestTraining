package FailQuiz;

public class Query2 {
    public static void main(String args[]){
        int[] arr = {0,1,2,4,3};
        int[][] queries={{0,4,2},{0,3,2},{0,2,2}};

        int[] result = new int[queries.length];
        
        for(int i=0; i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = -1;
            
            for(int j=s; j<=e;j++){
                if(arr[j]>k && (min==-1 || arr[j]<min)) {
                    /* AND 연산자로 초기의 값으로 min==-1인 조건이 돌아 arr[j]로 박히고
                     * 그 이후에 발견 되는 값은 min의 값보다 작아야만 min을 찾아 들어감 (Chat gpt 오졌다..) */
                    min = arr[j];
                } 
            }
            result[i] = min;

        }




        for(int i: result)System.out.println(i);
    }
}
