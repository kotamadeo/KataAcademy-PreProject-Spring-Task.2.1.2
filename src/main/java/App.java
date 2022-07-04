import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanFirst = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanThird = (Cat) applicationContext.getBean("cat");
        Cat beanFourth = (Cat) applicationContext.getBean("cat");
        System.out.printf("%s%n%s%n%s%n%s%n",
                beanFirst.getMessage(), beanSecond.getMessage(), beanThird.getMessage(), beanFourth.getMessage());
        System.out.println(beanFirst == beanSecond);
        System.out.println(beanThird == beanFourth);

    }
}