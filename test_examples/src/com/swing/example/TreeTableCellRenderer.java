/*package com.swing.example;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeTableCellRenderer extends JTree implements TableCellRenderer {
*//** Last table/tree row asked to renderer. *//*
protected int visibleRow;

public TreeTableCellRenderer(TreeModel model) {
super(model);
}

*//**
* updateUI is overridden to set the colors of the Tree's renderer
* to match that of the table.
*//*
public void updateUI() {
super.updateUI();
// Make the tree's cell renderer use the table's cell selection
// colors.
TreeCellRenderer tcr = getCellRenderer();
if (tcr instanceof DefaultTreeCellRenderer) {
DefaultTreeCellRenderer dtcr = ((DefaultTreeCellRenderer)tcr);
// For 1.1 uncomment this, 1.2 has a bug that will cause an
// exception to be thrown if the border selection color is
// null.
// dtcr.setBorderSelectionColor(null);
dtcr.setTextSelectionColor(UIManager.getColor
          ("Table.selectionForeground"));
dtcr.setBackgroundSelectionColor(UIManager.getColor
           ("Table.selectionBackground"));
}
}

*//**
* Sets the row height of the tree, and forwards the row height to
* the table.
*//*
public void setRowHeight(int rowHeight) {
if (rowHeight > 0) {
super.setRowHeight(rowHeight);
if (JTreeTable.this != null &&
JTreeTable.this.getRowHeight() != rowHeight) {
JTreeTable.this.setRowHeight(getRowHeight());
}
}
}

*//**
* This is overridden to set the height to match that of the JTable.
*//*
public void setBounds(int x, int y, int w, int h) {
super.setBounds(x, 0, w, JTreeTable.this.getHeight());
}

*//**
* Sublcassed to translate the graphics such that the last visible
* row will be drawn at 0,0.
*//*
public void paint(Graphics g) {
g.translate(0, -visibleRow * getRowHeight());
super.paint(g);
}

*//**
* TreeCellRenderer method. Overridden to update the visible row.
*//*
public Component getTableCellRendererComponent(JTable table,
                  Object value,
                  boolean isSelected,
                  boolean hasFocus,
                  int row, int column) {
if(isSelected)
setBackground(table.getSelectionBackground());
else
setBackground(table.getBackground());

visibleRow = row;
return this;
}
}


*//**
* TreeTableCellEditor implementation. Component returned is the
* JTree.
*//*
class TreeTableCellEditor extends AbstractCellEditor implements
TableCellEditor {
public Component getTableCellEditorComponent(JTable table,
                Object value,
                boolean isSelected,
                int r, int c) {
return tree;
}

*//**
* Overridden to return false, and if the event is a mouse event
* it is forwarded to the tree.<p>
* The behavior for this is debatable, and should really be offered
* as a property. By returning false, all keyboard actions are
* implemented in terms of the table. By returning true, the
* tree would get a chance to do something with the keyboard
* events. For the most part this is ok. But for certain keys,
* such as left/right, the tree will expand/collapse where as
* the table focus should really move to a different column. Page
* up/down should also be implemented in terms of the table.
* By returning false this also has the added benefit that clicking
* outside of the bounds of the tree node, but still in the tree
* column will select the row, whereas if this returned true
* that wouldn't be the case.
* <p>By returning false we are also enforcing the policy that
* the tree will never be editable (at least by a key sequence).
*//*
public boolean isCellEditable(EventObject e) {
if (e instanceof MouseEvent) {
for (int counter = getColumnCount() - 1; counter >= 0;
counter--) {
if (getColumnClass(counter) == TreeTableModel.class) {
MouseEvent me = (MouseEvent)e;
MouseEvent newME = new MouseEvent(tree, me.getID(),
      me.getWhen(), me.getModifiers(),
      me.getX() - getCellRect(0, counter, true).x,
      me.getY(), me.getClickCount(),
                      me.isPopupTrigger());
tree.dispatchEvent(newME);
break;
}
}
}
return false;
}

public Object getCellEditorValue() {
// TODO Auto-generated method stub
return null;
}
}


*//**
* ListToTreeSelectionModelWrapper extends DefaultTreeSelectionModel
* to listen for changes in the ListSelectionModel it maintains. Once
* a change in the ListSelectionModel happens, the paths are updated
* in the DefaultTreeSelectionModel.
*//*
class ListToTreeSelectionModelWrapper extends DefaultTreeSelectionModel {
*//** Set to true when we are updating the ListSelectionModel. *//*
protected boolean         updatingListSelectionModel;

public ListToTreeSelectionModelWrapper() {
super();
getListSelectionModel().addListSelectionListener
                   (createListSelectionListener());
}

*//**
* Returns the list selection model. ListToTreeSelectionModelWrapper
* listens for changes to this model and updates the selected paths
* accordingly.
*//*
ListSelectionModel getListSelectionModel() {
return listSelectionModel;
}

*//**
* This is overridden to set <code>updatingListSelectionModel</code>
* and message super. This is the only place DefaultTreeSelectionModel
* alters the ListSelectionModel.
*//*
public void resetRowSelection() {
if(!updatingListSelectionModel) {
updatingListSelectionModel = true;
try {
super.resetRowSelection();
}
finally {
updatingListSelectionModel = false;
}
}
// Notice how we don't message super if
// updatingListSelectionModel is true. If
// updatingListSelectionModel is true, it implies the
// ListSelectionModel has already been updated and the
// paths are the only thing that needs to be updated.
}

*//**
* Creates and returns an instance of ListSelectionHandler.
*//*
protected ListSelectionListener createListSelectionListener() {
return new ListSelectionHandler();
}

*//**
* If <code>updatingListSelectionModel</code> is false, this will
* reset the selected paths from the selected rows in the list
* selection model.
*//*
protected void updateSelectedPathsFromSelectedRows() {
if(!updatingListSelectionModel) {
updatingListSelectionModel = true;
try {
// This is way expensive, ListSelectionModel needs an
// enumerator for iterating.
int        min = listSelectionModel.getMinSelectionIndex();
int        max = listSelectionModel.getMaxSelectionIndex();

clearSelection();
if(min != -1 && max != -1) {
for(int counter = min; counter <= max; counter++) {
   if(listSelectionModel.isSelectedIndex(counter)) {
   TreePath     selPath = tree.getPathForRow
                               (counter);

   if(selPath != null) {
       addSelectionPath(selPath);
   }
   }
}
}
}
finally {
updatingListSelectionModel = false;
}
}
}

*//**
* Class responsible for calling updateSelectedPathsFromSelectedRows
* when the selection of the list changse.
*//*
class ListSelectionHandler implements ListSelectionListener {
public void valueChanged(ListSelectionEvent e) {
updateSelectedPathsFromSelectedRows();
}
}
}
}
*/