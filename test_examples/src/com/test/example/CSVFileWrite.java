package com.test.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;


public class CSVFileWrite {
	public static void main(String[] args) {
		String csv = "output2.csv";
		CSVWriter writer = null;
		try {
			writer = new CSVWriter(new FileWriter(csv));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String[]> data = new ArrayList<String[]>();
		data.add(new String[] {"India", "New Delhi"});
		data.add(new String[] {"United States", "Washington D.C"});
		data.add(new String[] {"Germany", "Berlin"});

		writer.writeAll(data);

		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
