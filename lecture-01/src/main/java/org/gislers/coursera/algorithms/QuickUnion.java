package org.gislers.coursera.algorithms;

/**
 * Created by:   jgisle
 * Created date: 1/25/16
 */
public class QuickUnion {

    private int[] nodes;

    public QuickUnion( int n ) {
        nodes = new int[n];
        for( int i=0; i<n; i++ ) {
            nodes[i] = i;
        }
    }

    public int[] getNodes() {
        return nodes;
    }

    public void union( int a, int b ) {
        int i = getRoot(a);
        int j = getRoot(b);
        nodes[i] = j;
    }

    public boolean isConnected( int a, int b ) {
        return getRoot(a) == getRoot(b);
    }

    public int getRoot( int a ) {
        while( a != nodes[a] ) {
            a = nodes[a];
        }
        return a;
    }
}
