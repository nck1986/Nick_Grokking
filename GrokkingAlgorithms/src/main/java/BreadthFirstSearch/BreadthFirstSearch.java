package BreadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {

	private Map<String, List<String>> graph;
	private String personName;

	public BreadthFirstSearch() {
		graph = new HashMap<>();
	}

	public void addGraph(String name, List<String> friends) {
		graph.put(name, friends);
	}

	public void searchName(String name) {
		if (search(name)) {
			System.out.println("Mango seller is " + personName);
		} else {
			System.out.println("No seller found");
		}
	}

	private boolean search(String name) {
		Queue<String> searchQueue = new ArrayDeque<>();
		searchQueue.addAll(graph.get(name));

		Set<String> searched = new HashSet<>();

		while (!searchQueue.isEmpty()) {
			String person = searchQueue.poll();
			if (!searched.contains(person)) {
				if (isSeller(person)) {
					personName = person;
					return true;
				} else {
					searchQueue.addAll(graph.get(person));
					searched.add(person);
				}
			}
		}
		return false;
	}

	private boolean isSeller(String person) {
		return person.endsWith("m");
	}
}
