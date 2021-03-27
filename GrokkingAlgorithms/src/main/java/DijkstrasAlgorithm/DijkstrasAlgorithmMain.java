package DijkstrasAlgorithm;

import java.util.HashMap;

public class DijkstrasAlgorithmMain {
	public static void main(String[] args) {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm();

		d.putGraph("start", new HashMap<>());
		d.putGraphNode("start", "a", 6.0);
		d.putGraphNode("start", "b", 2.0);

		d.putGraph("a", new HashMap<>());
		d.putGraphNode("a", "fin", 1.0);

		d.putGraph("b", new HashMap<>());
		d.putGraphNode("b", "a", 3.0);
		d.putGraphNode("b", "fin", 5.0);

		d.putGraph("fin", new HashMap<>());

		d.putCosts("a", 6.0);
		d.putCosts("b", 2.0);
		d.putCosts("fin", Double.POSITIVE_INFINITY);

		d.putParents("a", "start");
		d.putParents("b", "start");
		d.putParents("fin", null);

		d.runDijkstrasAlgorithm();
		d.printCosts();

	}
}
