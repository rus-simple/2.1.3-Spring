import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getCat());

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getCat());

        System.out.println("bean == bean2: " + (bean == bean2));
        System.out.println("cat == cat2: " + (cat == cat2));

    }
}