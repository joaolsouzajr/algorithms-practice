package jlsj.algopract.hr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {

    @Test
    public void shouldCreateTreeWith7Nodes() {
        //Given
        int n = 7;
        int[] data = {3, 5, 2, 1, 4, 6, 7};

        //When
        var tree = new BinaryTree(n, data);

        //Then
        assertEquals(3, tree.getRoot().data);
        assertEquals(2, tree.getRoot().left.data);
        assertEquals(1, tree.getRoot().left.left.data);
        assertEquals(5, tree.getRoot().right.data);
    }

}
