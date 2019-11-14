package com.test.lambda.stream;

import java.util.HashMap;
import java.util.Map;

public class LambdaEx3 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.merge("abc", 1, (count, incr) -> count + incr);
		map.merge("def", 1, Integer::sum);
		System.out.println(map);
	}
}
