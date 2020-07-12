package com.jetbrains.crucible.ui.toolWindow.details;

import com.jetbrains.crucible.model.Comment;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * User: ktisha
 */

class CommentTreeNode extends DefaultMutableTreeNode {

  private static final long serialVersionUID = -5930488439576399319L;

  public Comment getComment() {
    return myComment;
  }

  private final Comment myComment;

  public CommentTreeNode(Comment comment) {
    myComment = comment;
  }
}
