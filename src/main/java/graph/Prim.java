package graph;

import java.util.ArrayList;
import java.util.List;

public class Prim {

    public static void main(String[] args) {

    }



    /**
     * 邻接矩阵
     */
    private static int prim(int start, int[][] graph) {
        // 已经加入的节点集合
        List<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        int ans = 0;
        for (int i = 0; i < graph.length; i++) {
            // 加入集合
            arr.add(start);
            // 标记
            visited[start] = true;
            int val = Integer.MAX_VALUE;
            // 寻找最小边
            for (Integer row : arr) {
                for(int j = 0 ; j < graph.length ; j++){
                    if (!visited[j]){
                        // 找到权值最小且通的
                        if (graph[row][j] < val && graph[row][0] > 0){
                            start = j;
                            val = graph[row][j];
                        }
                    }
                }
            }
            ans += val;
        }
        return ans;
    }
}
