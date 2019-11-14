package com.reverse.str.buffer;

import java.io.*;
import java.lang.*;

public class PalindromeStrBuffer {
	public void check() throws IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("plz enter the sentence");
		String s = x.readLine();
		String w = "";
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w = w + c;
			else {
				StringBuffer s1 = new StringBuffer(w);
				StringBuffer s2 = new StringBuffer(w);
				s1 = s1.reverse();
				if (s1 == s2)
					System.out.println(s1);
				w = "";
			}
		}
	}
}
