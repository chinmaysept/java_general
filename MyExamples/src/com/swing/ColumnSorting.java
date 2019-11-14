package com.swing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ColumnSorting {
  public static void main(String[] argv) throws Exception {
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);
    table.setAutoCreateColumnsFromModel(false);

    boolean ascending = false;
    Vector data = model.getDataVector();
    Object[] colData = new Object[model.getRowCount()];

    for (int i = 0; i < colData.length; i++) {
      colData[i] = ((Vector) data.get(i)).get(0);
    }
    Arrays.sort(colData, new ColumnSorter());
    for (int i = 0; i < colData.length; i++) {
      ((Vector) data.get(i)).set(0, colData[i]);
    }
    model.fireTableStructureChanged();
  }
}
