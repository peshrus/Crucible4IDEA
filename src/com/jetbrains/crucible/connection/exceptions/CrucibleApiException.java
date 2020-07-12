package com.jetbrains.crucible.connection.exceptions;

/**
 * User : ktisha
 */
public class CrucibleApiException extends Exception {

  private static final long serialVersionUID = -7897185855353636259L;

  public CrucibleApiException(String message) {
    super(message);
  }

  public CrucibleApiException(String message, Throwable throwable) {
    super(message, throwable);
  }
}