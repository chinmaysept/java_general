package com.test.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

	public class AllCombinations {
	    public static void main(final String... args) {
	        for (final List<Integer> option : divide(5, 3)) {
	            System.out.printf("%d for kid_A, %d for kid_B, %d for kid_3%n", option.toArray());
	        }
	    }

	    private static List<List<Integer>> divide(final int count, final int groups) {
	        if (groups == 1) {
	            final List<Integer> inner = new ArrayList<>(1);
	            inner.add(count);
	            final List<List<Integer>> outer = new ArrayList<>(1);
	            outer.add(inner);
	            return outer;
	        }
	        List<Object> li = IntStream.range(0, count + 1)
	            .mapToObj(Integer::valueOf)
	            .flatMap(p -> {
	                return divide(count - p, groups - 1).stream()
	                    .map(q -> {
	                        q.add(p);
	                        return q;
	                    });
	            }).collect(Collectors.toList());
	        
	        return null;
	    }

}
