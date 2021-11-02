package jlsj.algopract.hr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBracketsTest {

    @Test
    public void shouldChekTheBalancedString() {
        //Given
        var s1 = "{[()]}";
        var s2 = "{[(])}";
        var s3 = "{{[[(())]]}}";
        var balanced = new BalancedBrackets();

        //When
        var s1Result = balanced.isBalanced(s1);
        var s2Result = balanced.isBalanced(s2);
        var s3Result = balanced.isBalanced(s3);

        //Then
        Assertions.assertEquals("YES", s1Result);
        Assertions.assertEquals("NO", s2Result);
        Assertions.assertEquals("YES", s3Result);
    }

    @Test
    public void shouldChekTheBalancedString1() {
        //Given
        var s1 = "{{([])}}";
        var s2 = "{{)[](}}";
        var balanced = new BalancedBrackets();

        //When
        var s1Result = balanced.isBalanced(s1);
        var s2Result = balanced.isBalanced(s2);

        //Then
        Assertions.assertEquals("YES", s1Result);
        Assertions.assertEquals("NO", s2Result);
    }

    @Test
    public void shouldChekTheBalancedString2() {
        //Given
        var s1 = "{(([])[])[]}";
        var s2 = "{(([])[])[]]}";
        var s3 = "{(([])[])[]}[]";

        var balanced = new BalancedBrackets();

        //When
        var s1Result = balanced.isBalanced(s1);
        var s2Result = balanced.isBalanced(s2);
        var s3Result = balanced.isBalanced(s3);

        //Then
        Assertions.assertEquals("YES", s1Result);
        Assertions.assertEquals("NO", s2Result);
        Assertions.assertEquals("YES", s3Result);
    }
    @Test
    public void shouldChekTheBalancedStringNo() {
        //Given
        var s1 = "()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]";

        var balanced = new BalancedBrackets();

        //When
        var s1Result = balanced.isBalanced(s1);

        //Then
        Assertions.assertEquals("NO", s1Result);
    }

}
