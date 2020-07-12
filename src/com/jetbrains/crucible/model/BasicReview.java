
package com.jetbrains.crucible.model;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User : ktisha
 */
public class BasicReview {
  private final Set<User> myReviewers = new HashSet<>();
  private final User myAuthor;
  private String myDescription;

  private final String myPermaId;
  private Date myCreateDate;
  private String myState;

  public BasicReview(@NotNull final String permaId, @NotNull final User author) {
    myPermaId = permaId;
    myAuthor = author;
  }

  @Override
  public String toString() {
    return myPermaId + "  " + myDescription + "  " + myState + "   " + myAuthor.getUserName();
  }

  public void setDescription(@NotNull final String description) {
    myDescription = description;
  }

  public void setState(@NotNull final String state) {
    myState = state;
  }

  public void addReviewer(@NotNull final User reviewer) {
    myReviewers.add(reviewer);
  }

  @NotNull
  public String getPermaId() {
    return myPermaId;
  }

  @NotNull
  public String getDescription() {
    return myDescription;
  }

  @NotNull
  public String getState() {
    return myState;
  }

  @NotNull
  public User getAuthor() {
    return myAuthor;
  }

  @NotNull
  public Date getCreateDate() {
    return myCreateDate;
  }

  public void setCreateDate(@NotNull final Date createDate) {
    myCreateDate = createDate;
  }

  @NotNull
  public Set<User> getReviewers() {
    return myReviewers;
  }

  public boolean isReviewer(User user) {
    return getReviewers().contains(user);
  }
}