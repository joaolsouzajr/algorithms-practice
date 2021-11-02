package jlsj.algopract;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LangFeatureTest {

    @Test
    public void useStreamToGenerateString() {
        //Given
        var data = Arrays.asList(1, 2, 3);

        //When
        var result = data.stream().map(i -> i + " ").collect(Collectors.joining());

        //Then
        Assertions.assertEquals("1 2 3 ", result);
    }

    @Test
    public void usingQueue() {
        //Given
        var data = Arrays.asList(1, 2, 3);


        //When
        Deque<Integer> queue = new LinkedList<>();
        for (var d : data) {
            queue.add(d);
        }

        //Then
        Assertions.assertEquals(1, queue.remove());
        Assertions.assertEquals(2, queue.remove());
        Assertions.assertEquals(3, queue.remove());
    }

    @Test
    public void usingStack() {
        //Given
        var data = Arrays.asList(1, 2, 3);


        //When
        Deque<Integer> queue = new LinkedList<>();
        for (var d : data) {
            queue.push(d);
        }

        //Then
        Assertions.assertEquals(3, queue.pop());
        Assertions.assertEquals(2, queue.pop());
        Assertions.assertEquals(1, queue.pop());
    }

//    @Test
//    public void usingStack2() {
//        //Given
//        var data = Arrays.asList('{', '[', '(');
//
//
//        //When
//        Deque<Character> queue = new LinkedList<>();
//        for (var d : data) {
//            queue.push(d);
//        }
//
//        //Then
//        Assertions.assertEquals(3, queue.pop());
//        Assertions.assertEquals(2, queue.pop());
//        Assertions.assertEquals(1, queue.pop());
//    }


}
