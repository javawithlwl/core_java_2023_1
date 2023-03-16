package com.careeit.cbookserverapp.service.exception;

public class ContactNotFoundException extends  RuntimeException{

  private String errorCode;

  public ContactNotFoundException(String message,String errorCode){
    super(message);
    this.errorCode = errorCode;
  }
}
