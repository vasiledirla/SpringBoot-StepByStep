package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAutowireApplication implements CommandLineRunner {

    @Autowired
    private AutowiredService autowiredService;

    @Override
    public void run(String... args) {
        System.out.println("\n\n\n==============\n"+this.autowiredService.getDemoText()+"\n\n\n");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoAutowireApplication.class, args);
    }
}
