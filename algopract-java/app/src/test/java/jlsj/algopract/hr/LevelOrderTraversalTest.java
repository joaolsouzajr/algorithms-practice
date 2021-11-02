package jlsj.algopract.hr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LevelOrderTraversalTest {

    @Test
    public void shttouldCalcThelavelOrder() {
        //Given
        int n = 6;
        int[] data = {1, 2, 5, 3, 6, 4};
        int[] dataExpected = {1, 2, 5, 3, 6, 4};
        var lavelTransversal = new LevelOrderTraversal(n, data);

        //When
        var dataOrded = lavelTransversal.lavelOrder(lavelTransversal.getTree().getRoot());

        //Then
        Assertions.assertEquals("1 2 5 3 6 4 ", dataOrded);
    }

}
