package com.company.Learn_Java.examples;

import java.util.TreeSet;

class KEdge implements Comparable {
    int source;
    int dest;
    int weight;
    KEdge(int source,int dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight =weight;
    }
    @Override
    public int compareTo(Object o) {
        KEdge e  = (KEdge) o;
        return Integer.compare(e.weight,weight);
    }
}
public class KurskalAlgo3 {
    int n , e;
    int [] parent ;
    KurskalAlgo3(int n, int e){
        this.n = n;
        this.e = e;
        parent = new int[n];
    }
    TreeSet<KEdge> edges = new TreeSet<KEdge>();
    void addEdges(int source, int dest , int weight){
        KEdge k = new KEdge(source,dest,weight);
        edges.add(k);
    }
    void kurskalMST() {
        KEdge [] output = new KEdge[e];

        for(int i =0; i< n;i++){
            parent[i] = i;
        }
        int count =0;
        for(KEdge current: edges){
            int sourcePar = findParent(current.source);
            int destPar = findParent(current.dest);
            if(sourcePar != destPar){
                output[count] = current;
                count++;
                parent[sourcePar] = destPar;
            }
        }
        for(int j = 0; j< n-1;j++){
            if(output[j].source < output[j].dest)
            System.out.println(output[j].source+"--> " +output[j].dest +" ==>"+output[j].weight);
            else System.out.println(output[j].dest +"--> "+ output[j].source+" ==>"+output[j].weight);
        }
    }
    int findParent(int v){
        if(parent[v] == v) return v;
        return findParent(parent[v]);
    }

    public static void main(String[] args) {
        KurskalAlgo3 k  = new KurskalAlgo3(5,4);
        k.addEdges(2,3,7);
        k.addEdges(4,1,6);
        k.addEdges(2,4,4);
        k.addEdges(4,1,6);
        k.addEdges(1,2,2);
        k.addEdges(4,0,5);
        k.addEdges(4,3,8);
        k.kurskalMST();
    }
}