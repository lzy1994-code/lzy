package lzy.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaStart {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaStart.class, args);
	}

	
}
