package smartdeepwiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口。
 *
 * 放在最外层（interface 层），负责启动 Spring 容器，
 * 自动扫描下层模块的 Bean（Application、Infrastructure）。
 */
@SpringBootApplication(scanBasePackages = "smartdeepwiki")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
