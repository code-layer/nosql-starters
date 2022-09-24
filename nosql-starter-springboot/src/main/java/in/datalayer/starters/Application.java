package in.datalayer.starters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "in.datalayer")
public class Application  {

    private CollegeService collegeService;

    public Application(CollegeService collegeService){
        this.collegeService = collegeService;
    }

    private static CollegeService cs;
    @PostConstruct
    private void init(){
        cs = collegeService;
    }


    public static void main(String[] args) {
        SpringApplication springApp = new SpringApplication(Application.class);
        ApplicationContext applicationContext = springApp.run(args);
        cs.displayAllDocuments();
    }

}