//Wei 
//import java.util.Vector;
import java.util.Hashtable;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
	// Vector<Vertex> allVertex = new Vector<Vertex>();
	Hashtable<String, Vertex> allVertex = new Hashtable<String, Vertex>();
	Queue<Vertex> q = new LinkedList<Vertex>();

	public void addVertex(String vertexName) {
		System.out.println("is adding :" + vertexName);
		Vertex ver = new Vertex(vertexName);
		System.out.println(" is here after creating vertex" + ver.toString());
		// allVertex.add(ver);
		allVertex.put(vertexName, ver);// put vertex in hashtable allVertex

	}

	public void addEdge(String vertexFrom, String vertexTo) {
		System.out.println("Draw edge from :" + vertexFrom + " to:" + vertexTo);
		Vertex vfrom = allVertex.get(vertexFrom);
		Vertex vto = allVertex.get(vertexTo); // look up name, find
												// corresponding Vertex object
		vfrom.addLink(vto);
		// vto.addLink(vfrom);//indirect
	}

	public void printAll() {
		System.out.println("is in printall");
		for (Vertex n : allVertex.values()) {
			n.printMe();
		}
	}

	public void dfs(String startVertex) {
		Vertex toStart = allVertex.get(startVertex);
		System.out.println("start DFS at" + toStart.toString());
		toStart.runDFS();// it will mark the starting vertex
		System.out.println(" dfs is done");

	}

	public void bfs(String startVertexB) {
		Vertex toStartB = allVertex.get(startVertexB);
		System.out.println("start BFS at" + toStartB.toString());
		q.add(toStartB);
		toStartB.mark();
		while (!q.isEmpty()) {// until the q empty
			Vertex n = q.poll();// remove the head of q
			System.out.println(n.name + " ");
			for (Vertex abj : n.connection) {// get all the connection,mark
												// everyone
				if (!abj.marked()) {// if is not mark
					abj.mark();// mark it
					q.add(abj);// add to q
				}
			}
		}
		System.out.println("BFS is done");
	}

	// public void topo() {
	// }

}
