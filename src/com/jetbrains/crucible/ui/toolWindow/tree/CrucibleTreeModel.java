package com.jetbrains.crucible.ui.toolWindow.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * User: ktisha
 */
public class CrucibleTreeModel extends DefaultTreeModel {

  private static final long serialVersionUID = 5620411240137609373L;

  public CrucibleTreeModel() {
    super(new DefaultMutableTreeNode(), false);
  }
}
