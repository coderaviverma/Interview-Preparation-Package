package language.java.datastructure.graph.cycleindirectedgraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private final int V;
    private final List<List<Integer>> adj;


    public Graph(int v) {
        V = v;
        adj=new ArrayList<>(V);

        for (int i=0;i<V;i++){
            adj.add(new LinkedList<>());
        }
    }


    private boolean isCyclicUtil(int i,boolean[] visited,boolean[] restack){

        if (restack[i]) return false;

        if (visited[i]) return false;

        restack[i]=true;

        visited[i]=true;


        List<Integer> children=adj.get(i);

        for (Integer c:children){

            if (isCyclicUtil(c,visited,restack)) return true;
        }

        restack[i]=false;

        return false;

    }


    private void addEdge(int source,int destination){
        adj.get(source).add(destination);
    }

    private boolean isCyclic(){
        boolean[] visited=new boolean[V];
        boolean[] restack=new boolean[V];

        for (int i=0;i<V;i++){

            if (isCyclicUtil(i,visited,restack)) return true;
        }

        return false;
    }


    public static void main(String[] args) {

        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");

    }
}
