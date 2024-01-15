package Solving;

import java.util.*;
import java.io.*;


public class Test1234 {
    static int[] res;
    static boolean[] visited;
    static List<List<Integer>> adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        res = new int[N+1];
        adjList = new ArrayList<>();

        for(int i = 0; i<N+1; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int i = 0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            adjList.get(A).add(B);
            adjList.get(B).add(A);
        }
        
        findParent(1);

        for(int i =2; i<=N; i++) {
            System.out.println(res[i]);
        }
    }

    public static void findParent(int currentNode) {
        
        visited[currentNode] = true;
        for(int adjacent : adjList.get(currentNode)) {
            if(!visited[adjacent]) {
                res[adjacent] = currentNode;
                findParent(adjacent);
            }
        }
    }
}
