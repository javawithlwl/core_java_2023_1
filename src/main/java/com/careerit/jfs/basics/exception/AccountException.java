package com.careerit.jfs.basics.exception;
import java.util.StringJoiner;


public class AccountException extends  RuntimeException{
  private String errorCode;
  public AccountException(String message,String errorCode){
      super(message);
      this.errorCode = errorCode;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", AccountException.class.getSimpleName() + "[", "]")
        .add("errorCode='" + errorCode + "'")
        .add("message='" + super.getMessage()+ "'")
        .toString();
  }
}
