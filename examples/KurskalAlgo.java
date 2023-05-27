package com.company.Learn_Java.examples;

class Node {
    int vertices;
    //    int [] distance ;
    int[][] adjMatrix;
    boolean[] visited;

    Node(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        visited = new boolean[vertices];
//        distance = new int[vertices];
    }

    void addEdge(int i, int j, int w) {
        adjMatrix[i][j] = w;
        adjMatrix[j][i] = w;
    }

    void printAdjMatrix() {
        System.out.println("Adjacent matrix is  ");
        for (int i = 1; i < vertices; i++) {
            System.out.print(i + "--> ");
            for (int j = 1; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
//                    else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
public class KurskalAlgo {
    void findMST(){

    }
    public static void main(String[] args) {
        Node n = new Node(6);
        n.addEdge(1,2,1);
        n.addEdge(4,5,8);
        n.addEdge(2,5,6);
        n.addEdge(5,1,5);
        n.addEdge(3,5,4);
        n.addEdge(3,4,7);
        n.addEdge(2,3,2);
        n.printAdjMatrix();
    }
}
