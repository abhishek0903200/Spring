package com.example.demo;

import com.example.loose.NotificationService;
import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext");
        GreetingService greetingService=
                (GreetingService) context.getBean("myBean");
        greetingService.sayHello();

        UserService userServiceEmail =
                (UserService) context.getBean("UserServiceSMS");
        userServiceEmail.notifyUser("WhatsUp");

        UserService userServiceSMS =
                (UserService) context.getBean("UserServiceSMS");
        userServiceSMS.notifyUser("WhatsUp Buddy");
    }
}


// maine ek class bnayi or mai chahte hu esko mai manage na kru
// toh application bean context file ki madad se maine ek bean bna di
// spring container ne bna di or phir usko application context me rakh dega
// application se fetch kro file ka name
// phir application context me se bean ko fetch kre
// phir bean ko call kre

// GreetingService service = nre GreetingService();
// is object ko hum manage krte h

// GreetingService greetingService=
//                (GreetingService) context.getBean("myBean");
//        greetingService.sayHello();

// lekin ye bean h

// jo context word likha h uska mtlb in IoC inversion of control ,
// jo object krne ka process h wo humne spring ko de diya esi liye esko IOC bolteh



