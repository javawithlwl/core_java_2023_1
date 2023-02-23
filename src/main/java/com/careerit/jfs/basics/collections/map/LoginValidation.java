package com.careerit.jfs.basics.collections.map;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class UserDetails{
    private String username;
    private String password;
}
class UserLoginService{

      private List<UserDetails> users;
      private Map<String,UserDetails> userMap;
      public UserLoginService(){
          users = new ArrayList<>();
          for(int i=1;i<=1000;i++){
              users.add(UserDetails.builder().username("user_"+i).password("password@"+i).build());
          }
          userMap = new HashMap<>();
          for(UserDetails user:users){
            userMap.put(user.getUsername(),user);
          }
      }
      public UserDetails login(String username,String password){
           UserDetails obj = userMap.get(username);
           if(obj!=null){
              if(obj.getPassword().equals(password)){
                  return obj;
              }
           }
           throw new IllegalArgumentException("Username/password wrong");
      }
}
public class LoginValidation {
  public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        service.login("satya@gmail.com","password@1");
  }
}
