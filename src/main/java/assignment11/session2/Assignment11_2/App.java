package assignment11.session2.Assignment11_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
   	  @SuppressWarnings("resource")
      ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
   	  MyMessage obj =(MyMessage)ac.getBean("myMessage");
      obj.printMessage();
   }
}
