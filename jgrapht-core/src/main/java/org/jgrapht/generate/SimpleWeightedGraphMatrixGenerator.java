package org.jgrapht.generate;


import org.jgrapht.VertexFactory;
import org.jgrapht.WeightedGraph;

import java.util.List;
import java.util.Map;

public class SimpleWeightedGraphMatrixGenerator<V, E> extends WeightedGraphGeneratorAdapter<V, E, V> {

    protected List<V> vertices;

    ///////////////////////////////////////////////////////////////////////////////////////////////

    public static int[] range(final int from, final int to) {
        int[] range = new int[to - from];
        for (int i=from; i < to; ++i) {
            range[i - from] = i;
        }
        return range;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    public SimpleWeightedGraphMatrixGenerator<V, E> vertices(List<V> vertices) {
        this.vertices = vertices;
        return this;
    }

    @Override
    public void generateGraph(WeightedGraph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap) {

      if (weights == null)
        throw new IllegalArgumentException("Graph may not be constructed without weight-matrix specified");

      if (vertices == null)
        throw new IllegalArgumentException("Graph may not be constructed without vertex-set specified");

      assert vertices.size() == weights.length;

      for (V vertex : vertices) {
        target.addVertex(vertex);
      }

      for (int i=0; i < vertices.size(); ++i) {

        assert vertices.size() == weights[i].length;

        for (int j=0; j < vertices.size(); ++j) {
          if (i != j) {
            target.setEdgeWeight(
              target.addEdge(vertices.get(i), vertices.get(j)),
              weights[i][j]
            );
          }
        }
      }

    }

}
