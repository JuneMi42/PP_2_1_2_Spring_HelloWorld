import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 = applicationContext.getBean("helloWorld", HelloWorld.class);
        System.out.println(beanHelloWorld1.getMessage());
        HelloWorld beanHelloWorld2 = applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanHelloWorld1 == beanHelloWorld2);
        System.out.println(catBean1 == catBean2);
    }
}