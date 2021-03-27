package DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {

	private Map<String, Map<String, Double>> graph = new HashMap();
	private Map<String, Double> costs;
	private Map<String, String> parents;
	private List<String> processed;

	public DijkstrasAlgorithm() {
		costs = new HashMap<>();
		parents = new HashMap<>();
		processed = new ArrayList<>();
	}

	public void runDijkstrasAlgorithm() {
		if (graph.isEmpty() || parents.isEmpty() || costs.isEmpty()) {
			System.out.println("Graph or parents or costs is empty");
		} else {
			calcLowestCostFromSource();
		}
	}

	public Map<String, Map<String, Double>> getGraph() {
		return graph;
	}

	public void setGraph(Map<String, Map<String, Double>> graph) {
		this.graph = graph;
	}

	public void putGraph(String name, Map<String, Double> value) {
		graph.put(name, value);
	}

	public void putGraphNode(String name, String s, Double d) {
		graph.get(name).put(s, d);
	}

	public Map<String, Double> getCosts() {
		return costs;
	}

	public void setCosts(Map<String, Double> costs) {
		this.costs = costs;
	}

	public void putCosts(String key, Double value) {
		putMap(costs, key, value);
	}

	public Map<String, String> getParents() {
		return parents;
	}

	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}

	public void putParents(String s, String d) {
		putMap(parents, s, d);
	}

	private void putMap(Map<String, Double> map, String key, Double value) {
		map.put(key, value);
	}

	private void putMap(Map<String, String> map, String key, String value) {
		map.put(key, value);
	}

	private String findLowestCostNode(Map<String, Double> costs) {
		Double lowestCost = Double.POSITIVE_INFINITY;
		String lowestCostNode = null;

		for (Map.Entry<String, Double> node : costs.entrySet()) {
			Double cost = node.getValue();
			if (cost < lowestCost && !processed.contains(node.getKey())) {
				lowestCost = cost;
				lowestCostNode = node.getKey();
			}
		}

		return lowestCostNode;
	}

	private void calcLowestCostFromSource() {
		String node = findLowestCostNode(costs);
		while (node != null) {
			Double cost = costs.get(node);

			Map<String, Double> neighbors = graph.get(node);

			for (String n : neighbors.keySet()) {
				Double newCost = cost + neighbors.get(n);
				if (costs.get(n) > newCost) {
					putMap(costs, n, newCost);
					putMap(parents, n, node);
				}
			}

			processed.add(node);
			node = findLowestCostNode(costs);
		}
	}

	public void printCosts() {
		System.out.println(costs);
	}

}
