package org.gislers.coursera.algorithms;

/**
 * Created by:   jgisle
 * Created date: 1/25/16
 */
public class UnionFind {

    private int[] nodes;

    public UnionFind( int n ) {
        nodes = new int[n];
        for( int i=0; i<n; i++ ) {
            nodes[i] = i;
        }
    }

    public int[] getNodes() {
        return nodes;
    }

    public boolean isConnected(int a, int b ) {
        return nodes[a] == nodes[b];
    }

    public void union( int a, int b ) {
        int idA = nodes[a];
        int idB = nodes[b];

        for( int i=0; i<nodes.length; i++ ) {
            if( nodes[i] == idA ) {
                nodes[i] = idB;
            }
        }
    }
}
