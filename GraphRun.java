//Wei
import java.util.Scanner;
//this program allow user to add vertex and edge vertex together to create graph
//allow user to do a bfs,dfs on the created graph

public class GraphRun {
	public static void main(String[] args) {
		try {
			System.out.println("Start Drawing :");
		
			System.out
					.println("'a' - add; 'e' - edge;  'p' - print,'d' - DFS, 'b' - BFS");
			Graph New1 = new Graph();
			Scanner scn = new Scanner(System.in);
			while (scn.hasNext()) {
				char cmd = scn.next().charAt(0);
				switch (cmd) {
				case 'p':
					New1.printAll();
					break;
				case 'a': {
					New1.addVertex(scn.next());
					break;
				}
				case 'b': {
					System.out.println("pick a vertex to start BFS");
					New1.bfs(scn.next());
					break;

				}
				case 'd': {
					System.out.println("pick a vertex to start DFS");
					New1.dfs(scn.next());
					break;
				}

				case 'e': {
					String from = scn.next();
					String to = scn.next();
					New1.addEdge(from, to);
					break;
				}


				default:
					System.out.println(" the defult case error in cmd");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("we have an error" + e);
		}
	}
}
