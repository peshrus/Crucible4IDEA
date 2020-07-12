package com.jetbrains.crucible.ui.toolWindow.details;

import com.intellij.openapi.project.Project;
import com.jetbrains.crucible.model.Comment;
import com.jetbrains.crucible.model.Review;
import org.jetbrains.annotations.NotNull;

/**
 * @author Kirill Likhodedov
 */
public abstract class CommentAction {

  @NotNull protected final Project myProject;
  @NotNull protected final Review myReview;
  @NotNull protected final Comment myComment;

  enum Type {
    PUBLISH {
      @SuppressWarnings("unchecked")
      @Override
      <T extends CommentAction> T createAction(@NotNull Project project, @NotNull Review review, @NotNull Comment comment) {
        return (T)new PublishCommentAction(project, review, comment);
      }
    };

    abstract <T extends CommentAction> T createAction(@NotNull Project project, @NotNull Review review, @NotNull Comment comment);
  }

  protected CommentAction(@NotNull Project project, @NotNull Review review, @NotNull Comment comment) {
    myProject = project;
    myReview = review;
    myComment = comment;
  }

  public abstract void execute(Runnable runnable);

}
