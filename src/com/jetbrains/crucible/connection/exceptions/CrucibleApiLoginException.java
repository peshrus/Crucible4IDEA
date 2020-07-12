package com.jetbrains.crucible.connection.exceptions;

/**
 * User : ktisha
 */
public class CrucibleApiLoginException extends CrucibleApiException {

  private static final long serialVersionUID = 4200616100197800791L;

  public CrucibleApiLoginException(String message) {
    super(message);
  }

  public CrucibleApiLoginException(String message, Throwable throwable) {
    super(message, throwable);
  }
}