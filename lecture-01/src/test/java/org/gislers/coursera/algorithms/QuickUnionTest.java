package org.gislers.coursera.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by:   jgisle
 * Created date: 1/25/16
 */
public class QuickUnionTest {

    @Test
    public void testGetNodes() throws Exception {

        QuickUnion qu = new QuickUnion(10);
        int[] nodes = qu.getNodes();
        for( int i=0; i<nodes.length; i++) {
            assertEquals( i, nodes[i] );
        }
    }

    @Test
    public void testUnion() throws Exception {

        QuickUnion qu = new QuickUnion(10);
        qu.union( 2, 8 );
        qu.union( 4, 8 );
        qu.union( 8, 9 );

        int[] nodes = qu.getNodes();
        assertEquals( 8, nodes[2] );
        assertEquals( 8, nodes[4] );
        assertEquals( 9, nodes[8] );
    }

    @Test
    private void testGetRoot() throws Exception {

        QuickUnion qu = new QuickUnion(10);
        qu.union( 2, 8 );
        qu.union( 4, 8 );
        qu.union( 8, 9 );

        assertEquals( 9, qu.getRoot(2) );
        assertEquals( 9, qu.getRoot(4) );
        assertEquals( 9, qu.getRoot(8) );
    }
}