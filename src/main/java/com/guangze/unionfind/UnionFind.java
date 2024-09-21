package com.guangze.unionfind;

/**
 * @description:
 * @author: daiguangze
 * @create: 2024-09-21 16:10
 **/
public class UnionFind {

    //并查集(路径压缩)
    static int[] parent = new int[10005];
    //sum数组用来存储每一个集合中的元素个数
    static int[] sum = new int[10005];
    //初始化
    public static void init(int n){
        for (int i = 1; i <= n; i++) {
            parent[i]=i;
            sum[i]=1;
        }
    }

    //查找x所在集合的根
    public static int find(int x){
        if(parent[x]!=x) parent[x]=find(parent[x]); //递归返回的同时压缩路径
        return parent[x];
    }
    //合并x与y所在集合
    public static void unite(int x,int y){
        int tx = find(x);
        int ty = find(y);
        if(tx!=ty){
            parent[tx]=ty;
            sum[ty]+=sum[tx];
        }
    }


}
