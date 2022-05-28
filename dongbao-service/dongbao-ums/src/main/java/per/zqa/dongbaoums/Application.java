package per.zqa.dongbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"per.zqa"})
@MapperScan("com.msb.dongbao.ums.mapper")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
