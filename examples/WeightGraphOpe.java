package com.company.Learn_Java.examples;

import com.company.Learn_Java.algorithams.GraphOpe;

public class WeightGraphOpe {
        int vertices;
        int [] distance ;
        int [][] adjMartix ;
        boolean []visited ;
        WeightGraphOpe(int vertices){
            this.vertices = vertices;
            adjMartix = new int[vertices][vertices];
            visited = new boolean[6];
            distance = new int[vertices];
        }
        void addEdge(int i, int j ,int w){
            adjMartix[i][j] = w;
            adjMartix[j][i] = w;
        }
        void printAdjMatrix(){
            System.out.println("Adjacent matrix is  ");
            for(int i = 0 ;i < vertices; i++){
                System.out.print(i+"--> ");
                for (int j = 0; j< vertices ;j++){
                     System.out.print(adjMartix[i][j]+ " ");
//                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        int findMinimum(boolean[] visited,int[] distance) {
            int min_value = 0;
            for(int i=0;i<visited.length;i++)
            {
                if(visited[i] != false && distance[i]<distance[min_value])
                {
                    min_value = i;
                }
            }
            return min_value;
        }
    static int selectMinVertex(int value[],boolean visited[])
    {
        int vertex=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<value.length; i++)
        {
            if(visited[i]==false && value[i]<min)
            {
                vertex=i;
                min=value[i];
            }
        }
        return vertex;
    }

        void findMST(WeightGraphOpe g){
            int size = g.adjMartix.length;
            int []parent = new int[size];
            int [] value = new int[size];
            boolean []visited = new boolean[size];
            for(int i = 0; i< size; i++){
                value[i] = Integer.MAX_VALUE;
                parent[i]= -1;
            }
            value[0] = 0;
            for (int i=0;i < size ; i++){
                int u = selectMinVertex(value,visited);
                visited[u] = true;
                for(int j = 0; j< size; j++){
                    if(g.adjMartix[u][j] != 0 && visited[j] == false && g.adjMartix[u][j] < value[j]){
                        value[j] = g.adjMartix[u][j];
                        parent[j] =u;
                    }
                }
            }
            for(int i =1; i< size; i++){
                System.out.println("u-->v : "+parent[i] + " --> "+ i+ " wt : "+ g.adjMartix[parent[i]][i]);
            }
        }


    public static void main(String[] args) {
            WeightGraphOpe w = new WeightGraphOpe(6);
            w.addEdge(0,1,4);
            w.addEdge(0,2,6);
            w.addEdge(1,2,6);
            w.addEdge(1,3,3);
            w.addEdge(1,4,4);
            w.addEdge(2,3,1);
            w.addEdge(2,0,6);
            w.addEdge(3,5,3);
            w.addEdge(3,4,2);
            w.addEdge(4,5,7);
            w.printAdjMatrix();
            System.out.println(w.findMinimum(w.visited,w.distance));
            w.findMST(w);
        }
    }


