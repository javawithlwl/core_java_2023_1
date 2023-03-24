package com.careerit.sc.di.sp;

import jakarta.inject.Provider;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
@Getter
public class UserService {

  //  private UserDao userDao;
//
//  @Lookup
//  public UserDao getUserDao() {
//    return null;
//  }
//    @Autowired
//    private Provider<UserDao> userDaoProvider;
//
//    public UserDao getUserDao(){
//      return userDaoProvider.get();
//    }
  @Autowired
  ApplicationContext context;
  @Autowired
  private UserDao userDao;

  public UserDao getUserDao() {
    return context.getBean(UserDao.class);
  }

}
