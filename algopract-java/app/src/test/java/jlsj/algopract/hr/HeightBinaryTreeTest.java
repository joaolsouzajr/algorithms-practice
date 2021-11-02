package jlsj.algopract.hr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightBinaryTreeTest {

    @Test
    public void shouldCalcTheHeightOfTreeWith7Nodes() {
        //Given
        int n = 7;
        int[] data = {3, 5, 2, 1, 4, 6, 7};

        //When
        var heightBtree = new HeightBinaryTree(n, data);
        var height = heightBtree.height(heightBtree.getTree().getRoot());

        //Then
        assertEquals(3, height);
    }

    @Test
    public void shouldCalcTheHeightOfTreeWith1Node() {
        //Given
        int n = 1;
        int[] data = {15};

        //When
        var heightBtree = new HeightBinaryTree(n, data);
        var height = heightBtree.height(heightBtree.getTree().getRoot());

        //Then
        assertEquals(0, height);
    }

    @Test
    public void shouldCalcTheHeightOfTreeWith5Nodes() {
        //Given
        int n = 5;
        int[] data = {3, 1, 7, 5, 4};

        //When
        var heightBtree = new HeightBinaryTree(n, data);
        var height = heightBtree.height(heightBtree.getTree().getRoot());

        //Then
        assertEquals(3, height);
    }

}
