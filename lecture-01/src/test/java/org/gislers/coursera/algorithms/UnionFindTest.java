package org.gislers.coursera.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by:   jgisle
 * Created date: 1/25/16
 */
public class UnionFindTest {

    @Test
    public void testGetNodes() throws Exception {

        UnionFind uf = new UnionFind(10);
        int[] nodes = uf.getNodes();
        for( int i=0; i<nodes.length; i++) {
            assertEquals( i, nodes[i] );
        }
    }

    @Test
    public void testIsConnected() throws Exception {
        UnionFind uf = new UnionFind(10);
        assertFalse( uf.isConnected(2, 8) );

        uf.union( 2, 8 );
        assertTrue( uf.isConnected(2, 8) );
    }

    @Test
    public void testUnion() throws Exception {

        UnionFind uf = new UnionFind(10);
        assertFalse( uf.isConnected(2, 5) );

        uf.union( 2, 5 );
        assertTrue( uf.isConnected(2, 5) );
        assertFalse( uf.isConnected(1, 9) );
    }
}