//Wei 
import java.util.Vector;

public class Vertex {
	public String name;
	public boolean wasVisited;// can also have a static "age" function for
								// marking
	Vector<Vertex> connection = new Vector<Vertex>();

	public Vertex(String m_name) {
		wasVisited = false;// not marked by default
		name = m_name;

	}

	void addLink(Vertex to) {
		connection.add(to); // save the link
	}

	public String toString() {
		return name;
	}

	public void printMe() {
		System.out.print("vertex " + name);
		System.out.println(connection);// print toString

	}

	void mark() {
		wasVisited = true;
	}

	public boolean marked() {
		return wasVisited;

	}

	public void runDFS() {
		// from the starting vertex mark it, and trace down each path and call
		// function to mark it as discover new vertex
		mark();
		System.out.println(" DFS visiting " + name);
		for (Vertex v : connection) {
			if (!v.marked()) {
				v.runDFS();
			} // end if
		}// end for
	}
}
