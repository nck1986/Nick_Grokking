package BreadthFirstSearch;

import java.util.Arrays;
import java.util.Collections;

public class BreadthFirstSearchMain {
	public static void main(String[] args) {
		BreadthFirstSearch graph = new BreadthFirstSearch();
		graph.addGraph("you", Arrays.asList("alice", "bob", "claire"));
		graph.addGraph("bob", Arrays.asList("anuj", "peggy"));
		graph.addGraph("alice", Arrays.asList("peggy"));
		graph.addGraph("claire", Arrays.asList("thom", "jonny"));
		graph.addGraph("anuj", Collections.emptyList());
		graph.addGraph("peggy", Collections.emptyList());
		graph.addGraph("thom", Collections.emptyList());
		graph.addGraph("jonny", Collections.emptyList());

		graph.searchName("you");
		graph.searchName("alice");
	}
}
