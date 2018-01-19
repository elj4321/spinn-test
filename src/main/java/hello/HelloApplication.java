package hello;

/**
 * Created by stblack on 7/20/17.
 */
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloApplication {
  public static void main(String[] args) {
      SpringApplication.run(HelloApplication.class, args);
  }

  @Bean
  public CommandLineRunner cmdLineRunner(ApplicationContext ctx) {
      return args -> {
          System.out.println("=========================================================");
          System.out.println("Alien probe of Spring Boot beans in application context");
          String[] beanNames = ctx.getBeanDefinitionNames();
          System.out.println("=========================================================");
          Arrays.sort(beanNames);
          for (String name : beanNames) {
              System.out.println(name);
          }
          System.out.println("Total number of beans: " + beanNames.length);
          System.out.println("=========================================================");
      };
  }
}
