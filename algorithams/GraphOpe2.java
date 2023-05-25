package com.company.Learn_Java.algorithams;

import java.util.LinkedList;

public class GraphOpe2 {
//    ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(4);
    LinkedList adjList[] = new LinkedList[4] ;
    void createAdjLists(){
        for(int i = 0; i< 4; i++){
//            adjList.addEdges(new ArrayList<Integer>());
            adjList[i] = new LinkedList<Integer>();
        }
    }
    void addEdges(int i, int j){
        adjList[i].add(j);
        adjList[j].add(i);
    }
    void printAdjList(){
        System.out.println("The elements os lists is");
        for (int i = 0; i < adjList.length ; i++){
            System.out.println(i+ " ->" + adjList[i] );
        }
    }

    public static void main(String[] args) {
        GraphOpe2 g = new GraphOpe2();
        g.createAdjLists();
        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(0,3);
        g.addEdges(1,2);
//        g.addEdges(1,0);
//        g.addEdges(2,0);
//        g.addEdges(2,1);
//        g.addEdges(3,0);
        g.printAdjList();
    }
}
