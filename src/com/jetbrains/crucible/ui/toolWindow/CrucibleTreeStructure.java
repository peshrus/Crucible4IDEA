package com.jetbrains.crucible.ui.toolWindow;

import com.intellij.ui.treeStructure.SimpleNode;
import com.intellij.ui.treeStructure.SimpleTreeStructure;
import org.jetbrains.annotations.NotNull;

/**
 * User: ktisha
 */

public class CrucibleTreeStructure extends SimpleTreeStructure {
  private final SimpleNode myRootElement;

  public CrucibleTreeStructure(@NotNull final SimpleNode root) {
    super();
    myRootElement = root;
  }

  @NotNull
  public SimpleNode getRootElement() {
    return myRootElement;
  }
}
