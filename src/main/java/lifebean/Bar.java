package lifebean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Bar {
    @PostConstruct
    public void init () throws Exception{
        System.out.println("Init method is called");
    }
    @PreDestroy
    public void destroy() throws RuntimeException{
        System.out.println("destroy method is called");
    }
}
