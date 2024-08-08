package beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;

public class mainBeanScope {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("beanScopes/beanScopes.xml");

        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("XXXXXX");
        Account accountSingleton2 = applicationContext.getBean("account1", Account.class);
        System.out.println("account1: " + accountSingleton2.getOwnerName());

        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("YYYYYYYYYYY");
        Account accountPrototype2 = applicationContext.getBean("account2", Account.class);
        System.out.println("account2: " + accountPrototype2.getOwnerName());
    }
}
