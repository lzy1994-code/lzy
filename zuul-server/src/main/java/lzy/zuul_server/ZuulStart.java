package lzy.zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class ZuulStart {
    public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulStart.class, args);
	}

}