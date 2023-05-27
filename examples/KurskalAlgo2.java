package com.company.Learn_Java.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;

class KNode{
    int source;
    int dest;
    int weight;
    KNode(int source,int dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight =weight;
    }
}
public class KurskalAlgo2 {
    int n , e;
    KurskalAlgo2(int n, int e){
        this.n = n;
        this.e = e;
    }
    ArrayList<KNode> edges = new ArrayList<>(n);
    void addEdges(KNode n){
        edges.add(n);
    }
    void kurskalMST() {
        Comparator<KNode> comparator = new Comparator<KNode>() {
            public int compare(KNode edge1, KNode edge2) {
                return edge1.weight - edge2.weight;
            }
        };
        // edges are sorted here according to their weights
        edges.sort(comparator);
        // creating empty min span tree array
        Hashtable<Integer,Integer> mst = new Hashtable<>();
        int pos =0;
        int sumWeight =0;
        mst.put(pos,edges.get(0).source);
        for(KNode k : edges){
            if(!mst.contains(k.source) ){
                mst.put(++pos,k.source);
                sumWeight += k.weight;
            }
            if(!mst.contains(k.dest)){
                mst.put(++pos,k.dest);
                sumWeight += k.weight;
            }
        }
        Integer[] res = mst.keySet().toArray(new Integer[0]);
        display(res,mst);
        System.out.println("min weight is " + sumWeight);
    }
    void display(Integer []arr,Hashtable mst){
        for(int i =arr.length-1; i>=0; i--){
            System.out.print(mst.get(arr[i])+ "--> ");
        }
    }

    public static void main(String[] args) {
//        KNode k6 = new KNode(2,3,7);
//        KNode k1 = new KNode(0,1,1);
//        KNode k5 = new KNode(4,1,6);
//        KNode k3 = new KNode(2,4,4);
//        KNode k2 = new KNode(1,2,2);
//        KNode k4 = new KNode(4,0,5);
//        KNode k7 = new KNode(4,3,8);
        KNode k6 = new KNode(2,3,1);
        KNode k1 = new KNode(0,1,2);
        KNode k5 = new KNode(4,1,3);
        KNode k3 = new KNode(2,4,4);
        KNode k2 = new KNode(1,2,5);
        KNode k4 = new KNode(4,0,6);
        KNode k7 = new KNode(4,3,7);
        KurskalAlgo2 k  = new KurskalAlgo2(5,4);
        k.addEdges(k1);
        k.addEdges(k2);
        k.addEdges(k3);
        k.addEdges(k4);
        k.addEdges(k5);
        k.addEdges(k6);
        k.addEdges(k7);
        k.kurskalMST();
    }
}
