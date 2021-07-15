import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean2.getMessage());
        System.out.println(bean==bean2);

        Cat cat = applicationContext.getBean("catBean", Cat.class);

        Cat cat2 = applicationContext.getBean("catBean", Cat.class);

        System.out.println(cat.getName());
        System.out.println(cat2.getName());
        System.out.println(cat==cat2);
    }
}