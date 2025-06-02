package Pertemuan11;

public class GraphMain {
  public static void main(String[] args) {
    Graph graph = new Graph(5);
    // menambahkan vertex
    // graph.addVertex('A'); // 0
    // graph.addVertex('B'); // 1
    // graph.addVertex('C'); // 2
    // graph.addVertex('D'); // 3
    // graph.addVertex('E'); // 4

    // // menambahkan ege
    // graph.addEdge(0, 1);
    // graph.addEdge(1, 2);
    // graph.addEdge(0, 3);
    // graph.addEdge(3, 4);
    // graph.adjacencyMatrix();
    // System.out.println();

    Graph graph2 = new Graph(4);
    graph2.addVertex('A'); // 0
    graph2.addVertex('B'); // 1
    graph2.addVertex('C'); // 2
    graph2.addVertex('D'); // 3

    graph2.addEdge(0, 1);
    graph2.addEdge(0, 2);
    graph2.addEdge(0, 3);
    graph2.addEdge(1, 3);
    graph2.adjacencyMatrix();
    System.out.println();
  }

}
