package com.company.Learn_Java.algorithams;

public class GraphOpe {
   int vertices;
     boolean [][] adjMartix ;
    GraphOpe(int vertices){
        this.vertices = vertices;
        adjMartix = new boolean[vertices][vertices];
    }
     void addEdge(int i, int j){
        adjMartix[i][j] = true;
        adjMartix[j][i] = true;
    }
    void printAdjMatrix(){
        System.out.println("Adjacent matrix is  ");
        for(int i = 0 ;i < vertices; i++){
            for (int j = 0; j< vertices ;j++){
                if(adjMartix[i][j] == true) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphOpe g = new GraphOpe(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,0);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(3,0);
        g.printAdjMatrix();
    }
}
