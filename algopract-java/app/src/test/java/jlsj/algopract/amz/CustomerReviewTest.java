package jlsj.algopract.amz;

import jlsj.algopract.hr.CustomerReview;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerReviewTest {

    @Test
    public void searchSuggestions_ShouldReturnEmptySuggestionsFromZeroOrOneCharOnQuery() {
        //Given
        List<String> repository = asList(
                "mobile", "mouse", "moneypot", "monitor", "mousepad"
        );
        var customerQuery = "m";
        var customerReview = new CustomerReview();

        //When
        List<List<String>> result = customerReview.searchSuggestions(repository, customerQuery);

        //Then
        assertEquals(1, result.size());
        assertTrue(result.get(0).isEmpty());
    }

    @Test
    public void searchSuggestions_ShouldReturnEmptySuggestionsFromNullQuery() {
        //Given
        String customerQuery = null;
        var customerReview = new CustomerReview();

        //When
        List<List<String>> result = customerReview.searchSuggestions(null, customerQuery);

        //Then
        assertEquals(1, result.size());
        assertTrue(result.get(0).isEmpty());
    }

    @Test
    public void searchSuggestions_ShouldReturnEmptySuggestionsFromEmptyQuery() {
        //Given
        var customerQuery = "";
        var customerReview = new CustomerReview();

        //When
        List<List<String>> result = customerReview.searchSuggestions(null, customerQuery);

        //Then
        assertEquals(1, result.size());
        assertTrue(result.get(0).isEmpty());
    }

    @Test
    public void searchSuggestions_ShouldReturnSuggestionsFromMinimalQuery() {
        //Given
        List<String> repository = asList(
                "mobile", "mouse", "moneypot", "monitor", "mousepad"
        );
        var customerQuery = "mo";
        var customerReview = new CustomerReview();

        //When
        List<List<String>> result = customerReview.searchSuggestions(repository, customerQuery);

        //Then
        assertLinesMatch(asList("mobile", "moneypot", "monitor"), result.get(0));
    }

    @Test
    public void searchSuggestions_ShouldReturnAllSuggestions() {
        //Given
        List<String> repository = asList(
                "mobile", "mouse", "moneypot", "monitor", "mousepad"
        );
        var customerQuery = "mouse";
        var customerReview = new CustomerReview();

        //When
        List<List<String>> result = customerReview.searchSuggestions(repository, customerQuery);

        //Then
        assertLinesMatch(asList("mobile", "moneypot", "monitor"), result.get(0));
        assertLinesMatch(asList("mouse", "mousepad"), result.get(1));
        assertLinesMatch(asList("mouse", "mousepad"), result.get(2));
        assertLinesMatch(asList("mouse", "mousepad"), result.get(3));

    }


}
