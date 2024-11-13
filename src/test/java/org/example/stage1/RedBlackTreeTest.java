package org.example.stage1;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class RedBlackTreeTest {

    @Test
    void check() {

        RedBlackTree<Integer> tree = new RedBlackTree<>();
        for (int i = 0; i < 10; i++) {
            assertFalse(tree.contains(i));
            assertTrue(tree.add(i));
            assertTrue(tree.contains(i));
        }
        for (int i = 0; i < 10; i++) {
            assertTrue(tree.contains(i));
            assertTrue(tree.remove(i));
            assertFalse(tree.contains(i));
        }
    }

    @Test
    void check2(){
        Set<Integer> tree = new TreeSet<Integer>();

        for (int i = 0; i < 7; i++) {
            tree.add(i);
        }
        tree.add(7);

    }

    @Test
    void check3(){
        RedBlackTree<Integer> tree = new RedBlackTree<>();

        for (int i = 0; i < 7; i++) {
            tree.add(i);
        }
        tree.add(7);

    }
}