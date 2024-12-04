import java.util.ArrayList;
import java.util.List;

public class CyclomaticComplexitySimplified {
    public static void main(String[] args) {
        int nodes = 8;

        List<int[]> edges = new ArrayList<>();
        edges.add(new int[]{1, 2});
        edges.add(new int[]{2, 3});
        edges.add(new int[]{3, 4});
        edges.add(new int[]{4, 5});
        edges.add(new int[]{5, 6});
        edges.add(new int[]{5, 7});
        edges.add(new int[]{7, 4}); 
        edges.add(new int[]{7, 8});

        int edgesCount = edges.size();

        int connectedComponents = 1;

        int cyclomaticComplexity = edgesCount - nodes + 2 * connectedComponents;

        System.out.println("Цикломатическая сложность программы: " + cyclomaticComplexity);
    }
}
