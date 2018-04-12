import java.util.*;

// Graph edges
class Edge
{
	int source, dest;

	public Edge(int source, int dest){
		this.source = source;
		this.dest = dest;
	}
};

// Graph object
class Graph
{
	
	List<List<Integer>> adjList = null;

	// Constructor
	Graph(List<Edge> edges, int N) {
		adjList = new ArrayList<>(N);

		for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}
		for (int i = 0; i < edges.size(); i++)
		{
			int src = edges.get(i).source;
			int dest = edges.get(i).dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}

class Solution
{
	public static void BFS(Graph graph, int s,boolean[] visited){
			 
		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
 
		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);
 
		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");
			
			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it  visited and enqueue it
			for (int u : graph.adjList.get(s)){
				if (!visited[u])
				{
					visited[u] = true;
					queue.add(u);
				}
			}
		}
	}
	public static void DFS(Graph graph, int v, boolean[] visited)
	{
		// mark current node as visited
		visited[v] = true;

		// print current node
		System.out.print(v + " ");

		// do for every edge (v -> u)
		for (int u : graph.adjList.get(v))
		{
			// u is not visited
			if (!visited[u]) {
				DFS(graph, u, visited);
			}
		}
	}

	public static void main(String[] args)
	{
		int nodes = 7;
		boolean[] visited = new boolean[nodes];
		List<Edge> edges = Arrays.asList(
				new Edge(0, 1),
				new Edge(0, 2),
				new Edge(1, 3),
				new Edge(1, 4),
				new Edge(1, 5),
				new Edge(2, 6)
		);
		Graph graph = new Graph(edges, nodes);
		DFS(graph,0,visited);
		Arrays.fill(visited,false);//reset visited array with false
		System.out.print("\n");
		BFS(graph,0,visited);
	}
}
