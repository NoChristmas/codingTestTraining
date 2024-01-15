package Solving;

import java.util.*;
import java.io.*;

public class Notion020 {
    static StringTokenizer st;
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        parents = new int[N+1];
        adjList = new ArrayList<>();

        for(int i = 0; i<=N; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        findParents(1);
        for(int i = 2; i<=N; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void findParents(int currentNode) {
        visited[currentNode] = true;
        for(int adjacent : adjList.get(currentNode)) {
            if(!visited[adjacent]) {
                parents[adjacent] = currentNode;
                findParents(adjacent);
            }
        }
    }
}
