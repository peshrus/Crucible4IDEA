
package com.jetbrains.crucible.ui.toolWindow.tree;

import com.intellij.ui.treeStructure.SimpleNode;
import com.jetbrains.crucible.model.CrucibleFilter;
import com.jetbrains.crucible.ui.toolWindow.CrucibleReviewModel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * User : ktisha
 */
public class CrucibleRootNode extends SimpleNode {
  private static final String NAME = "All My Reviews";
  private final CrucibleReviewModel myReviewModel;
  private final List<SimpleNode> myChildren = new ArrayList<>();

  public CrucibleRootNode(@NotNull final CrucibleReviewModel reviewModel) {
    myReviewModel = reviewModel;
    addChildren();
  }

  @NotNull
  public String toString() {
    return NAME;
  }

  @NotNull
  @Override
  public SimpleNode[] getChildren() {
    if (myChildren.isEmpty()) {
      addChildren();
    }
    return myChildren.toArray(new SimpleNode[0]);
  }

  private void addChildren() {
    for (CrucibleFilter filter : CrucibleFilter.values()) {
      myChildren.add(new CrucibleFilterNode(myReviewModel, filter));
    }
  }
}
