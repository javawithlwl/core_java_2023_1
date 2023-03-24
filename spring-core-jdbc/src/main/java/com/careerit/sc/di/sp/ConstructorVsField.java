package com.careerit.sc.di.sp;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Getter
class EmployeeService{
      private AccountService accountService;
      @Autowired(required = false)
      public EmployeeService(AccountService accountService){
          this.accountService = accountService;
      }
}
@Component
class AccountService{

}

@ComponentScan(basePackages = {"com.careerit.sc.di.sp"})
public class ConstructorVsField {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(ConstructorVsField.class);
    EmployeeService obj = context.getBean(EmployeeService.class);
    System.out.println(obj.getAccountService());
  }
}
