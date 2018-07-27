package xyz.huanghongbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("xyz.huanghongbo.Dao")
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@ConfigurationProperties(prefix="spring.datasource")
public class Application {

    public static void main(String[] args) {
        // http://localhost:8080/
        SpringApplication.run(Application.class, args);
    }
}
