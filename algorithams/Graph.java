package com.company.Learn_Java.algorithams;

import java.util.*;

public class Graph {
    LinkedList adjList[] = new LinkedList[5] ;
    void createAdjLists(){
        for(int i = 0; i< 5; i++){
//            adjList.addEdges(new ArrayList<Integer>());
            adjList[i] = new LinkedList<Integer>();
        }
    }
    void addEdges(int i, int j){
        adjList[i].add(j);
        adjList[j].add(i);
    }
//    boolean [] visited = new boolean[5];
//    Stack<Integer> stack = new Stack<>();

    void traverseDFS(int startVertex){
        boolean[] visited = new boolean[5];
        Stack <Integer> stack  = new Stack<>();
        stack.push(startVertex);
        while(!stack.empty()){
            int currentVertex = stack.pop();
            if(!visited[currentVertex]){
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;
            }
            LinkedList<Integer> adjacentVertices = adjList[currentVertex];
            for (int adjacentVertex : adjacentVertices) {
                if (!visited[adjacentVertex]) {
                    stack.push(adjacentVertex);
                }
            }
        }
    }
    void traverseBFS(int startVertex){
        boolean[] visited = new boolean[5];
        Queue queue = new LinkedList();
        queue.add(startVertex);
        while(!queue.isEmpty()){
            int currentVertex = (int) queue.remove();
            if(!visited[currentVertex]){
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;
            }
            LinkedList<Integer> adjacentVertices = adjList[currentVertex];
            for (int adjacentVertex : adjacentVertices) {
                if (!visited[adjacentVertex]) {
                    queue.add(adjacentVertex);
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph();
        g.createAdjLists();
        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(0,3);
        g.addEdges(1,2);
        System.out.println("Depth-First Traversal (starting from vertex 0):");
        g.traverseDFS(0);
        System.out.println("\n-----------------------------------------");
        g.traverseDFS(1);
        System.out.println("\n-----------------------------------------");
        g.traverseDFS(2);
        System.out.println("\n-----------------------------------------");
        g.traverseDFS(3);
        System.out.println("\n---------------BFS--------------------------");
        g.traverseBFS(0);
        System.out.println("\n-----------------------------------------");
        g.traverseBFS(1);
        System.out.println("\n-----------------------------------------");
        g.traverseBFS(2);
        System.out.println("\n-----------------------------------------");
        g.traverseBFS(3);

    }
}
