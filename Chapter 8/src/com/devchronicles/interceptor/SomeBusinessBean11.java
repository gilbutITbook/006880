package com.devchronicles.interceptor;
  
import java.util.logging.Logger;

  
@Secure
public class SomeBusinessBean11 {
  
    public void startService(){
          // 복잡한 비즈니스 로직
          Logger.getLogger("AppLog").info("완료...");
    }
   
    public void startAnotherService(){
          // 복잡한 비즈니스 로직
          Logger.getLogger("AppLog").info("도 완료...");
    }
}
   
