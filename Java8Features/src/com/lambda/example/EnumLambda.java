package com.lambda.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class EnumLambda {

	public enum Operation {
		PLUS("+", (x, y) -> x + y), MINUS("-", (x, y) -> x - y), TIMES("*", (x,
				y) -> x * y), DIVIDE("/", (x, y) -> x / y);
		private final String symbol;
		private final DoubleBinaryOperator op;

		Operation(String symbol, DoubleBinaryOperator op) {
			this.symbol = symbol;
			this.op = op;
		}

		@Override
		public String toString() {
			return symbol;
		}

		public double apply(double x, double y) {
			return op.applyAsDouble(x, y);
		}
	}
	
	public static void main(String[] args) {
		Operation [] op = Operation.values();
		for(Operation e: op) {
			System.out.println(e.apply(4, 2));
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.merge(2, 1, Integer::sum);
		System.out.println(map.merge(2, 1, Integer::sum));
	}

}
