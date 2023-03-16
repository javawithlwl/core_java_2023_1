package com.careeit.cbookserverapp.service.exception;

public class ContactAlreadyExistsException extends  RuntimeException{

      private String errorCode;

      public ContactAlreadyExistsException(String message,String errorCode){
          super(message);
          this.errorCode = errorCode;
      }


}
