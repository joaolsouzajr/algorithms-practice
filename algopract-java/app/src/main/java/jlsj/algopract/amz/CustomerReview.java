package jlsj.algopract.amz;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerReview {

    public List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

        List<List<String>> result = new ArrayList<>();

        final int MIN_QUERY_LENGTH = 2;
        final int MAX_RESULT_SIZE = 3;

        if (Objects.isNull(customerQuery) || customerQuery.length() < MIN_QUERY_LENGTH) {
            result.add(Collections.EMPTY_LIST);
            return result;
        }

        List<String> queries = new ArrayList<>();

        for (int i = 2; i <= customerQuery.length(); i++) {
            queries.add(customerQuery.substring(0, i).toLowerCase());
        }

        for (String query : queries) {
            List<String> subResult = repository.stream()
                    .map(String::toLowerCase)
                    .filter(s -> s.startsWith(query))
                    .sorted()
                    .limit(MAX_RESULT_SIZE)
                    .collect(Collectors.toList());
            result.add(subResult);
        }

        return result;
    }
}
