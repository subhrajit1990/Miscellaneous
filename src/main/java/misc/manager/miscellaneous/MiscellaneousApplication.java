package misc.manager.miscellaneous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Troublem@ker
 */

@SpringBootApplication(scanBasePackages = "misc.manager.*")
@EnableJpaRepositories(basePackages = "misc.manager.*")
@ComponentScan(basePackages ="misc.manager.*")
@EntityScan(basePackages = "misc.manager.*")
@EnableSwagger2
public class MiscellaneousApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscellaneousApplication.class, args);
	}

}
